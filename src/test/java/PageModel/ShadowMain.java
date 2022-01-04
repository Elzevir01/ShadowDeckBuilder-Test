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
	   @FindBy(css = "html.mti-inactive body#page-home.category-home div#site-wrapper.top header#site-header h1.logo-third a img")
	   WebElement icono;
	   @FindBy(css = "html.mti-inactive body#page-home.category-home div#site-wrapper.top footer#site-footer div.footer-share-btns div.footer-share-btns-inner ul.footer-link-banners li a img")
	   WebElement portal;
	   
	   /////CONSTRUCTOR/////
	   public ShadowMain(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   /////METODOS/////
}   
