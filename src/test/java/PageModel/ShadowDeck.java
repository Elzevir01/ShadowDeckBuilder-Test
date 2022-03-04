package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowDeck extends PageModel.Base {

	WebDriver driver;
	///// ELEMENTOS WEB/////
	@FindBy(css = ".bl-header-logo-image")
	WebElement logo;
	@FindBy(xpath = "//li[text()='Ilimitado']")
	WebElement ilimitado;
	@FindBy(xpath = "//p[text()='Ilimitado']")
	WebElement checkIlimitado;
	@FindBy(xpath = "//p[text()='Rotación']")
	WebElement checkRotacion;

	// ---rareza dew carta---//
	@FindBy(css = "li.is-wide:nth-child(5) > span")
	WebElement rarezaLegendaria;
	@FindBy(css = "div.filter-by-card-info-item:nth-child(5) > ul:nth-child(2) > li")
	WebElement rarezaTodo;

	// ---tipo de carta---//
	@FindBy(css = "div.filter-by-card-info-item:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > span")
	WebElement tipoHechizos;
	@FindBy(css = "div.filter-by-card-info-item:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > span")
	WebElement tipoTodo;

	// ---desplegable deckbuilder->code---//
	@FindBy(css = "li.bl-navi-menu-item:nth-child(3)")
	WebElement deckBuilder;
	@FindBy(css = ".js-jump-to-hash")
	WebElement deckCodee;
	
	// --- check de 40 cartas ---//
	@FindBy(css =".deckbuilder-deck-count-total")
	WebElement checkTotal;

	///// CONSTRUCTOR/////
	public ShadowDeck(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ilimitado() {
		try {
		clickElement(driver, ilimitado);
		Thread.sleep(3000);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	public boolean checkRotacion() throws InterruptedException {
		return checkElement(checkRotacion);
	}
	public void esperarIlimitado() {
		esperarxpath(driver, "//p[text()='Ilimitado']");
	}
	public String checkTotal() {
			return checkTotal.getText();
	}
}
