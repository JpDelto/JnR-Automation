package TestCases;
import VariablesAndParameters.*;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;*/
import org.testng.Assert;
/*import org.testng.annotations.Listeners;*/
import org.testng.annotations.Test;



public class HOMENAVIGATION extends VariablesandBrowserParameters {
	
  @Test (priority = 0)
  public void LOGO() throws InterruptedException, IOException {
	  
	  driver.findElement(By.xpath("LOGO")).click();
	  pause.Pause4();
  }
  
  @Test (priority = 1)
  public void CAROUSEL() throws InterruptedException, IOException {

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,300)");
      
      for (int i = 0; i < 3; i++){
    	  //click the button
    	   driver.findElement(By.xpath(CAROUSELRIGHT)).click();
    	  //wait 2 seconds
    	   Thread.sleep(2000);
    	   //check that data is being generated correctly
    	   
    	 }
      for (int i = 0; i < 4; i++){
    	  //click the button
    	   driver.findElement(By.xpath(CAROUSELLEFT)).click();
    	  //wait 2 seconds
    	   Thread.sleep(2000);
    	   //check that data is being generated correctly
    	   
    	 }
      
}
  @Test (priority = 1)
  public void CAROUSELPROMOS() throws InterruptedException, IOException {

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,500)");
      
      for (int i = 0; i < 3; i++){
    	  //click the button
    	   driver.findElement(By.xpath(CAROUSELPROMORIGHT)).click();
    	  //wait 2 seconds
    	   Thread.sleep(2000);
    	   //check that data is being generated correctly
    	   
    	 }
      for (int i = 0; i < 4; i++){
    	  //click the button
    	   driver.findElement(By.xpath(CAROUSELPROMOLEFT)).click();
    	  //wait 2 seconds
    	   Thread.sleep(2000);
    	   //check that data is being generated correctly
    	   
    	 }
  
  }
}
