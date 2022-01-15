package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowPortal extends Base{
	
	///// ELEMENTOS WEB/////
	// ---LOGO---//
	@FindBy(css = ".bl-header-logo-image")
	WebElement logo;
	
	// ---desplegable idioma->idioma--//
	@FindBy(css = "li.is-lang") 
	WebElement lenguaje;
	@FindBy(css = ".es > a")
	WebElement español;

	// ---boton urias--//
	@FindBy(css = "li.top-character:nth-child(6) > img")
	WebElement urias;

	@FindBy(css = "li.top-slider-list:nth-child(6) > div:nth-child(3) > a")
	WebElement uriasbuildDeck;

	// ---desplegable deckbuilder->code---//
	@FindBy(css = "li.bl-navi-menu-item:nth-child(3)")
	WebElement deckBuilder;
	@FindBy(css = ".js-jump-to-hash")
	WebElement deckCode;

	///// CONSTRUCTOR/////
	public ShadowPortal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*public ShadowPortal() {

	}*/

	//// METODOS/////
	public void portalEspañol() throws InterruptedException {
		cursorTo(driver, lenguaje);//driver, 
		clickElement(driver, español);//driver, 
		Thread.sleep(2000);
	}
	public void portalUrias() throws InterruptedException {
		clickElement(driver, urias);//driver, 
		clickElement(driver, uriasbuildDeck);//driver,
		Thread.sleep(4000);
	}
	public void portalCode() {
		cursorTo(driver, deckBuilder);//driver, 
		clickElement(driver, deckCode);//driver, 
	}
	public void checkLogo() {
		checkElement(logo);
	}
	
}
