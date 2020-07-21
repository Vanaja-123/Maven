package sample;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class reg {
	@Test
	public void RegisterUser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");	
		wait.until(ExpectedConditions.elementToBeSelected(By.id("ct100_mainContent_rbtnl_Trip_0")));
	    driver.findElement(By.xpath("//input[@value='RoundTrip]")).click();
	    driver.findElement(By.id("ct100_maincontent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.linkText("Kochi (COK)")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("ct100_maincontent_ddl_destinationStation1_CTXT")).sendKeys("GOI");
	    driver.findElement(By.xpath("//td[@data-month='7]/a[text()='24]")).click();
        
		
}
