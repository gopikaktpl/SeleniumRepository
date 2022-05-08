package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
			System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.freecrm.com/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,-1500)");
			
			//WebElement groupCalender= driver.findElement(By.xpath("//*[text()='Group Calendar']"));
			//js.executeScript("arguments[0].scrollIntoView();", groupCalender);
			
	}

}
