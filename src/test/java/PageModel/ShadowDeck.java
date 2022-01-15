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
	@FindBy(css = ".is-format-1")
	WebElement ilimitado;
	@FindBy(css = ".deckbuilder-deck-title-format")
	WebElement checkFormato;
	@FindBy(css = ".deckbuilder-deck-save-button")
	WebElement guardarCambios;

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

	///// CONSTRUCTOR/////
	public ShadowDeck(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ShadowDeck() {
	}
	
	public void formatoIlimitado() throws InterruptedException {
		clickElement(driver, ilimitado);
		Thread.sleep(4000);
		//checkText
	}
	public void guardar() {
		clickElement(driver, guardarCambios);
	}
}
