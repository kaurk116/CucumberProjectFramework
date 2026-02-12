
/*
package stepsDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps {

	WebDriver driver;
	
	@Given("the user is on the nopCommerce login page")
	public void navigateToLoginPage() {
	  
		driver=new EdgeDriver();
		 driver.get("https://demo.nopcommerce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	}

	@When("the user enters valid credentials with username {string} and password {string}")
	public void the_user_enters_valid_credentials_with_username_and_password(String username, String password) {

		System.out.println("Username = " + username);
		System.out.println("Password = " + password);


		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		
	}


	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	   
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	@Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	   boolean status=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
		Assert.assertEquals(status,true);
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	  boolean welcometext=driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
	  Assert.assertEquals(welcometext,true);
	  driver.quit();
	}

}







*/
