package stepdefinition;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FormValidation {
	
	WebDriver driver=null;
	
	@Given("^user is present on home page$")
	public void user_is_present_on_home_page() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.growthengineering.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@When("^title of page is GROWTH$")
	public void title_of_the_page_is_GROWTH() throws Throwable {
		String actualtitle = driver.getTitle();
		String expectedTitle="Growth Engineering - Online Learning Engagement Experts";
		assertEquals(expectedTitle,actualtitle);
	}

	@Then("^user goes to contactUs page$")
	public void user_goes_to_contactUs_page() throws Throwable {
	   Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(By.linkText("Contact Us"))).build().perform();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Contact Us")).click();
	   String expectedUrl="https://www.growthengineering.co.uk/contact/";
	   String actualUrl=driver.getCurrentUrl();
	   assertEquals(expectedUrl,actualUrl);
	}
	
	@Then("^user tries to submit the form without entering any data$")
	public void user_tries_to_submit_the_form_without_entering_any_data() throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user validates if the Formvalidation is working or not on ContactUs page$")
	public void user_validates_if_the_validation_is_working_or_not() throws Throwable {
		String path="//*[@class='hs_error_rollup']/ul/li/label";
	  	boolean isDisplayedText=driver.findElement(By.xpath(path)).isDisplayed();
	  	assertTrue(isDisplayedText);
	  	String actualResult = driver.findElement(By.xpath(path)).getText();
	  	String expectedResult = "Please complete all required fields.";
	  	assertEquals(expectedResult, actualResult);
	  	driver.close();
	}
}
