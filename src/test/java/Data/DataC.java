package Data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataC {
	///// WEB ELEMENT CARTA/////
	private By VampiroCarmesí = By.xpath("//img[contains(@src, 'C_119611010.png')]");
	// x3
	private By ColgantedeSangreFresca = By.xpath( "//img[contains(@src, 'C_122613010.png')]");
	// x3
	private By LicantropaPeleona = By.xpath( "//img[contains(@src, 'C_118611010.png')]");
	// x3
	private By DiabladelosAccesorios = By.xpath( "//img[contains(@src, 'C_120621010.png')]");
	// x3
	private By GarraAfilada = By.xpath( "//img[contains(@src, 'C_100614020.png')]");
	// x3
	private By OrdenOscura = By.xpath( "//img[contains(@src, 'C_122634010.png')]");
	// x3
	private By UriasVampirodelFin = By.xpath( "//img[contains(@src, 'C_121641030.png')]");
	// x3
	private By VampiradelCieloNocturno = By.xpath( "//img[contains(@src, 'C_122641020.png')]");
	// x3
	private By CaballeraOscuradelPurgatorio = By.xpath( "//img[contains(@src, 'C_119631020.png')]");
	// x2
	private By DivaDemoniaca = By.xpath( "//img[contains(@src, 'C_121631010.png')]");
	// x2
	private By DiablaSeñorial = By.xpath( "//img[contains(@src, 'C_122621010.png')]");
	// x3
	private By OgrodelaDesolacian = By.xpath( "//img[contains(@src, 'C_121611030.png')]");
	// x3
	private By XenoDiabolos = By.xpath( "//img[contains(@src, 'C_119641020.png')]");
	// x1
	private By GranDemoniodelasFieras = By.xpath( "//img[contains(@src, 'C_121641020.png')]");
	// x2
	private By LoboOscuroTraicionero = By.xpath( "//img[contains(@src, 'C_122621020.png')]");
	// x3

	@DataProvider(name = "deckCards")
	public Object[][] cardData() {
		return new Object[][] {
				{ VampiroCarmesí, 3,"Vampiro Carmesí" },
				{ ColgantedeSangreFresca, 3,"Colgante de Sangre Fresca" },
				{ LicantropaPeleona, 3,"Lic�ntropa Peleona" },
				{ DiabladelosAccesorios, 3,"Diabla de los Accesorios" },
				{ GarraAfilada, 3,"Garra Afilada" },
				{ OrdenOscura, 3,"Orden Oscura" },
				{ UriasVampirodelFin, 3,"Urias, Vampiro del Fin" },
				{ VampiradelCieloNocturno, 3,"Vampira del Cielo Nocturno" },
				{ CaballeraOscuradelPurgatorio, 2,"Caballera Oscura del Purgatorio" },
				{ DivaDemoniaca, 2,"Diva Demoniaca" },
				{ DiablaSeñorial, 3,"Diabla Señorial" },
				{ OgrodelaDesolacian, 3,"Ogro de la Desolación" },
				{ XenoDiabolos, 1,"Xeno-Diabolos" },
				{ GranDemoniodelasFieras, 2,"Gran Demonio de las Fieras" },
				{ LoboOscuroTraicionero, 3,"Lobo Oscuro Traicionero" }
			};

	}
}