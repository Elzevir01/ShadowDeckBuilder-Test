package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowMain extends PageModel.Base {
	   
		WebDriver driver;
	   
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
	   
	   /////METODOS/////
	  
	   public boolean checkLogo() {
		  return checkElement(logo);
	   }
	   public void portalClick() {
		   clickElementFocus(driver, portal);//
	   }
}   
