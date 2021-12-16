package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownloadpopupHippo2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/Dipti Dash/Downloads/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://filehippo.com/");
		driver.findElement(By.xpath("(//a[@class='button home-cover__button button--tertiary'])[1]")).click();
		driver.findElement(By.xpath("(//span[.='Download'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Download Latest Version']")).click();

		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
