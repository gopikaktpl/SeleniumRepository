package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobortclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement browse= driver.findElement(By.xpath("//span[@class='browse']"));
		browse.click();
		
		Thread.sleep(2000);
		
		//robot class object
		Robot rb= new Robot();
		
		//store file path to stringselection class
		StringSelection filepath= new StringSelection("C:\\Users\\DELL NOTEBOOK 3442\\Desktop\\java\\Selenium.pdf");
		
		//copy path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		//press ctrl+v for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_V);
		
		//keyrelase
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_V);
		
		//pressing and relesing of enter
		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("file uploaded");


	}

}
