package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShadowMain extends PageModel.Base {

	// WebDriver driver;

	///// ELEMENTOS WEB/////
	private By logo = By.cssSelector(".logo-third > a:nth-child(1) > img");
	private By portal = By.cssSelector(".footer-link-banners > li:nth-child(1) > a:nth-child(1) > img");
	private By cookies = By.xpath("//a[contains(text(), 'Got it!')]");

	///// CONSTRUCTOR/////
	public ShadowMain(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);

	}

	///// METODOS/////

	public boolean checkLogo() {
		return checkElement(logo);
	}

	public void portalClick() {
		findElemento(portal).click();
	}

	public void clickCookies() {
		findElemento(cookies).click();
	}
}
