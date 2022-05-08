package selenium;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement plums=driver.findElement(By.xpath("(//*[text()='Plums'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", plums);
		System.out.println(plums.getText());
		
		js.executeScript("window.scrollBy(0,-1500)");
		
		WebDriverWait explictwait=new WebDriverWait(driver,10);
		explictwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Home']")));
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
		//driver.quit();
		
	
	

	}

}
