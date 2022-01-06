package DeckBuildTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import PageModel.ShadowMain;
import PageModel.ShadowPortal;
import Driver.BrowserFactory;
import Driver.DriverFactory;
import PageModel.ShadowMain;

@Test
public class TestDeckBuild {
	WebDriver driver;
	BrowserFactory bf = new BrowserFactory();
	ShadowMain sm ;
	ShadowPortal sp;
	
	@Test
	public void test() throws InterruptedException{//borrar {
		sm= new ShadowMain(driver);
		sm.clickPortal();
		//Thread.sleep(5000);///borrar
		
		//---cambiar de pestaña---//
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));//driver.switchTo().window(tabs2.get(0));
	    
	    //---pestaña portal---//
		sp= new ShadowPortal(driver);
		sp.clickUrias();
		sp.clickdeckBuilder();
	}
  @BeforeClass
  public void build() {//String Browser, String url
	  
	  DriverFactory.getInstance().setDriver(bf.createBrowserIntance("CHROME"));
	  driver = DriverFactory.getInstance().getDriver();
	  
	  
  }

  @AfterClass
  public void tearDown() {
	  bf.removeDriver();
  }


}
