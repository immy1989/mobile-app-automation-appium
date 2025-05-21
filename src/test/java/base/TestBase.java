package base;

import listeners.TestListener;
import utils.ExtentReportManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {
    
    @BeforeSuite
    public void beforeSuite() {
        ExtentReportManager.initReport();
    }
    
    @AfterSuite
    public void afterSuite() {
        ExtentReportManager.flushReport();
    }
    
    @BeforeMethod
    public void setUp() {
        DriverManager.initializeDriver();
    }
    
    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}