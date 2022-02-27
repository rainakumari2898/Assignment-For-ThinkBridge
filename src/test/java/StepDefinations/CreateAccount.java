package StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.CreateAccount_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends CreateAccount_Page {
	CreateAccount_Page cap = new CreateAccount_Page();
	static WebDriver driver;
	
	
	@Given("Launch the URL")
	public void launch_the_url() {
		driver = set_driver();	
	}
	
	@Given("Verify if dropdown has {string} and {string}")
	public void verify_if_dropdown_has_and(String English, String Dutch) {
		//Select select = new Select(dropdown);
		cap.select_language(driver).click();
		List<WebElement> values = driver.findElements(By.xpath("//div[contains(@class,'ng-binding ng-scope')]"));
		Assert.assertEquals(values.get(0).getText(), English);
		Assert.assertEquals(values.get(1).getText(), Dutch);
		values.get(0).click();
	}
	@When("user enters {string} in full name text box")
	public void user_enters_in_full_name_text_box(String full_name) {
		cap.enter_full_name(driver).sendKeys(full_name);
	}

	@When("{string} in organization name text box")
	public void in_organization_name_text_box(String organization_name) {
		cap.enter_organization_name(driver).sendKeys(organization_name);
	}

	@When("{string} in Email text box")
	public void in_email_text_box(String email) {
		cap.enter_email(driver).sendKeys(email);
	}

	@Then("Click on agree check box")
	public void click_on_agree_check_box() {
		cap.click_to_agree(driver).click();
	}

	@Then("Click on Get Started button")
	public void click_on_get_started_button() {
		cap.click_on_submit_button(driver).click();
	}
	
	@Then("Verify if email send message is displayed")
	public void verify_if_email_send_message_is_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(cap.get_message(driver)));
		String message = cap.get_message(driver).getText();
		String expected_message = "A welcome email has been sent. Please check your email.";
		Assert.assertEquals(expected_message,message);
		close_driver();
	}

}
