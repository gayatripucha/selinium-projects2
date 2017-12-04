package com.icicibank.homeloans;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	static WebDriver driver;
	
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("http://www.angelfire.com/super/badwebs/");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.name("contents")));
		System.out.println(driver.findElement(By.xpath("(//a[@target='_blank'])[2]/font")).getAttribute("innerHTML"));
		
		
		/*String actval = driver.findElement(By.linkText("Register Now")).getAttribute("innerHTML");
		String expval="Register Now ";
		
		System.out.println("Actual value is : "+ actval);
		System.out.println("Expected value is : "+ expval);
		
		if(actval.contentEquals(expval))
		{
			System.out.println("both are equal..");
		}else
		{
			System.out.println("both are not equal..");
		}*/
		
		
		
		/*driver.findElement(By.id("lst-ib")).sendKeys("vmware");
		String txt = driver.findElement(By.id("lst-ib")).getAttribute("value");
		System.out.println(txt);*/
		
		
		/*String actval = driver.getPageSource();
		String expval="Google";
		
		if(actval.contains(expval))
		{
			System.out.println("both are equal..");
		}else
		{
			System.out.println("both are not equal..");
		}*/
		
		
		/*driver.findElement(By.name("reg_name")).clear();
		
		//driver.findElement(By.className("form-control_main dfocus")).sendKeys("ravilella");
		
		driver.findElement(By.xpath(".//*[@id='reg_name']")).sendKeys("ravilella");

		//driver.findElement(By.linkText("Pellipandiri Branches")).click();
		
		driver.findElement(By.partialLinkText("Pellipandiri")).click();
		
		List<WebElement> lst = driver.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++)
		{
			if(!lst.get(i).getText().isEmpty())
			{
				String txt = lst.get(i).getText();	
				System.out.println(txt);
			}
			
		}*/
	}

}
