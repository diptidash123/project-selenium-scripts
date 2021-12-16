package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentChildBrowserNaukri 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[5]")).click();
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[6]")).click();
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[4]")).click();
		
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());
		
		ArrayList<String> al=new ArrayList<>(a);
		System.out.println(al.size());
		
	   
	    driver.switchTo().window(al.get(4));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("(//span[.='Contact Us'])[2]")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
		
		driver.switchTo().window(al.get(3));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
		
		driver.switchTo().window(al.get(2));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("(//span[.='Contact Us'])[2]")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
	    
		driver.switchTo().window(al.get(1));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("(//a[.='About Us'])[1]")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
		
		/*driver.switchTo().window(al.get(4));
		driver.close();
		
		driver.switchTo().window(al.get(3));
		driver.close();
		
		driver.switchTo().window(al.get(2));
		driver.close();
		
		driver.switchTo().window(al.get(1));
		driver.close();*/
		
	
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.close();

		
	}

}
