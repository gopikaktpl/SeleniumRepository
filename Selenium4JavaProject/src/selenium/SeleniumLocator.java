package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.opesmount.in/grocerystore1/");
		
		//by css selector .
		driver.get("http://www.opesmount.in/grocerystore1/index.php?route=account/login");
		driver.manage().window().maximize();
		//WebElement email = driver.findElement(By.cssSelector("input.form-control"));
		//WebElement email = driver.findElement(By.cssSelector("input#input-email"));
		WebElement email = driver.findElement(By.cssSelector("input[name=email]"));
		email.sendKeys("gopikaktpl@gmail.com");
		
		
		
		
		//by tag name
		//WebElement searchbox=driver.findElement(By.tagName("input"));
		//searchbox.sendKeys("contact",Keys.ENTER);
		//by name
		//WebElement searchbox= driver.findElement(By.name("search"));
		//searchbox.sendKeys("contact",Keys.ENTER);
		//searchbox.sendKeys("contact");
		//by classname
		//WebElement searchbutton= driver.findElement(By.className("fa fa-search"));
		//searchbutton.click();
		
		//by link
		//WebElement Register = driver.findElement(By.linkText("Register"));
		//Register.click();
		 
		//driver.switchTo().alert().dismiss();  to dismiss popup or alert message.
		
		//partial link
		//WebElement ForgotPassword= driver.findElement(By.partialLinkText("Forgotten"));
		//ForgotPassword.click();
				
	
		//driver.close();
		
	}

}
