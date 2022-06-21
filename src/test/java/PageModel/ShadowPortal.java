package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShadowPortal extends Base{
	
	///// ELEMENTOS WEB/////
	
	// ---desplegable idioma->idioma-- //
	private By lenguaje = By.xpath("//p[contains(text(), 'Language')]");
	private By español = By.cssSelector(".es > a");

	// ---boton urias--//
	private By urias = By.cssSelector("li.top-character:nth-child(6) > img");
	private By uriasbuildDeck = By.cssSelector("li.top-slider-list:nth-child(6) > div:nth-child(3) > a");

	///// CONSTRUCTOR/////
	public ShadowPortal(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//// METODOS/////
	public void portalEspañol() throws InterruptedException {
		cursorTo(lenguaje);
		findElemento(español).click();;
		Thread.sleep(2000);
	}
	public void portalUrias() throws InterruptedException {
		findElemento(urias).click();;
		findElemento(uriasbuildDeck).click();;
		Thread.sleep(4000);
	}
	
	
}
