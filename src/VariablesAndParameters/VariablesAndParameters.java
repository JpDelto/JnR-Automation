package VariablesAndParameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class VariablesAndParameters {
	   
	
	
	   protected String LOGO = new String("//img[contains(@class,'header-logo')]");
	   
     	//PARAMETERS
	   protected String WEBSITE = new String("https://jnr.dice205.asia/#");
	   protected String FFDRIVER = new String("webdriver.gecko.driver");
	   protected String FFGECKO = new String("C:\\Users\\dice205\\eclipse-workspace\\JnR-Automation\\lib\\drivers\\geckodriver.exe");
	   protected String FFBIN = new String("webdriver.firefox.bin");
	   protected String FFPATH = new String("C:\\Users\\Admin\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	   protected String CHROMEPATH = new String("C:\\Users\\Admin\\eclipse-workspace\\JnR-Automation\\lib\\drivers\\chromedriver.exe");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   public static WebDriver driver;
	   @Parameters("browser")
	   @BeforeClass
	   
	   
	   
	   
	   
	   // Passing Browser parameter from TestNG xml
	   public void beforeTest(String browser) {
	  	if(browser.equalsIgnoreCase("firefox")) {
	    System.setProperty(FFDRIVER, FFGECKO);
	    System.setProperty(FFBIN, FFPATH);  
	    FirefoxOptions options = new FirefoxOptions();   //For headless browser
	    options.addArguments("--headless");				 //	
	    options.addArguments("windows-size=1366,768");   //
	    driver = new FirefoxDriver(options);             //
	   // driver = new FirefoxDriver();
	    
	   }else if (browser.equalsIgnoreCase("chrome")) {   
	   /* ChromeOptions options = new ChromeOptions();     //For headless browser  
	    options.addArguments("--headless");              //
	    options.addArguments("windows-size=1366,768");   //
	    driver = new ChromeDriver(options);     */         // 
 
	    driver = new ChromeDriver();
	    
	   
	    
	   }else if (browser.equalsIgnoreCase("edge")) {    
		EdgeOptions options = new EdgeOptions();
		
	    driver = new EdgeDriver(options);
	   }
	   driver.get(WEBSITE);
	   driver.getWindowHandle();
	   driver.manage().window().maximize();
	   }
	   
	   @AfterSuite
	   public void AfterSuit() throws IOException {
	   //EmailReport report = new EmailReport();			//Email Reports
	   //report.EmailReportTest();
	   driver.quit();
	   
}
}