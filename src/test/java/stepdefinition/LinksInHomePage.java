package stepdefinition;

import java.util.concurrent.TimeUnit;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LinksInHomePage {
	
	WebDriver driver=null;

	@Given("user launches the link")
	public void user_launches_the_link() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.growthengineering.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}
	
	@When("^title of the page is GROWTH$")
	public void title_of_the_page_is_GROWTH() throws Throwable {
		String title = driver.getTitle();
		String expectedTitle="Growth Engineering - Online Learning Engagement Experts";
		assertEquals(expectedTitle,title);
	}
	
	@Then("^user validate Our Product menu option present on screen$")
	public void user_validate_Our_Product_menu_option_present_on_screen() throws Throwable {
		String linktext="Our Products";
		Actions action = new Actions(driver);
		Action action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();

		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("The Knowledge Arcade"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/knowledge-arcade-learning-app/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Genie Authoring Tool"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/genie-content-authoring-tool/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("The Academy LMS"))).click();
		Thread.sleep(200);
    	assertEquals("https://www.growthengineering.co.uk/academy-lms/",driver.getCurrentUrl());

	}

	@Then("^user validate Our Approach menu option present on screen$")
	public void user_validate_Our_Approach_menu_option_present_on_screen() throws Throwable {
		String linktext="Our Approach";
		Actions action = new Actions(driver);
		Action action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();

		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Brain Science"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/brain-science/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Social Learning"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/social-learning/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Gamification"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/gamification/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Personalisation"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/personalisation/",driver.getCurrentUrl());


	}

	@Then("^user validate Resources menu option present on screen$")
	public void user_validate_Resources_menu_option_present_on_screen() throws Throwable {
		String linktext="Resources";
		Actions action = new Actions(driver);
		Action action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();

		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Downloads"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/resources/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Blog"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/blog/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Webinars"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/upcoming-webinars/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Free eLearning Content"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/resources/free-elearning-content/",driver.getCurrentUrl());

	}

	@Then("^user validate AboutUs menu option present on screen$")
	public void user_validate_AboutUs_menu_option_present_on_screen() throws Throwable {
		String linktext="About Us";
		Actions action = new Actions(driver);
		Action action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();

		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Our Story"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/about-growth-engineering/",driver.getCurrentUrl());
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Our Clients"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/our-clients/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Awards"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/awards/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Partners"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/partners/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("GDPR"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/gdpr/",driver.getCurrentUrl());
		action1=action.moveToElement(driver.findElement(By.linkText(linktext))).click().build();
		action1.perform();
		new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.linkText("Get in Touch"))).click();
		Thread.sleep(200);
		assertEquals("https://www.growthengineering.co.uk/contact/",driver.getCurrentUrl());
	}

	@Then("^user validate GetInTouch menu option present on screen$")
	public void user_validate_GetInTouch_menu_option_present_on_screen() throws Throwable {
		String linktext="GET IN TOUCH";
		driver.findElement(By.linkText(linktext)).click();
		assertEquals("https://www.growthengineering.co.uk/contact/",driver.getCurrentUrl());
		driver.close();
	}

}
