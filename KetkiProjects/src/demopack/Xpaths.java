package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://eenadupellipandiri.net/register");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravikanth");
		
		driver.findElement(By.xpath("(//input[@class='textlbl'])[1]")).clear();
		
		driver.findElement(By.xpath("//input[@class='textlbl'][@id='name']")).sendKeys("vmware");
		
		driver.findElement(By.xpath("//div[@class='regdatablock'][1]/div[1]/input[@id='name']")).clear();
		
		
		
		

	}

}
