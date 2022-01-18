package DeckBuildTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;
import PageModel.ShadowCode;

import Data.DataC;

import Driver.BrowserFactory;
import Driver.DriverFactory;

@Test
public class TestDeckBuild {
	
	String url = "https://shadowverse-portal.com/deck/3.6.78Hw2.78Hw2.78Hw2.7JkqI.7JkqI.7JkqI.7C8VI.7C8VI.7C8VI.7NYU2.7NYU2.7NYU2.7JpyQ.7JpyQ.7JpyQ.7G1X6.7G1X6.7G1X6.7Jrfy.7Jrfy.7Jrfy.78Moi.78Moi.7F_4Y.7F_4Y.7JmnI.7JmnI.7JmnI.7FwCM.7FwCM.7FwCM.78PEy.78PEy.7G1Wy.7G1Wy.7JmnS.7JmnS.7JmnS.7Jrfo.7JkLM?lang=en";
	WebDriver driver;
	BrowserFactory bf = new BrowserFactory();

	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;
	ShadowCode sc;// posterior
	
	@Test(priority=1)
	public void test_1_Navegacion() throws InterruptedException {
		
		// ---web oficcial de shadowverse---//
		sm = new ShadowMain(driver);
		sm.checkLogo();
		sm.portalClick();

		// ---cambiar de pestaña a portal---//
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		// ---pestaña portal---//
		sp = new ShadowPortal(driver);
		//sp.checkLogo();//////
		sp.portalEspañol();
		sp.portalUrias();
		// ---deck builder---//
		sd = new ShadowDeck(driver);
		//sd.formatoIlimitado();
		sd.checkClickIlimitado();
	}
	@Test(priority=2, dataProvider="deckCards",dataProviderClass=DataC.class)
	public void test_2_Construccion(String carta, int numero ) throws InterruptedException {
		
		// ---deck builder---//
		System.out.println("carta: "+ carta);
		System.out.println("numero: "+numero);
		
		for(int i=0;i<numero;i++) {
			sd.clickCarta(driver, carta);
		}
		
	}
	
	@Test(priority=3)
	public void test_3_Code() throws InterruptedException {
		//deck code en tempo storm tglh
		//sd.navegar(driver, url);
		//--- menu build con codigo ---//
		
		//sd.deckCodeMenu();
		url = "https://shadowverse-portal.com/deckbuilder/classes?lang=es";
		sd.navegar(driver, url);
		
		// ---deck Code Check---//
		/*sc = new ShadowCode(driver);
		sc.codeConfirm();*/
	}
	
	@BeforeClass
	public void setUp() {

		DriverFactory.getInstance().setDriver(bf.createBrowserIntance("CHROME"));
		driver = DriverFactory.getInstance().getDriver();

	}

	@AfterClass
	public void tearDown() {
		bf.removeDriver();
	}
	
        

}
