package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/reservation.php");
			driver.manage().window().maximize();
			
			//WebElement accept= driver.findElement(By.xpath("//*[text()='Accept All']"));
			//accept.click();
			
			WebElement passengersDrop = driver.findElement(By.name("passCount"));
			passengersDrop.click();
			Select select = new Select(passengersDrop);
			//select.selectByIndex(3);
			select.selectByValue("3");
			//select.selectByVisibleText("2");
			
	}

}
