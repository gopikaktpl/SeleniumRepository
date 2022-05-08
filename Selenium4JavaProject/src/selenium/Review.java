package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement valueA= driver.findElement(By.xpath("(//*[starts-with(@id,'value')])[1]"));
		valueA.sendKeys("12");
		
		WebElement valueB= driver.findElement(By.xpath("(//*[starts-with(@id,'value')])[2]"));
		valueB.sendKeys("10");
		
		
		
		Actions action =new Actions(driver);
		
		WebElement getTotal=driver.findElement(By.xpath("//*[@id='button-two' and @class='btn btn-primary']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",getTotal);
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(getTotal));
		
		//action.sendKeys(getTotal,Keys.ENTER);
		getTotal.click();
		
		
		
		WebElement message =driver.findElement(By.xpath("//*[@id='message-two']"));
		System.out.println(message.getText());
	}

}
