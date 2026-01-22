package com.selenium.bdd.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.selenium.bdd.lifecycle.Hooks;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ReportListener implements ConcurrentEventListener {

    public static ExtentReports extent;
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>(); // TO AVOID ISSUE IN MULTITHREADED ENV

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, this::onRunStart);
        eventPublisher.registerHandlerFor(TestRunFinished.class, this::onRunFinish);
        eventPublisher.registerHandlerFor(TestCaseStarted.class, this::onTestCaseStart);
        eventPublisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinish);
        eventPublisher.registerHandlerFor(TestStepFinished.class, this::onTestStepFinish);
    }

    @Override
    public void setEventPublisher(EventPublisher publisher, boolean isMultiThreaded) {
        setEventPublisher(publisher);
    }

    public void onRunStart(TestRunStarted event) {
        extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/report/run-report.html");
        extent.attachReporter(sparkReporter);
    }

    public void onRunFinish(TestRunFinished event) {
        if(extent != null) {
            extent.flush();
        }
    }

    public void onTestCaseStart(TestCaseStarted event) {
        ExtentTest extentTest = extent.createTest(event.getTestCase().getName());
        test.set(extentTest);
    }

    public void onTestCaseFinish(TestCaseFinished event) {
        if(test.get() != null) {
            test.get().log(Status.INFO, "Test Case "+event.getTestCase().getName()+ " Finished Executing");
        }
    }

    public void onTestStepFinish(TestStepFinished event) {
        ExtentTest extentTest = test.get();
        if(extentTest != null) {
            if(event.getResult().getStatus().name().equals("PASSED")) {
                extentTest.log(Status.PASS, "Test Step "+event.getTestStep().getCodeLocation()+" PASSED");
            } else if (event.getResult().getStatus().name().equals("FAILED")) {
                extentTest.log(Status.FAIL, "Test Case "+event.getResult().getError());
                String screenshotPath = takeScreenshot(event.getTestCase().getName());
                if(screenshotPath != null) {
                    try{
                        extentTest.fail("Screenshot on failure ", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
                    }catch (Exception e) {
                        extentTest.fail("Failed to Attach Screenshot " + e.getMessage());
                    }
                }
            } else if (event.getResult().getStatus().name().equals("SKIPPED")) {
                extentTest.log(Status.SKIP, "Test Case "+event.getTestStep().getCodeLocation()+ " was skipped");
            }
        }
    }

    public String takeScreenshot(String testName) {
        try{
            if(Hooks.driver instanceof TakesScreenshot) {
                TakesScreenshot screenshot = (TakesScreenshot) Hooks.driver;
                byte[] screenshotBytes = screenshot.getScreenshotAs(OutputType.BYTES);
                String timeStamp = LocalTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                String fileName = testName.replaceAll("[^a-zA-Z0-9]", "_") + "_" + timeStamp + ".png";
                String dir = "target/screenshots/";
                new File(dir).mkdirs();
                String filePath = dir + fileName;
                Files.write(Paths.get(filePath), screenshotBytes);
                return filePath;
            }
        } catch (Exception e) {
            System.err.println("Failed To Take Screenshot "+e.getMessage());
        }
        return null;
    }

}
