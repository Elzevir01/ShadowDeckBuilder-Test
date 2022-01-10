package Data;
import org.testng.annotations.DataProvider;

public class DataP {
	
	@DataProvider(name="deckCards")
	public String[][] cardData(){
        return new String[][] {
            {"Vampiro Carmesí"},//x3
            {"Colgante de Sangre Fresca"},//x3
            {"Licántropa Peleona"},//x3
            {"Diabla de los Accesorios"},//x3
            {"Garra Afilada"},//x3
            {"Orden Oscura"},//x3
            {"Urias, Vampiro del Fin"},//x3
            {"Vampira del Cielo Nocturno"},//x3
            {"Caballera Oscura del Purgatorio"},//x2
            {"Diva Demoniaca"},//x2
            {"Diabla Señorial"},//x3
            {"Ogro de la Desolación"},//x3
            {"Xeno-Diabolos "},//x1
            {"Gran Demonio de las Fieras"},//x2
            {"Lobo Oscuro Traicionero"}//x3
            
        };  

}
}
