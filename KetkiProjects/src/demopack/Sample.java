package demopack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.navigate().back();
			
			Thread.sleep(7000);
			
			driver.navigate().forward();
			
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			String a=driver.getTitle();
			System.out.println(a);
			
			String url=driver.getCurrentUrl();
			System.out.println(url);	
			
			driver.quit();
		
	}

}
