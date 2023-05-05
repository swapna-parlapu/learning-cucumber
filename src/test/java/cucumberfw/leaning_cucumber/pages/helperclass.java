package cucumberfw.leaning_cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helperclass {
	public static WebDriverWait wait;
	WebDriver driver=null;

	public WebDriverWait getWebDriverWait()
	{
		return wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	

}
