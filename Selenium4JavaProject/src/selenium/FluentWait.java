package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FluentWait {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		
		WebElement userName= driver.findElement(By.xpath("//input[@name='LoginForm[username]']"));
		userName.sendKeys("carol");
		
		WebElement password= driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("1q2w3e4r");
		
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		
		WebDriverWait exwait = new WebDriverWait(driver,10);// explicit wait
		
		exwait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-toggle")));
		driver.findElement(By.className("dropdown-toggle")).click();
		
		/*Wait<WebDriver> wait = new FluentWait <WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(30))
								.pollingEvery(Duration.ofSeconds(5))
								.ignoring(NoSuchElementException.class);
						
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='view full profile']")));
		
		driver.findElement(By.xpath("//*[text()='view full profile']")).click();*/
		
		driver.quit();
		

}
}
