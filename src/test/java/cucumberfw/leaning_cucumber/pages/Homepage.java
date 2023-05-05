package cucumberfw.leaning_cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterproductinSearchBox(String item)
	{
	    driver.findElement(By.id("twotabsearchtextbox")).clear();
	    	driver.navigate().refresh();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);

	}
	public void clickonSearchButton()
	{
	    driver.findElement(By.id("nav-search-submit-button")).click();

	}
	public void selectitemfromdropdown(String item)
	{
	   
		driver.navigate().refresh();
	   driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));

		driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));

		Select select=new Select(dropdown);
		select.selectByVisibleText(item);
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		    Actions act=new Actions(driver);
		    act.moveToElement( driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();;
		    act.doubleClick().build().perform();
		    act.sendKeys(Keys.DELETE).build().perform();
	}
	public void clickonitem(String item)
	{
		driver.findElement(By.xpath("//span[@class='a-truncate-cut' and text()='"+item+"']")).click();
	}
	public void verifyitemaddedtocart() throws InterruptedException
	{ //span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']
		Thread.sleep(10000);
		String s1=driver.findElement(By.xpath("(//span[contains(text(),'Added to Cart')])[3]")).getText();
		Assert.assertEquals(s1, "Added to Cart");
	}
	public void clickonlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")));
	}
	public void verifylocation(String pin)
	{
		String p=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).getText();
		if(p.contains(pin))
		{
			Assert.assertTrue(true);
		}
	}
	public void  click_on_Select_your_address()
	{
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();
		
	}
	public void cliconEI(String shotcut)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/following-sibling::div[text()='"+shotcut+"']"))));
		driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/following-sibling::div[text()='"+shotcut+"']")).click();
	}
	public void verifylanguage(String language)
	{
		String lan=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/following-sibling::div")).getText();
		if(lan.equals(language))
		{
			Assert.assertTrue(true);
		}
	}

}
