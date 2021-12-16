package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertconfirmationActitimeOkCancelpopups 
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
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Types of Work']")).click();
        driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        driver.findElement(By.id("name")).sendKeys("paa");
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='active']"));
        Select sel=new Select(dropdown);
        sel.selectByVisibleText("archived");
        driver.findElement(By.xpath("//label[@for='billingType_setBillable']")).click();
        driver.findElement(By.xpath("//input[@id='billingRate_input']")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='swagi']/../..//a[contains(text(),'delete')]")).click();
        
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
        //ok popups
        //alt.accept();
        
        //cancel popups
        alt.dismiss();
       
	}

}
