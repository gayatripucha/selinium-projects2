package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class XpathLocators 
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://eenadupellipandiri.net/register");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@class='textlbl'][@name='email']")).sendKeys("ravilella.1981@gmail.com");
		
		//driver.findElement(By.name("gender")).click();
		
		
		driver.findElement(By.xpath("//input[@value='F']")).click();
		
		driver.findElement(By.xpath("//div[@class='regdatablock'][1]/div[1]/input[@id='name']")).clear();
		

	}

}
