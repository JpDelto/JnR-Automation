package VariablesAndParameters;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*import org.openqa.selenium.chrome.ChromeOptions;*/
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/*import org.openqa.selenium.firefox.FirefoxOptions;*/
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

public class VariablesandBrowserParameters {
		//Sample Variables declaration
	   //LOG-IN VARIABLES 
	
	   protected String WEBSITE = new String("https://jnr.dice205.asia/#");
	   
	   
	 /*  protected String EMAILFIELDS = new String("//input[@name='username']");
	   protected String PASSFIELDS = new String("//input[@name='pass']");
	   protected String LOGIN = new String("//button[@class='login100-form-btn']");
	   protected String FORGOTPASSWORD = new String("//a[contains(text(),'Forgot your password?')]");
	   protected String USERADMININPUT = new String("qadice205@gmail.com");
	   protected String PASSADMININPUT = new String("P@ssw0rd123");
	   protected String HIDEUNHIDE = new String("/a[@id='pass_read']");
	   
	   //HOME VARIABLES
	   protected String MENUBUTTON = new String("//*[@class='menu-bar-breed']");
	   protected String WELCOMEMESSAGE = new String("//h5[@class='modal-title']");
	   protected String CLOSEMODAL = new String("//button[@class='btn btn-secondary']");


	   
	   //MANAGE USERS VARIABLES
	   protected String MANAGEUSERS = new String("main.main-container.remove-overflow-mobile div.sidebar.sidebar-opened div.sidebar-content-wrapper div.breeder-container a.text-decoration-none.undefined:nth-child(2) div.sidebar-menu-item.px-2.py-1 > div.d-flex.align-items-center.px-2.sidebar-menu-icons");
	   protected String CREATEUSERBUTTON = new String("//button[@class='data-create__btn btn btn-sm btn-primary m-2']");
	   protected String USEREMAILFIELDS = new String("//input[@id='email']");
	   protected String USERNAMEFIELDS = new String("//input[@id='username']");
	   protected String USERFIRSTNAMEFIELDS = new String("//input[@id='first_name']");
	   protected String USERLASTNAMEFIELDS = new String("//input[@id='last_name']");
	   protected String USEREMAILINPUT = new String("Juandelacruz@gmail.com");
	   protected String USERNAMEINPUT = new String("juan.delacruz");
	   protected String USERFIRSTNAMEINPUT = new String("Juan");
	   protected String USERLASTNAMEINPUT = new String("Dela Cruz");
*/
	   
	   
	   //BROWSER VARIABLES
	   protected String FFDRIVER = new String("webdriver.gecko.driver");
	   protected String FFGECKO = new String("C:\\Users\\dice205\\eclipse-workspace\\PBAL-Automation-Framework\\lib\\drivers\\geckodriver.exe");
	   protected String FFBIN = new String("webdriver.firefox.bin");
	   protected String FFPATH = new String("C:\\Users\\Admin\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	   protected String CHROMEPATH = new String("C:\\Users\\Admin\\eclipse-workspace\\PBAL-Automation-Framework\\lib\\drivers\\chromedriver.exe");
	   protected Timer pause = new Timer();
	  
	   //JNR VARIABLES
	   protected String LOGO = new String("//img[contains(@class,'nav-logo')]");
	   protected String PRODUCTCATEGORIES1 = new String("body > div.home-categories-section > div > div:nth-child(1) > div > a > button");
	   protected String PRODUCTCATEGORIES2 = new String("body > div.home-categories-section > div > div:nth-child(2) > div > a > button");
	   protected String PRODUCTCATEGORIES3 = new String("body > div.home-categories-section > div > div:nth-child(3) > div > a > button");
	   protected String PRODUCTCATEGORIES4 = new String("body > div.home-categories-section > div > div:nth-child(4) > div > a > button");
	   protected String PRODUCTCATEGORIES5 = new String("body > div.home-categories-section > div > div:nth-child(5) > div > a > button");
	   protected String PRODUCTCATEGORIES6 = new String("body > div.home-categories-section > div > div:nth-child(6) > div > a > button");
	   protected String PRODUCTCATEGORIES7 = new String("body > div.home-categories-section > div > div:nth-child(7) > div > a > button");
	   protected String PRODUCTCATEGORIES8 = new String("body > div.home-categories-section > div > div:nth-child(7) > div > a > button");
	   protected String PRODUCTCATEGORIES9 = new String("body > div.home-categories-section > div > div:nth-child(9) > div > a > button");
	   ///TABS
	   protected String ABOUTUS = new String("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]");
	   protected String PRODUCTS = new String("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]");
	   protected String BRANDS = new String("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1] ");
	   protected String PROMOS = new String("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[5]/a[1] ");
	   protected String CONTACTUS = new String("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]");
	   //CONTACT US
	   protected String NAME = new String("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]");
	   protected String CONTACTNUMBER = new String("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/input[1]");
	   protected String EMAIL = new String("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/form[1]/div[3]/input[1]");
	   protected String MESSAGE = new String("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/form[1]/div[4]/textarea[1]");
	   
	   public WebDriver driver;
	   @Parameters("browser")
	   @BeforeClass
	   
	   
	   
	   
	   
	   // Passing Browser parameter from TestNG xml
	   public void beforeTest(String browser) {
	  	if(browser.equalsIgnoreCase("firefox")) {
	    System.setProperty(FFDRIVER, FFGECKO);
	    System.setProperty(FFBIN, FFPATH);  
	  /*  FirefoxOptions options = new FirefoxOptions();   //For headless browser
	    options.addArguments("--headless");				 //	
	    options.addArguments("windows-size=1366,768");   //
	    driver = new FirefoxDriver(options);             //
*/	    driver = new FirefoxDriver();
 	    
	   }else if (browser.equalsIgnoreCase("chrome")) {   
		   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    ChromeOptions options = new ChromeOptions();     //For headless browser  
	    options.addArguments("--headless");              //
	    /*options.addArguments("windows-size=1366,768");  */ //
	    options.addArguments("test-type");
        options.addArguments("--start-maximized");
       
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(options);              
	    
	    
/*		   
	    driver = new ChromeDriver();
	   */
	    
	   }/*else if (browser.equalsIgnoreCase("edge")) {    
		EdgeOptions options = new EdgeOptions();
		
	    driver = new EdgeDriver(options);
	   }*/
	   driver.get(WEBSITE);
	   driver.getWindowHandle();
	   driver.manage().window().maximize();
	   }
	  
	   
	   
	   
	   @AfterSuite
	   public void AfterSuit() throws IOException {
	   
	   //EmailReport report = new EmailReport();			//Email Reports
	   //report.EmailReportTest();
	   //driver.quit();
	   }
	   
}

