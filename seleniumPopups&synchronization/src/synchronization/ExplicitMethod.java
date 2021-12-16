package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();

		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("dipti"));
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter"));
		
		//wait.until(ExpectedConditions.titleIs("dipti"));
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dipti")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		//WebElement folder=driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		//wait.until(ExpectedConditions.elementToBeClickable(folder));
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	}

}
