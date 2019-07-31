package TestCases;

/*import java.awt.AWTException;*/
import java.io.File;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Pause;*/
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
/*import org.testng.annotations.Listeners;*/
import org.testng.annotations.Test;
import org.testng.Assert;
/*import org.testng.Assert;*/
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import VariablesAndFunctions.*;

public class ExtentReportLogin extends VariablesandElements {

	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	Timer pause = new Timer();

	@BeforeTest

	public void BeforeTest() {
		
		ExtentFunctions delete = new ExtentFunctions();   //delete existing extent-report 
		delete.DeleteExtentReport();
		
		report = ExtentFunctions.getInstance();
		report.loadConfig(new File("C:\\xampp\\htdocs\\Web-automation-framework\\extent-config.xml")); // Assigned to
																							// xampp/htdocs/extent-config

		/*ChromeOptions options = new ChromeOptions(); // For headless browser
		options.addArguments("--headless"); //
		options.addArguments("windows-size=1366,768"); //
		driver = new ChromeDriver(options);*/

		driver = new ChromeDriver();
		driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.get("https://phoenix_epod_app.dice205.asia/");
		
		/////////////////////////////////////////////////////// FIREFOX BROWSER

		/*
		 * report = ExtentFactory.getInstance(); report.loadConfig(new
		 * File("C:\\Users\\dice205\\eclipse-workspace\\PBAL\\extent-config.xml")); test
		 * = report.startTest("PBAL Login");
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\dice205\\eclipse-workspace\\PBAL\\lib\\drivers\\firefox\\geckodriver.exe"
		 * ); System.setProperty("webdriver.firefox.bin",
		 * "C:\\Users\\dice205\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		 * FirefoxOptions options = new FirefoxOptions(); //For headless browser
		 * options.addArguments("--headless"); //
		 * options.addArguments("windows-size=1366,768"); // driver = new
		 * FirefoxDriver(options); // // driver = new FirefoxDriver(); //For none
		 * headless driver.getWindowHandle(); driver.manage().window().maximize();
		 * driver.get("https://pbalapp.dice205.asia/");
		 */
		
	}
	//Test case format uncomment to test
	@Test(priority = 0)
	public void ShouldnotLoginWithNoCredentials() throws InterruptedException {
		test = report.startTest("Should not Login with no credentials");
		test.log(LogStatus.INFO, "Clear email and password fields");
		driver.findElement(By.xpath(USERFIELDS)).clear();
		driver.findElement(By.xpath(PASSFIELDS)).clear();
		test.log(LogStatus.INFO, "Click LOG IN BUTTON");
		driver.findElement(By.xpath(LOGIN)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Verify if im still in the log-in page");
		if (driver.findElements(By.xpath(LOGIN)).size() > 0) {
		} else {
			Assert.fail();
		}
	}
	@Test(priority = 1)
	public void ShouldnotLoginWithEmailonly() throws InterruptedException {
		test = report.startTest("Should not Login with email only");
		test.log(LogStatus.INFO, "Enter email");
		driver.findElement(By.xpath(USERFIELDS)).sendKeys(USERADMIN);
		test.log(LogStatus.INFO, "Click LOG IN button");
		driver.findElement(By.xpath(LOGIN)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Verify if im still in the log-in page");
		if (driver.findElements(By.xpath(LOGIN)).size() > 0) {
		} else {
			Assert.fail();
		}
		
	}
/*	@Test(priority = 2)
	public void ShouldnotLoginWithPasswordOnly() throws InterruptedException {
		driver.findElement(By.xpath(USERFIELDS)).clear();
		test = report.startTest("Should not Login with password only");
		test.log(LogStatus.INFO, "Enter password");
		driver.findElement(By.xpath(PASSFIELDS)).sendKeys(PASSADMIN);
		test.log(LogStatus.INFO, "click LOG IN button");
		driver.findElement(By.xpath(LOGIN)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Verify if im still in the log-in page");
		if (driver.findElements(By.xpath(LOGIN)).size() > 0) {
		} else {
			Assert.fail();
		}
	}
	@Test(priority = 3)
	public void LoginWithAdminUser() throws InterruptedException {
		driver.findElement(By.xpath(PASSFIELDS)).clear();
		test = report.startTest("Login with admin user");
		test.log(LogStatus.INFO, "Enter admin email and password");
		driver.findElement(By.xpath(USERFIELDS)).sendKeys(USERADMIN);
		driver.findElement(By.xpath(PASSFIELDS)).sendKeys(PASSADMIN);
		test.log(LogStatus.INFO, "click LOG IN button");
		if (driver.findElements(By.xpath(WELCOMEMESSAGE)).size() > 0) {
		} else {
			Assert.fail();
		}
	}*/
	
	
	
	
	
	@AfterTest
	public void AfterTest() {
		report.endTest(test);
		report.flush();
		driver.close();
	}

	@AfterMethod
	public void CheckResults(ITestResult testResults) {

		if (testResults.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case Failed because of below poblem");
			test.log(LogStatus.FAIL, testResults.getThrowable());
		} else if (testResults.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, "Test Case is passed");
		} else if (testResults.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, testResults.getThrowable());
		}
	}
}
