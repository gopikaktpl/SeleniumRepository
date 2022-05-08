package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WinHandleExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parentWindow= driver.getWindowHandle();
		
		 WebDriverWait explicitwait= new WebDriverWait(driver, 10);
		 WebElement openNewWindow= driver.findElement(By.id("newWindowBtn"));
		 explicitwait.until(ExpectedConditions.elementToBeClickable(openNewWindow));
		 openNewWindow.click();
		 
		 Set<String> childWindow= driver.getWindowHandles();
			
			Iterator<String>iterator= childWindow.iterator();
			
			while(iterator.hasNext())
			{
				String childWindow1= iterator.next();
				if(!parentWindow.equalsIgnoreCase(childWindow1))
				{
					driver.switchTo().window(childWindow1);
					
					WebElement firstname= driver.findElement(By.xpath("//*[@id='firstName']"));
					firstname.sendKeys("gopika");
					Thread.sleep(2000);
				}
			}
			driver.switchTo().window(parentWindow);
			driver.quit();
					
		 
		
	}

}
