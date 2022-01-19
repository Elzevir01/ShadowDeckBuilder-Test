package DeckBuildTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
//import jdk.internal.org.jline.utils.Log;

import PageModel.ShadowCode;

import Data.DataC;

import Driver.BrowserFactory;
import Driver.DriverFactory;

@Test
public class TestDeckBuild {
	
	String url = "https://shadowverse-portal.com/deck/3.6.78Hw2.78Hw2.78Hw2.7JkqI.7JkqI.7JkqI.7C8VI.7C8VI.7C8VI.7NYU2.7NYU2.7NYU2.7JpyQ.7JpyQ.7JpyQ.7G1X6.7G1X6.7G1X6.7Jrfy.7Jrfy.7Jrfy.78Moi.78Moi.7F_4Y.7F_4Y.7JmnI.7JmnI.7JmnI.7FwCM.7FwCM.7FwCM.78PEy.78PEy.7G1Wy.7G1Wy.7JmnS.7JmnS.7JmnS.7Jrfo.7JkLM?lang=en";
	WebDriver driver;
	Logger Log = Logger.getLogger(TestDeckBuild.class);
	BrowserFactory bf = new BrowserFactory();

	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;
	ShadowCode sc;// posterior
	
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
		//sd.formatoIlimitado();
		Log.info("Verificando y seleccionando formato ilimitado");
		sd.checkClickIlimitado();
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
