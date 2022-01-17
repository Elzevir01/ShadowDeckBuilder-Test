package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Js.jScript;

public class ShadowCode extends PageModel.Base{

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
	public void codeConfirm() {
		js.highLight(driver, code);
		sendKey(driver, code, "tglh");
		js.highLight(driver, aceptar);
		aceptar.click();
		js.waitForPageToLoad(driver);
	}

}
