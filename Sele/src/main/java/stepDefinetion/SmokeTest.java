package stepDefinetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com");
	    
	}	

	@When("^i enter valid user name and password$")
	public void i_enter_valid_user_name_and_password() throws Throwable {
	  
		driver.findElement(By.id("email")).sendKeys("ankit5587");
		driver.findElement(By.id("pass")).sendKeys("sunitabajaj");
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}


}
