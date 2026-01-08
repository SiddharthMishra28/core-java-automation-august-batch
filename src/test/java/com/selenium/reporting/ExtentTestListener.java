package com.selenium.reporting;

import org.testng.*;

public class ExtentTestListener implements ITestListener, ISuiteListener, IConfigurationListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start Block..");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success Block..");
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("On Start Block..");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("On Finish Block");
    }

    @Override
    public void onConfigurationSuccess(ITestResult tr) {

    }

    @Override
    public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void onConfigurationFailure(ITestResult tr) {

    }

    @Override
    public void onConfigurationFailure(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void onConfigurationSkip(ITestResult tr) {

    }

    @Override
    public void onConfigurationSkip(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void beforeConfiguration(ITestResult tr) {

    }

    @Override
    public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void onStart(ISuite suite) {
        ExtentTestManager.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentTestManager.publishReport();
    }
}
