package DeckBuildTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

import org.testng.log4testng.Logger;

import PageModel.ShadowCode;

import Data.DataC;

import Driver.BrowserFactory;
import Driver.DriverFactory;

@Test
public class TestDeckBuild {
	
	String url = "https://shadowverse-portal.com/deck/3.6.78Hw2.78Hw2.78Hw2.7JkqI.7JkqI.7JkqI.7C8VI.7C8VI.7C8VI.7NYU2.7NYU2.7NYU2.7JpyQ.7JpyQ.7JpyQ.7G1X6.7G1X6.7G1X6.7Jrfy.7Jrfy.7Jrfy.78Moi.78Moi.7F_4Y.7F_4Y.7JmnI.7JmnI.7JmnI.7FwCM.7FwCM.7FwCM.78PEy.78PEy.7G1Wy.7G1Wy.7JmnS.7JmnS.7JmnS.7Jrfo.7JkLM?lang=en";
	WebDriver driver;
	//private static final Log = org.apache.logging.log4j.LogManager.getLogger(TestDeckBuild.class);
	Logger Log = Logger.getLogger(TestDeckBuild.class);
	//private static Logger logJava = org.testng.log4testng.Logger.getLogger(TestDeckBuild.class);
	
	BrowserFactory bf = new BrowserFactory();

	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;
	ShadowCode sc;
	
	@Test(priority=1)
	@Description("Navega desde Shadowverse.com hacia shadowverse-portal.com/deckbuilder/")
	@Step("step: 1")
	public void test_1_Navegacion() throws InterruptedException {
		
		// ---web oficcial de shadowverse---//
		Log.info("Ingresando a Shadowverse.com");
		sm = new ShadowMain(driver);
		sm.checkLogo();
		Log.info("Click en boton de Portal");
		sm.portalClick();

		// ---cambiar de pestaña a portal---//
		Log.info("Cambiando a la pestaña portal");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		// ---pestaña portal---//
		sp = new ShadowPortal(driver);
		//sp.checkLogo();//////
		Log.info("Cambiando a idioma español");
		sp.portalEspañol();
		Log.info("Seleccionando creador de mazo Urias");
		sp.portalUrias();
		
		// ---deck builder---//
		sd = new ShadowDeck(driver);
		Log.info("Verificando y seleccionando formato ilimitado");
		sd.checkClickIlimitado();
		sd.ilimitado();
	}
	@Test(priority=2, dataProvider="deckCards",dataProviderClass=DataC.class)
	@Description("Localizando cartas del deck y agregando al mazo")
	@Step("step: 2")
	public void test_2_Construccion(String carta, int numero ) throws InterruptedException {
		
		// ---deck builder---//
		for(int i=0;i<numero;i++) {
			sd.clickCarta(driver, carta);
		}
		
	}
	
	@Test(priority=3)
	@Description("Checkeo de la cantidad de cartas agregadas(40)")
	@Step("step: 3")
	public void test_3_Code() throws InterruptedException{
		
		Log.info("Verificando el total de cartas en el mazo");
		sd.checkTotal();
		sd.navegar(driver, url);
		Thread.sleep(1000);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
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
