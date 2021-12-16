package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertconfirmationActitimeTaskCancelpopoups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();  
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("dipti");
        driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
        
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
         //cancel popups
         alt.dismiss();
	}

}
