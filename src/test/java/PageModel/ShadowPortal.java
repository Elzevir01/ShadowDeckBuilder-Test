package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Js.jScript;

public class ShadowPortal {
	   /////ELEMENTOS WEB/////
	   WebDriver driver;
	   jScript js = new jScript();
	   
	   //---desplegable idioma->idioma--//
	   @FindBy(css = "li.top-character:nth-child(6) > img")//driver.action.move_to(el).perform
	   WebElement language	;///driver.move_to el
	   @FindBy(css = ".es > a:nth-child(1)")
	   WebElement español ;
	   
	   //---boton urias--//
	   @FindBy(css = "li.top-character:nth-child(6) > img")
	   WebElement urias;
	   
	   @FindBy(css ="li.top-slider-list:nth-child(6) > div:nth-child(3) > a")
	   WebElement uriasbuildDeck;
	   
	   //---desplegable deckbuilder->code---//
	   @FindBy(css = "li.bl-navi-menu-item:nth-child(3)")
	   WebElement deckBuilder;   
	   @FindBy(css = ".js-jump-to-hash")
	   WebElement deckCode;
	   
	   /////CONSTRUCTOR/////
	   public ShadowPortal(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   public ShadowPortal() {
		   
	   }
	   ////METODOS/////
	   public void clickUrias() {
		   js.highLight(driver, urias);
		   urias.click();
	   }
	   public void clickdeckBuilder() {
		   js.highLight(driver, uriasbuildDeck);
		   uriasbuildDeck.click();
	   }
}
