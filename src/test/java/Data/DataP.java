package Data;
import org.testng.annotations.DataProvider;

public class DataP {
	
	@DataProvider(name="deckCards")
	public String[][] cardData(){
        return new String[][] {
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
            
        };  

}
}
