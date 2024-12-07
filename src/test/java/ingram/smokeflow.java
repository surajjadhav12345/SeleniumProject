package ingram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smokeflow extends BaseClass {
public static void main(String[] args) throws Throwable {
	
	smokeflow s= new smokeflow();
	s.initilizeBrowers();
	WebDriver driver = s.driver;

	driver.findElement(By.xpath("//button[@data-testid='btn_TopCornerLogin']")).click();
	driver.findElement(By.xpath("//input[@id='okta-signin-username']")).sendKeys(utilityClass.getTD(0, 1));
	driver.findElement(By.xpath("//input[@id='okta-signin-password']")).sendKeys(utilityClass.getTD(1, 1));
	driver.findElement(By.xpath("//input[@id='okta-signin-submit']")).click();
	
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@id='mui-6']")).sendKeys("04RK02",Keys.ENTER);
	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
 WebElement details = driver.findElement(By.xpath("//div[@class='MuiBox-root css-lah2a1']"));
 //System.out.println(details.getText());
 List<WebElement> details1 = driver.findElements(By.xpath("//div[@class='no-print css-tr6ge4-MuiStack-root']//child::div[2]//child::span[2]"));
	
 for(WebElement single:details1) {
	 String singledetail = single.getText();
	 
	 System.out.println(singledetail);
	// if(sku.equals(singledetail)) {
	//	 System.out.println("testcase passed");
	// }
 }
			
 
 
 driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//descendant::button[@data-testid='08JL84-AddToCartBtn']")).click();	
 driver.findElement(By.xpath("//button[@aria-label='Cart']")).click();
 driver.findElement(By.xpath("//button[@data-testid='btnAddEndUser']")).click();
 driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("ingram",Keys.ENTER);
 driver.findElement(By.xpath("//span[@data-testid='1-SelectEndUser-RadioBtn']")).click();
 driver.findElement(By.xpath("//button[text()='Select']")).click();
 Thread.sleep(5000);
 driver.findElement(By.xpath("//button[text()='Checkout']")).click();
 driver.findElement(By.xpath("//input[@placeholder='Enter PO number']")).sendKeys("US-345",Keys.ENTER);
	}

	
	
}
	
	
	//String productname = driver.findElement(By.xpath("//div[@data-testid='pdp_ProductTitle']")).getText();
	//System.out.println(productname);
	


