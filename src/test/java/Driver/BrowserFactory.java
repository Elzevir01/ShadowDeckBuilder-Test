package Driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	WebDriver driver = null;
	
	public WebDriver setDriver(String browser) {
		

		switch (browser.toString().toUpperCase()) {
		case "CHROME":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();

			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		return driver;
	}

	/*public WebDriver getInstance() {
		// TODO Auto-generated method stub
		return null;
	}*/
	public void removeDriver() {
		driver.close();
		driver.quit();
	}

}
