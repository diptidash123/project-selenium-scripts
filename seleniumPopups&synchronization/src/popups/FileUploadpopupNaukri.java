package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopupNaukri
{

	public static void main(String[] args) throws AWTException, InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
		
		StringSelection file=new StringSelection("C:\\Users\\Dipti Dash\\Desktop\\RESUME.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
		
		//StringSelection file1=new StringSelection("C:\\Users\\Dipti Dash\\Desktop\\RESUME.pdf");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,file1);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
