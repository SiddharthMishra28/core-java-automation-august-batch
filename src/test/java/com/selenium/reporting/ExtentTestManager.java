package com.selenium.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestManager {

    public static ExtentReports reports = new ExtentReports();
    public static ExtentSparkReporter spark = new ExtentSparkReporter("target/Report.html");

    public static void initReport() {
        reports.attachReporter(spark);
    }

    public static void publishReport() {
        reports.flush();
    }
}
