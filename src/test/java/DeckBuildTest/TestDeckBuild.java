package DeckBuildTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;
import PageModel.Base;
import PageModel.ShadowCode;

import Data.DataP;

import Driver.BrowserFactory;
import Driver.DriverFactory;

@Test
public class TestDeckBuild {
	WebDriver driver;
	BrowserFactory bf = new BrowserFactory();
	
	static DataP dp;

	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;
	ShadowCode sc;/// posterior
	Base bs;
	
	@Test(priority=1)
	public void test_1_Navegacion() throws InterruptedException {
		bs = new Base(driver);
		
		// ---web oficcial de shadowverse---//
		sm = new ShadowMain(driver);//driver
		sm.checkLogo();
		sm.portalClick();

		// ---cambiar de pestaña a portal---//
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));// driver.switchTo().window(tabs2.get(0));

		// ---pestaña portal---//
		sp = new ShadowPortal(driver);
		//@@@@@@chedck
		sp.portalEspañol();
		sp.portalUrias();

		

	}
	@Test(priority=2)//(dataProvider="deckCards",dataProviderClass=DataP.class)
	public void test_2_Construccion() {
		// ---deck builder---//
		//@@@@check
		
		
	}

	@BeforeClass
	public void setUp() {// String Browser, String url

		DriverFactory.getInstance().setDriver(bf.createBrowserIntance("CHROME"));
		driver = DriverFactory.getInstance().getDriver();

	}

	@AfterClass
	public void tearDown() {
		bf.removeDriver();
	}
	
	/*@DataProvider(name="CardDP")
    public static Object[][] getCardData(){
		dp = new DataP();
		String[][] data = dp.cardData();
		
        return data;
        }; */
        

}
