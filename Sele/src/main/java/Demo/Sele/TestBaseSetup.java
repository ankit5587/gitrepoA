package Demo.Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup {
	
	WebDriver driver;
	
	public WebDriver getter(){
		return driver;
	}
	
	public void setter(String browser,String URL){
		switch (browser){ 
		
		case "chrome":
		driver= openChrome(URL);	
		
		case "firefox":
		System.out.println("we dont support this browser yet ");
		
		}
	}
	
	private WebDriver openChrome(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}
	
	@Parameters({ "browser", "URL" })
	@BeforeClass
	public void IntailizesTestBaseSetup(String browser,String URL){
		
		setter(browser,URL);
	}

}
