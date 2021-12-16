package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepMethod 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//NoSuchElementException
		//driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		
	}

}
