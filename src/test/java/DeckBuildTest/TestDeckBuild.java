package DeckBuildTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;
import PageModel.ShadowCode;

import Driver.BrowserFactory;
import Driver.DriverFactory;

@Test
public class TestDeckBuild {
	WebDriver driver;
	BrowserFactory bf = new BrowserFactory();

	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;
	ShadowCode sc;/// posterior

	@Test
	public void test_1_Navegacion() throws InterruptedException {

		// ---web oficcial de shadowverse---//
		sm = new ShadowMain(driver);
		sm.clickPortal();

		// ---cambiar de pestaña a portal---//
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));// driver.switchTo().window(tabs2.get(0));

		// ---pestaña portal---//
		sp = new ShadowPortal(driver);
		sp.menuLenguaje();
		sp.menuEspañol();
		sp.clickUrias();
		sp.clickdeckBuilder();

		// ---deck builder---//

	}

	@BeforeClass
	public void build() {// String Browser, String url

		DriverFactory.getInstance().setDriver(bf.createBrowserIntance("CHROME"));
		driver = DriverFactory.getInstance().getDriver();

	}

	@AfterClass
	public void tearDown() {
		bf.removeDriver();
	}

}
