package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowMain {
	   
		WebDriver driver;
	   String pageLoadStatus = "";
	   
	   /////ELEMENTOS WEB/////
	   @FindBy(css = ".logo-third > a:nth-child(1) > img")
	   WebElement icono;
	   @FindBy(css = ".footer-link-banners > li:nth-child(1) > a:nth-child(1) > img")
	   WebElement portal;
	   
	   /////CONSTRUCTOR/////
	   public ShadowMain(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   public ShadowMain() {
		   
	   }
	   /////METODOS/////
	   public void getIcono() {
		   driver.findElement((By) icono);
	   }
	   public void clickPortal() {
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portal);
		   portal.click();
	   }
	   
}   
