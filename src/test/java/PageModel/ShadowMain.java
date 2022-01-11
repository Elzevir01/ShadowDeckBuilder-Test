package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Js.jScript;

public class ShadowMain extends PageModel.Base {
	   
		WebDriver driver;
		jScript js = new jScript();
	   //String pageLoadStatus = "";
	   
	   /////ELEMENTOS WEB/////
	   @FindBy(css = ".logo-third > a:nth-child(1) > img")
	   WebElement logo;
	   @FindBy(css = ".footer-link-banners > li:nth-child(1) > a:nth-child(1) > img")
	   WebElement portal;
	   
	   /////CONSTRUCTOR/////
	   public ShadowMain(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   
	   public ShadowMain() {
		   
	   }
	   //#####################################################
	   /////METODOS/////
	   /*public void getIcono() {
		   driver.findElement((By) icono);
	   }
	   public void clickPortal() {
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portal);
		   js.highLight(driver, portal);
		   portal.click();
		   js.waitForPageToLoad(driver);
	   }*/
	   //#####################################################
	   public boolean checkLogo() {
		  return checkElement(logo);
	   }
	   public void portalClick() {
		   clickElementFocus(driver,portal);
	   }
}   
