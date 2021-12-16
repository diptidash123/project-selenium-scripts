package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentIndigoCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/");
		//depart
		driver.findElement(By.xpath("(//input[@placeholder='Departure Date'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[8]")).click();
		
		//return
		driver.findElement(By.xpath("(//input[@placeholder='Return Date'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[11]")).click();
		
	}

}
