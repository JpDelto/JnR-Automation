package TestCases;
import VariablesAndParameters.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class JnRNavigation extends VariablesandBrowserParameters{
	
  @Test (priority = 0)
  public void LOGO() {
	  
	  
driver.findElement(By.xpath(LOGO)).click();
pause.Pause4();
  }
  
  @Test (priority = 1)
  public void PRODUCTCATEGORIES() throws InterruptedException{
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("javascript:window.scrollBy(0,800)");
      
      Thread.sleep(3000);
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES1)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES2)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES3)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES4)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      js.executeScript("javascript:window.scrollBy(0,500)");
      Thread.sleep(3000);
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES5)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES6)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES7)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES8)).click();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.cssSelector(PRODUCTCATEGORIES9)).click();
      Thread.sleep(2000);
      driver.navigate().back();
  }
  @Test (priority = 2)
  public void CONTACT() throws InterruptedException{
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("javascript:window.scrollBy(0,1100)");
      Thread.sleep(3000);
      driver.findElement(By.xpath(NAME)).sendKeys("test1");
      pause.Pause2();
      driver.findElement(By.xpath(CONTACTNUMBER)).sendKeys("9224573844"); 
      driver.findElement(By.xpath(EMAIL)).sendKeys("test@email.com");
      pause.Pause2();
      driver.findElement(By.xpath(MESSAGE)).sendKeys("test" + Keys.TAB + " ");
      pause.Pause2();
      driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/form[1]/button[1]")).click();
      driver.navigate().back();
      
}
  
  @Test (priority = 3)
  public void ABOUTUS () throws InterruptedException{
	  driver.findElement(By.xpath(ABOUTUS)).click();
	  pause.Pause2();
  }
  @Test (priority = 4)
  public void PRODUCTS () throws InterruptedException{
	  
	 driver.findElement(By.xpath(PRODUCTS)).click();
	  
  }
  @Test (priority = 5)
  public void BRANDS () throws InterruptedException{
	  
	 driver.findElement(By.xpath(BRANDS)).click();
}
  @Test (priority = 5)
public void PROMOS () throws InterruptedException{
	  
	 driver.findElement(By.xpath(PROMOS)).click();
  }
  @Test (priority = 5)
public void CONTACTUS () throws InterruptedException{
	  
	 driver.findElement(By.xpath(CONTACTUS)).click();
  }
}