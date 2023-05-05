package cucumberfw.leaning_cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class language_selection_page {
	WebDriver driver;
public language_selection_page(WebDriver driver)
{
	this.driver=driver;
}
public void selectlanguage(String language)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", 	driver.findElement(By.xpath("//span[@dir='ltr' and text()='"+language+"']/parent::span/parent::span/preceding-sibling::input")));

}
public void submit()
{
	driver.findElement(By.xpath("//input[@class='a-button-input' and @type='submit']")).click();
}
}
