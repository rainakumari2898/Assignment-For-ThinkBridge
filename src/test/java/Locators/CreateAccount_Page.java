package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BaseClass;

public class CreateAccount_Page extends BaseClass{
	static By language_dropdown = By.xpath("//div[contains(@placeholder,'Language')]");
	static By full_name_txt = By.id("name");
	static By organization_name_txt = By.id("orgName");
	static By email_txt = By.id("singUpEmail");
	static By agree_btn = By.xpath("//span[contains(text(),'I agree to the')]");
	static By submit_btn = By.xpath("//div[contains(@class,'custom-form-group')]/button");
	static By message_area = By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/div/span");//div[contains(@class,'alert')]/span
	
	public WebElement select_language(WebDriver driver) {
		return driver.findElement(language_dropdown);
	}
	
	public WebElement enter_full_name(WebDriver driver) {
		return driver.findElement(full_name_txt);
	}
	
	public WebElement enter_organization_name(WebDriver driver) {
		return driver.findElement(organization_name_txt);
	}
	
	public WebElement enter_email(WebDriver driver) {
		return driver.findElement(email_txt);
	}
	
	public WebElement click_to_agree(WebDriver driver) {
		return driver.findElement(agree_btn);
	}
	
	public WebElement click_on_submit_button(WebDriver driver) {
		return driver.findElement(submit_btn);
	}
	
	public WebElement get_message(WebDriver driver) {
		return driver.findElement(message_area);
	}
}
