package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public void clickElement(WebDriver driver, WebElement elemento) {
		js.highLight(driver, elemento);
        elemento.click();
    }
	public void clickElementFocus( WebDriver driver, WebElement elemento) {
		js.moveyhightlight(driver, elemento);
		elemento.click();	
	}
	public void clickCarta(WebDriver driver, String carta) throws InterruptedException {
		WebElement crd = driver.findElement(By.xpath(carta));
		js.moveyhightlight(driver, crd);
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(carta)));
		
		
		if(crd.isDisplayed()) {
		crd.click();
		}
	}
	public void cursorTo(WebDriver driver, WebElement elemento) {
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
	public void navegar(WebDriver driver, String url) {
		driver.get(url);
		js.waitForPageToLoad(driver);
	}
	public void esperarxpath(WebDriver driver, String elemento) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento)));
		
	}
	public void esperarWeb() {
		js.waitForPageToLoad(driver);
	}
	
}
