package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Js.jScript;

public class Base {
	WebDriver driver;
	jScript js = new jScript();
	
	///// CONSTRUCTOR/////
	public Base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public Base() {
	}
	
	////METODOS/////
	public void clickElement(WebDriver driver, WebElement elemento) {//WebDriver driver,
		js.highLight(driver, elemento);
        elemento.click();
    }
	public void clickElementFocus( WebDriver driver, WebElement elemento) {//WebDriver driver,
		js.moveyhightlight(driver, elemento);
		elemento.click();
		js.waitForPageToLoad(driver);
	}
	public void clickExtLink(WebDriver driver, WebElement elemento) {//WebDriver driver,
		//js.highLight(driver, elemento);
		js.moveyhightlight(driver, elemento);
        elemento.click();
        js.waitForPageToLoad(driver);
    }
	
	public void sendKey(WebDriver driver, WebElement elemento, String texto) {//WebDriver driver, 
		js.highLight(driver, elemento);
		elemento.sendKeys(texto);
	}
	public void cursorTo(WebDriver driver, WebElement elemento) {//WebDriver driver, 
		js.highLight(driver, elemento);
		new Actions(driver).moveToElement(elemento).perform();
	}
	public boolean checkElement(WebElement elemento) {
	    try {
	    	if (elemento.isDisplayed()) {
	    		System.out.println("Element exist");
			}
	    	return true;
	    }catch(org.openqa.selenium.NoSuchElementException e) {
	    	System.out.println("Element NO exist");
	    	return false;
	    }
	}
	
}
