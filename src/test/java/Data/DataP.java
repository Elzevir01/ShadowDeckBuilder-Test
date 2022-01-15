package Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class DataP {
	/////WEB ELEMENT CARTA/////
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119611010.png?202216151']")
	WebElement VampiroCarmesí;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122613010.png?202216151']")
	WebElement ColgantedeSangreFresca;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_118611010.png?202216151']")
	WebElement LicántropaPeleona;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_120621010.png?202216151']")
	WebElement DiabladelosAccesorios;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_100614020.png?202216151']")
	WebElement GarraAfilada;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122634010.png?202216151']")
	WebElement OrdenOscura;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121641030.png?202216151']")
	WebElement UriasVampirodelFin;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122641020.png?202216151']")
	WebElement VampiradelCieloNocturno;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119631020.png?202216151']")
	WebElement CaballeraOscuradelPurgatorio;// x2
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121631010.png?202216151']")
	WebElement DivaDemoniaca;// x2
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122621010.png?202216151']")
	WebElement DiablaSeñorial;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121611030.png?202216151']")
	WebElement OgrodelaDesolación;// x3
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119641020.png?202216151']")
	WebElement XenoDiabolos;// x1
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121641020.png?202216151']")
	WebElement GranDemoniodelasFieras;// x2
	@FindBy(css = "//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122621020.png?202216151']")
	WebElement LoboOscuroTraicionero;// x3
	
	@DataProvider(name="deckCards")
	public Object[][] cardData(){
        return new Object[][] {
        	{ VampiroCarmesí, 3 },
			{ ColgantedeSangreFresca, 3 },
			{ LicántropaPeleona, 3 },
			{ DiabladelosAccesorios, 3 },
			{ GarraAfilada, 3 },
			{ OrdenOscura, 3 },
			{ UriasVampirodelFin, 3 },
			{ VampiradelCieloNocturno, 3 },
			{ CaballeraOscuradelPurgatorio, 2 },
			{ DivaDemoniaca, 2 },
			{ DiablaSeñorial, 3 },
			{ OgrodelaDesolación, 3 },
			{ XenoDiabolos, 1 },
			{ GranDemoniodelasFieras, 2 },
			{ LoboOscuroTraicionero, 3 } 	
        };  

}
}


/*
//Vampiro Carmesí//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119611010.png?202216151']"},
//Colgante de Sangre Fresca//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122613010.png?202216151']"},
//Licántropa Peleona//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_118611010.png?202216151']"},
//Diabla de los Accesorios//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_120621010.png?202216151']"},
//Garra Afilada//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_100614020.png?202216151']"},
//Orden Oscura//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122634010.png?202216151']"},
//Urias, Vampiro del Fin//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121641030.png?202216151']"},
//Vampira del Cielo Nocturno//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122641020.png?202216151']"},
//Caballera Oscura del Purgatorio//x2
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119631020.png?202216151']"},
//Diva Demoniaca//x2
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121631010.png?202216151']"},
//Diabla Señorial//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122621010.png?202216151']"},
//Ogro de la Desolación//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121611030.png?202216151']"},
//Xeno-Diabolos//x1
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_119641020.png?202216151']"},
//Gran Demonio de las Fieras//x2
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_121641020.png?202216151']"},
//Lobo Oscuro Traicionero//x3
{"//img[@src='https://shadowverse-portal.com/image/card/phase2/common/C/C_122621020.png?202216151']"}
*/