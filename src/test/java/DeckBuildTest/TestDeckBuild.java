package DeckBuildTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageModel.ShadowDeck;
import PageModel.ShadowMain;
import PageModel.ShadowPortal;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import Data.DataC;

import Driver.BrowserFactoryCF;
import Driver.DriverFactory;

@Epic("com.shadowverse")
public class TestDeckBuild {

	WebDriver driver;
	String url;
	//private static Logger Log = LogManager.getLogger(TestDeckBuild.class);
	//Logger Log = Logger.getLogger(TestDeckBuild.class);
	private static Logger Log = LogManager.getLogger(TestDeckBuild.class);
	BrowserFactoryCF bf;// = new BrowserFactory();
	ShadowMain sm;
	ShadowPortal sp;
	ShadowDeck sd;

	@Severity(SeverityLevel.NORMAL)
	@Feature("Shadowverse Deck Build")
	@Story("1) Ingreso a la pagina principal de shadowverse")
	@Link(name = "https://shadowverse.com/", url = "https://shadowverse.com/")
	@Test(priority = 1)
	@Description("Navega desde Shadowverse.com hacia shadowverse-portal.com/deckbuilder/")
	public void test_1_Navegacion() throws InterruptedException {

		// ---web oficcial de shadowverse---//
		BasicConfigurator.configure();
		Log.info("Ingresando a Shadowverse.com");
		sm = new ShadowMain(driver);
		url = "https://shadowverse.com/";
		sm.navegar(driver, url);
		sm.checkLogo();
		Log.info("Click en boton de Portal");
		sm.portalClick();

		// ---cambiar de pesta�a a portal---//
		Log.info("Cambiando a la pesta�a portal");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		// ---pesta�a portal---//
		sp = new ShadowPortal(driver);
		sp.esperarWeb();
		Thread.sleep(3000);
		// sp.checkLogo();//////
		Log.info("Cambiando a idioma espa�ol");
		sp.portalEspañol();
		sp.esperarWeb();
		Log.info("Seleccionando creador de mazo Urias");
		sp.portalUrias();
		sp.esperarWeb();
		
		// ---deck builder---//
		sd = new ShadowDeck(driver);
		Log.info("Verificando y seleccionando formato ilimitado");
		if(sd.checkRotacion()) {
			sd.ilimitado();
			sd.esperarIlimitado();
		}
		sd.esperarWeb();
		
		
	}
	@Severity(SeverityLevel.CRITICAL)
	@Feature("Shadowverse Deck Build")
	@Story("2) Seleccion de las cartas para agregar al deck")
	@Link(name = "https://shadowverse-portal.com/deckbuilder/create", url = "https://shadowverse-portal.com/deckbuilder/create/6?lang=es")
	@Test(priority = 2, dataProvider = "deckCards", dataProviderClass = DataC.class)
	@Description("Localizando cartas del deck y agregando al mazo")
	public void test_2_Construccion(String carta, int numero, String nombre) throws InterruptedException {
		
		//---esperando primera carta---//
		Log.info("Buscando y agregando: "+nombre+" :: numero de veces: "+numero+"");
		
		// ---generar mazo---//
		for (int i = 0; i < numero; i++) {
			sd.clickCarta(driver, carta);
		}

	}

	@Severity(SeverityLevel.TRIVIAL)
	@Feature("Shadowverse Deck Build")
	@Story("3) Check de la cantidad de cartas agregadas")
	@Link(name = "https://shadowverse-portal.com/deckbuilder/",
	url = "https://shadowverse-portal.com/deckbuilder/create/6?lang=es")
	@Test(priority = 3)
	@Description("Checkeo de la cantidad de cartas agregadas(40)")
	public void test_3_Code() throws InterruptedException {
		
		///--verificacion del mazo--///
		Log.info("Verificando el total de cartas en el mazo");
		Log.info("Cantidad de cartas: "+sd.checkTotal());
	}
	
	@BeforeTest
	@Parameters({"browser", "nodeUrl"})
	public void setUp(String browser, String nodeUrl) {
		try {
		bf = new BrowserFactoryCF();
		DriverFactory.getInstance().setDriver(bf.setDriver(browser, nodeUrl));
		driver = DriverFactory.getInstance().getDriver();
		}catch(Exception exc){
			Log.error("Causa : "+exc.getCause());
			Log.error("Mensaje : "+exc.getMessage());
			exc.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		bf.removeDriver();
	}

}
