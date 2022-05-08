package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		//WebElement onewayRadio = driver.findElement(By.xpath("//input[@value='oneway']"));
		//System.out.println(onewayRadio.isDisplayed());-to check the option is available.
		//onewayRadio.click();
		//System.out.println(onewayRadio.isEnabled());
		
		WebElement agileProject = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		System.out.println(agileProject.isDisplayed());
		agileProject.click();
		
		
	}

}
