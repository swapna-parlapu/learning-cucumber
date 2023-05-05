package cucumberfw.leaning_cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchResultsPage {
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyItemdescripton()
	{
		String s1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
		Assert.assertEquals(s1, "Nikon D7500 20.9MP Digital SLR Camera (Black) with AF-S DX NIKKOR 18-140mm f/3.5-5.6G ED VR Lens");
	}
	public void verifyItemdes()
	{
		  String s1=driver.findElement(By.xpath("(//span[@class=\"sl-sobe-carousel-sub-card-title\" and text()='Headphones'])[1]")).getText();
			Assert.assertEquals(s1, "Headphones");
	}
}
