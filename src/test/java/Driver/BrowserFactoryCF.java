package Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactoryCF {
	DesiredCapabilities desiredCapability;
	WebDriver driver;
	String nodeURL = "";

	public BrowserFactoryCF() {

	}

	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver setDriver(String browser, String nodeURL) throws MalformedURLException {
		System.getProperty("java.classpath");
		new DesiredCapabilities();

		switch (browser.toString().toUpperCase()) {
		case "CHROME":

			ChromeOptions capc = new ChromeOptions();
			capc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			capc.setCapability(CapabilityType.PLATFORM, Platform.ANY);
			capc.getBrowserName();
			driver = new RemoteWebDriver(new URL(nodeURL), capc);
			break;
		case "FIREFOX":
			FirefoxOptions capf = new FirefoxOptions();
			capf.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			capf.setCapability(CapabilityType.PLATFORM, Platform.ANY);
			capf.getBrowserName();
			driver = new RemoteWebDriver(new URL(nodeURL), capf);

			break;
		case "EDGE":
			EdgeOptions cape = new EdgeOptions();
			cape.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			cape.setCapability(CapabilityType.PLATFORM, Platform.ANY);
			cape.getBrowserName();
			driver = new RemoteWebDriver(new URL(nodeURL), cape);

			break;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		return driver;

	}

	public void removeDriver() {
		driver.close();
		driver.quit();

	}

}
