package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parentWindow= driver.getWindowHandle();
		
		WebElement newtab= driver.findElement(By.id("tabButton"));
		newtab.click();
		
		Set<String> childWindow= driver.getWindowHandles();
		
		Iterator<String>iterator= childWindow.iterator();
		
		while(iterator.hasNext())
		{
			String childWindow1= iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow1))
			{
				driver.switchTo().window(childWindow1);
				WebElement text= driver.findElement(By.id("sampleHeading"));
				System.out.println(text.getText());
				Thread.sleep(2000);
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		driver.quit();
	}

}

