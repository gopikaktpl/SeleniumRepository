package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();
		
		WebElement myinfo=driver.findElement(By.id("menu_pim_viewMyDetails"));
		myinfo.click();
		
		
		WebElement contact=driver.findElement(By.linkText("Contact Details"));
		contact.click();
		
		WebElement emergencycontact=driver.findElement(By.linkText("Emergency Contacts"));
		emergencycontact.click();
		
	}

}
