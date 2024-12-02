////package listeners;
////
////import org.testng.ITestContext;
////import org.testng.ITestListener;
////import org.testng.ITestResult;
////
////import com.aventstack.extentreports.ExtentReports;
////import com.aventstack.extentreports.ExtentTest;
////import com.aventstack.extentreports.Status;
////import com.aventstack.extentreports.reporter.ExtentSparkReporter;
////
////public class ExtentTestNGReportListener implements ITestListener {
////
////    private static ExtentReports extent = createInstance();
////    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
////
////    private static ExtentReports createInstance() {
////        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-reports/ExtentReport.html");
////        sparkReporter.config().setReportName("Test Report");
////        sparkReporter.config().setDocumentTitle("Extent Reports");
////
////        ExtentReports extent = new ExtentReports();
////        extent.attachReporter(sparkReporter);
////        return extent;
////    }
////
////    @Override
////    public void onTestStart(ITestResult result) {
////        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
////        test.set(extentTest);
////    }
////
////    @Override
////    public void onTestSuccess(ITestResult result) {
////        test.get().log(Status.PASS, "Test Passed");
////    }
////
////    @Override
////    public void onTestFailure(ITestResult result) {
////        test.get().log(Status.FAIL, "Test Failed");
////        test.get().log(Status.FAIL, result.getThrowable());
////    }
////
////    @Override
////    public void onTestSkipped(ITestResult result) {
////        test.get().log(Status.SKIP, "Test Skipped");
////    }
////
////    @Override
////    public void onFinish(ITestContext context) {
////        extent.flush();
////    }
////}
//
//
//package listeners;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentTestNGReportListener implements ITestListener {
//
//    private static ExtentReports extent = createInstance();
//    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//
//    private static ExtentReports createInstance() {
//        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-reports/ExtentReport.html");
//        sparkReporter.config().setReportName("Test Report");
//        sparkReporter.config().setDocumentTitle("Extent Reports");
//
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//        return extent;
//    }
//
//    @Override
//    public void onTestStart(ITestResult result) {
//        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
//        test.set(extentTest);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        test.get().log(Status.PASS, "Test Passed");
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        test.get().log(Status.FAIL, "Test Failed");
//        test.get().log(Status.FAIL, result.getThrowable());
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        test.get().log(Status.SKIP, "Test Skipped");
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        extent.flush();
//    }
//}

// listeners/ExtentTestNGReportListener.java
package listeners;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.ScreenshotUtils;

public class ExtentTestNGReportListener implements ITestListener {

    private static ExtentReports extent = createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private WebDriver driver;

    private static ExtentReports createInstance() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-reports/ExtentReport.html");
        sparkReporter.config().setReportName("Test Report");
        sparkReporter.config().setDocumentTitle("Extent Reports");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
        // Initialize WebDriver instance for screenshot capture
        driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
        String screenshotPath = "D:\\Automation\\QA_CleverGround\\screenshots"+ result.getMethod().getMethodName() + ".png";
        ScreenshotUtils.takeScreenshot(driver, screenshotPath);
        test.get().addScreenCaptureFromPath(screenshotPath);
    }

   /* @Override
   public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test Failed");
        test.get().log(Status.FAIL, result.getThrowable());
        String screenshotPath = System.getProperty("user.dir")+  result.getMethod().getMethodName() + ".png";
        ScreenshotUtils.takeScreenshot(driver, screenshotPath);
        test.get().addScreenCaptureFromPath(screenshotPath);
    }*/

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
