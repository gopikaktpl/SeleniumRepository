package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertObsqura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		//WebElement clickme=driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		//clickme.click();
		
		//driver.switchTo().alert().accept();
		
		//WebElement clickme2= driver.findElement(By.xpath("//*[@class='btn btn-warning']"));
		//clickme2.click();
		
		//driver.switchTo().alert().dismiss();
		
		WebElement clickforpromptbox =driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		clickforpromptbox.click();
		
		driver.switchTo().alert().sendKeys("gopika");
		driver.switchTo().alert().accept();
		
		
	}

}
