package DeckBuildTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import PageModel.ShadowMain;

import Driver.BrowserFactory;
import Driver.DriverFactory;
import PageModel.ShadowMain;

@Test
public class TestDeckBuild {
	BrowserFactory bf = new BrowserFactory();
	ShadowMain sm ;
	
	@Test
	public void test() {
		sm= new ShadowMain(bf.getInstance());
		
	}
  @BeforeClass
  public void build() {//String Browser, String url
	  
	  DriverFactory.getInstance().setDriver(bf.createBrowserIntance("CHROME"));
	  WebDriver driver = DriverFactory.getInstance().getDriver();
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }


}
