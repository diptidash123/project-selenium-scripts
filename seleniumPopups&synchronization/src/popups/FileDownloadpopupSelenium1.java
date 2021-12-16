package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadpopupSelenium1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/Dipti Dash/Downloads/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//td[@data-label='Language'])[2]/..//a[.='Download']")).click();
		
		//Robot r=new Robot();
        /*r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);*/
		
		Robot r1=new Robot();
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(3000);
		    r1.keyPress(KeyEvent.VK_TAB);
		}
		   r1.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
