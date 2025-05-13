package steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("Launth the Salesforce Browser")
	public void launth_the_salesforce_browser() {
	      driver = new EdgeDriver();
	}
	@Given("Load the Url")
	public void load_the_url() {
	    driver.get("https://testleaf-da-dev-ed.develop.my.salesforce.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Enter the Username as {string}")
	public void enter_the_username_as(String Username) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(Username);
	    
	}
	@Given("Enter the Password as {string}")
	public void enter_the_password_as(String password) {
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);
	}
	
	@When("Click on Login button")
	public void Click_on_Login_button() {
		driver.findElement(By.id("Login")).click();
	    
	}
	
	@Then("It Should Enter to the next page")
	public void It_Should_Enter_to_the_next_page(){
		System.out.println("Login Successfull and Navigated to the next page");
		
	}
	@Then("Click on toggle menu button")
	public void click_on_toggle_menu_button() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@Then("Click on View All")
	public void click_on_view_all() {
	    driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	}
	@Then("Click on Sales from App Launcher")
	public void click_on_sales_from_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@Then("Click on Accounts tab")
	public void click_on_accounts_tab() {
	    WebElement accountTab = driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']/span[text()='Accounts']"));
	    driver .executeScript("arguments[0].click();",accountTab);
	}
	@Then("Click on New button")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	@Then("Enter {string} as account name")
	public void enter_as_account_name(String Name) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Name);
	}
	@Then("Select Ownership as Public")
	public void select_ownership_as_public() {
	    driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]")).click();
	    WebElement ownerShip = driver.findElement(By.xpath("//span[text()='Public']"));
	    driver .executeScript("arguments[0].click();",ownerShip);
	}
	@Then("Click on Save button")
	public void click_on_save_button() {
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}
	@Then("Verify Account name")
	public void verify_account_name() {
		System.out.println("Account Created and Verified");
	    
	}

}
