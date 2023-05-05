package cucumberfw.leaning_cucumber.tests;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import cucumberfw.leaning_cucumber.pages.LoginPage;
import cucumberfw.leaning_cucumber.pages.SearchResultsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumberfw.leaning_cucumber.pages.Homepage;
import cucumberfw.leaning_cucumber.pages.*;
public class StepDefinitions {
	static WebDriver driver;
	static LoginPage LoginPage;
	 Homepage Homepage;
	 SearchResultsPage SearchResultsPage;
	 productdisplaypage  productdisplaypage;
	 locationpage location;
	 language_selection_page  language_selection_page;
	 @BeforeAll
	 public static void setup()
	 {
		 WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			LoginPage=new LoginPage(driver);
			LoginPage.login();
			
	 }
	 
	 
	
	@Given("enter productname {string} you want to search in the searchbox")
	public void enter_productname_you_want_to_search_in_the_searchbox(String item) {
		Homepage=new Homepage(driver);
		Homepage.enterproductinSearchBox(item);
		
	}
	@When("I click on search Button.")
	public void i_click_on_search_button() {
		SearchResultsPage=new SearchResultsPage(driver);
		Homepage.clickonSearchButton();
	}
	@Then("searchdetails page to be displayed.")
	public void searchdetails_page_to_be_displayed() {
		SearchResultsPage.verifyItemdescripton();
	}
	@And ("select any product {string} from dropdown present in searchbox")

	public void select_any_product_from_dropdown_present_in_searchbox(String item) {
		Homepage=new Homepage(driver);

		Homepage.selectitemfromdropdown(item);
		
	}

	@Then("Searchdetails page should be displayed")
	public void searchdetails_pge_should_be_displayed() {
		SearchResultsPage.verifyItemdes();

	}


	
	@When("I click on {string}.")
	public void i_click_on(String item) {

		   Homepage.clickonitem(item);

	   
	}

	@When("we are taken to {string} page.")
	public void we_are_taken_to_page(String item) {
		 productdisplaypage=new productdisplaypage(driver);
		productdisplaypage.verifyproduct(item);
	}

	@When("click on add to cart.")
	public void click_on_add_to_cart() {
		 productdisplaypage.clickonaddtocart();
	}

	@Then("item should be added to cart.")
	public void item_shout_be_added_to_cart() throws InterruptedException {
	    Homepage.verifyitemaddedtocart();
	}
	 @Given("I am on homepage")
	 public void i_am_on_homepage() throws InterruptedException
	 {
			Homepage=new Homepage(driver);
			Homepage.clickonlogo();
	 }
	 @When("I click on Select your address")
	 public void i_click_on_select_your_address() {
		 
	     Homepage.click_on_Select_your_address();
	 }

	 @When("enter {string} in textbox.")
	 public void enter_in_textbox(String pin) {
	     location=new locationpage(driver);
	     location.enterpincodeintextbox(pin);
	 }

	 @When("And click on apply button.")
	 public void and_click_on_apply_button() {
		 location.clickonapply();
	 }

	 @Then("Select your address should be changed to {string}")
	 public void should_be_changed_to(String pin) {
	     Homepage.verifylocation(pin);


	 }

	 @When("I click on {string} symbol.")
	 public void i_click_on_symbol(String shotcut) {
	    Homepage=new Homepage(driver);
	    Homepage.cliconEI(shotcut);
	 }

	 @When("Select languge {string} radio button from the list")
	 public void select_languge_radio_button_from_the_list(String language) {
	    language_selection_page=new language_selection_page(driver);
	    language_selection_page.selectlanguage(language);
	 }

	 @When("click on save")
	 public void click_on_save() {
		 language_selection_page.submit();
	     
	 }
	 @When("language should be changed to {string}")
	 public void language_should_be_changed_to(String language) {
		 Homepage.verifylanguage(language);
	 }


}
