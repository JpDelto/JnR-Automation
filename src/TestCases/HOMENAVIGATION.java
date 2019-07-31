package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;*/
import org.testng.Assert;
/*import org.testng.annotations.Listeners;*/
import org.testng.annotations.Test;
import VariablesAndParameters.*;
public class HOMENAVIGATION extends VariablesAndParameters {
	
  @Test (priority = 0)
  public void LOGO() throws InterruptedException, IOException {
	  
	  driver.findElement(By.xpath("LOGO")).click();
	  
  }
}
