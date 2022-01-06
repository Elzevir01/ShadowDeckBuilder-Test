package Js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jScript {
	
	private JavascriptExecutor js;
	String pageLoadStatus = "";
	/////ELEMENTO SELECCIONADO EN ROJO/////
	public boolean highLight(WebDriver driv, WebElement element) {
		js = (JavascriptExecutor) driv;
		for (int iC = 0; iC < 3; iC++) {
			try {
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red')", element);
				Thread.sleep(150);
				js.executeScript("arguments[0].setAttribute('style', 'border:')", element);
				Thread.sleep(150);
			} catch (Exception e) {
				System.err.println("JavaScript | Method: hightlight | Exception desc: " + e.getMessage());
			}

		}
		return true;
	}
	/////ESPERAR CARGA DE PAGINA/////
	public boolean waitForPageToLoad(WebDriver driv) {
		try {
			do {
				js = (JavascriptExecutor) driv;
				pageLoadStatus = (String) js.executeScript("return document.readyState");
			} while (!pageLoadStatus.equals("complete"));

		} catch (Exception e) {
			System.err.println("JavaScript | Method: waitForPageToLoad | Exception desc: " + e.getMessage());
		}
		return true;

	}
}
