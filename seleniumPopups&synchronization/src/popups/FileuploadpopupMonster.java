package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FileuploadpopupMonster
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange']")).click();
		
		StringSelection file=new StringSelection("C:\\Users\\Dipti Dash\\Desktop\\RESUME.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		
		
		
	}

}
