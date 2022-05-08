package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndTrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			Actions action=new Actions(driver);
			
			WebElement elementDrag= driver.findElement(By.xpath("(//*[@class='button button-orange'])[2]"));
			WebElement elementDrop= driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
			
			action.dragAndDrop(elementDrag, elementDrop).build().perform();
			
			//driver.quit();
			
	}

}
