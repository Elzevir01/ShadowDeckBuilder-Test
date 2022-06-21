package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShadowDeck extends PageModel.Base {

	//WebDriver driver;
	///// ELEMENTOS WEB/////
	private By ilimitado = By.xpath("//li[text()='Ilimitado']");
	//private By checkIlimitado = By.xpath("//p[text()='Ilimitado']");
	private By checkRotacion = By.xpath("//p[text()='Rotación']");
	
	
	// --- check de 40 cartas ---//

	private By checkTotal = By.cssSelector(".deckbuilder-deck-count-total");

	///// CONSTRUCTOR/////
	public ShadowDeck(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ilimitado() {
		try {
		findElemento(ilimitado).click();
		Thread.sleep(3000);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	public boolean checkRotacion() throws InterruptedException {
		return checkElement(checkRotacion);
	}
	public void esperarIlimitado() {
		esperarElemento(ilimitado);
	}
	public String checkTotal() {
			return findElemento(checkTotal).getText();
	}
}
