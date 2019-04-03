		

package firstproject;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	
    private WebDriver driver;		

	

  @Test
	public void testEasy() {	
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromdriver.exe");
		//WebDriver driver= new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
        }
  @BeforeTest
  public void BeforeTest() {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
         driver= new ChromeDriver();
  
		}		

    @AfterTest
  public void afterTest() {
    	driver.quit();
  }

}
