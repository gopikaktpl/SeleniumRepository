package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Product ']")));
		//driver.findElement(By.xpath("//*[text()='Product ']")).click();
		
		//WebElement product=driver.findElement(By.xpath("//*[text()='Product ']"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(product));
		//product.click();
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product ']")));
		//WebElement product= driver.findElement(By.xpath("//*[text()='Product ']"));
		//product.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product ']")));
		WebElement product= driver.findElement(By.xpath("//*[text()='Product ']"));
		System.out.println(product.getText());
		
		
		//driver.quit();

		
		
	}

}
