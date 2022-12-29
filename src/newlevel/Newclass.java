package newlevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newclass {

	
	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;
	
	@BeforeTest
	
	
	
	public void login() {
		WebDriverManager.chromedriver().setup();
		
		driver1=new ChromeDriver();
		
		
	}
}
