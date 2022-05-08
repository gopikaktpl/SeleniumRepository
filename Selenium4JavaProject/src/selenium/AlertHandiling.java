package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandiling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customerID= driver.findElement(By.name("cusid"));
		 customerID.sendKeys("123");
		 
		 WebElement submit= driver.findElement(By.xpath("//*[@name='submit']"));
		 submit.click();
		 
		 driver.switchTo().alert().accept();
		 //Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 
	}

}
