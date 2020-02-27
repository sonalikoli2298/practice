package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lalitha");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(driver.getTitle(), "Home");
	  driver.findElement(By.ByPartialLinkText("Signout")).click();  
  }
  @BeforeTest
  public void openApplication() {
  System.setProperty("webdriver.chrome.driver", "C:\\SONALI\\chrome\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://10.232.237.143/TestMeApp");
  driver.manage().window().maximize();
  }

  @AfterTest
  public void closeApplication() {
  driver.close();
  }
}
