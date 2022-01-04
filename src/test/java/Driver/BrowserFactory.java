package Driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public WebDriver createBrowserIntance(String browser) {
		WebDriver driver = null;

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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://shadowverse.com/");
		
		return driver;
	}

	public WebDriver getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
