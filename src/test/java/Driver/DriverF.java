package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;


public class DriverF {
	static WebDriver driver = null;
	
	public static void chromeDriver(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public WebDriver getdriver() {
		return driver;
	}
	public void removeDriver() {
		driver.close();
		driver.quit();
		
	}
	public static void driverWeb(String str) {
		try {
			driver.get(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
