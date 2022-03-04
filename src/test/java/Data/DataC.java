package Data;

import org.testng.annotations.DataProvider;

public class DataC {
	///// WEB ELEMENT CARTA/////
	String VampiroCarmesí = "//img[contains(@src, 'C_119611010.png')]";
	// x3
	String ColgantedeSangreFresca = "//img[contains(@src, 'C_122613010.png')]";
	// x3
	String LicantropaPeleona = "//img[contains(@src, 'C_118611010.png')]";
	// x3
	String DiabladelosAccesorios = "//img[contains(@src, 'C_120621010.png')]";
	// x3
	String GarraAfilada = "//img[contains(@src, 'C_100614020.png')]";
	// x3
	String OrdenOscura = "//img[contains(@src, 'C_122634010.png')]";
	// x3
	String UriasVampirodelFin = "//img[contains(@src, 'C_121641030.png')]";
	// x3
	String VampiradelCieloNocturno = "//img[contains(@src, 'C_122641020.png')]";
	// x3
	String CaballeraOscuradelPurgatorio = "//img[contains(@src, 'C_119631020.png')]";
	// x2
	String DivaDemoniaca = "//img[contains(@src, 'C_121631010.png')]";
	// x2
	String DiablaSeñorial = "//img[contains(@src, 'C_122621010.png')]";
	// x3
	String OgrodelaDesolacian = "//img[contains(@src, 'C_121611030.png')]";
	// x3
	String XenoDiabolos = "//img[contains(@src, 'C_119641020.png')]";
	// x1
	String GranDemoniodelasFieras = "//img[contains(@src, 'C_121641020.png')]";
	// x2
	String LoboOscuroTraicionero = "//img[contains(@src, 'C_122621020.png')]";
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