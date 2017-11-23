package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://eenadupellipandiri.net/register");
		
		driver.findElement(By.id("name")).sendKeys("ravikanth");
		
		driver.findElement(By.name("name")).clear();
		
		driver.findElement(By.className("textlbl")).sendKeys("vmware");
		
		driver.findElement(By.xpath(".//*[@id='name']")).clear();
		
		
		
		//driver.findElement(By.linkText("Register Now")).click();
		
		driver.findElement(By.partialLinkText("Register")).click();
	}

}
