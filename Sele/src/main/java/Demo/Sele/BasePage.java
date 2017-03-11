package Demo.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	protected WebDriver driver;
	private By signInButton = By.linkText("Sign in");
	
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	public SignInPage clickSignInBtn() {
		WebElement signInBtnElement=driver.findElement(signInButton);
		if(signInBtnElement.isDisplayed()||signInBtnElement.isEnabled())
			signInBtnElement.click();
		
		else System.out.println("Element not found");
		return new SignInPage(driver);
	}
	public void clickImagesLink() {
	
	}
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Google";
		return getPageTitle().contains(expectedPageTitle);
	}
}
