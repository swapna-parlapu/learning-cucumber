package cucumberfw.leaning_cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class productdisplaypage {
	WebDriver driver;
public productdisplaypage(WebDriver driver)
{
	this.driver=driver;
}
public void verifyproduct(String item)
{
	String s1=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
	Assert.assertTrue(s1.contains(item));
}
public void clickonaddtocart()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//input[@id='add-to-cart-button']")));
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
}
}
