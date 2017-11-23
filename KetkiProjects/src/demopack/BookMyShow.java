package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.findElement(By.xpath("//input[@id='inp_RegionSearch_top']")).sendKeys("hyderabad");
		

	}

}
