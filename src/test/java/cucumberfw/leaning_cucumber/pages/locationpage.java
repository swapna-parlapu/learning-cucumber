package cucumberfw.leaning_cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locationpage {
WebDriver driver;
	
	public locationpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterpincodeintextbox(String pin)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")) );
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")));

		driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys("532001");
	}
	
	public void clickonapply()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@id='GLUXZipUpdate-announce']")));
	}

}
