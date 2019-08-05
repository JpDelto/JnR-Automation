package TestCases;
import VariablesAndFunctions.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HOME extends VariablesandBrowserParameters{
	
  @Test (priority = 0)
  public void LOGO() {
	  
	  
driver.findElement(By.xpath(LOGO)).click();
pause.Pause4();
  }
  
  @Test (priority = 0)
  public void PRODUCTCATEGORIES(){
	  
	  
	  driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
	/*  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeAsyncScript("window.scrollBy(0,1600)");
	  
	  driver.findElement(By.xpath(PRODUCTCATEGORIES1)).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath(PRODUCTCATEGORIES2)).click();

	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
  }
}
