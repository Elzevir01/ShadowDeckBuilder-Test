package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Js.jScript;

public class ShadowCode {

	WebDriver driver;
	jScript js = new jScript();

	///// ELEMENTOS WEB/////

	@FindBy(css = "#deckCode")
	WebElement code;
	@FindBy(css = "#deckImport")
	WebElement aceptar;

	///// CONSTRUCTOR/////
	public ShadowCode(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public ShadowCode() {

	}

	////// METODOS /////
	public void code() {
		js.highLight(driver, code);
		code.click();

	}

	public void aceptar() {
		js.highLight(driver, aceptar);
		aceptar.click();
		js.waitForPageToLoad(driver);
	}
}
