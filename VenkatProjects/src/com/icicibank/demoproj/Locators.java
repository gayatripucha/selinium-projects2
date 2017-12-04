package com.icicibank.demoproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eenadupellipandiri.net/");
		driver.findElement(By.id("reg_name")).sendKeys("xyz");
		driver.findElement(By.name("reg_name")).clear();
		//driver.findElement(By.className("form-control_main dfocus")).sendKeys("abcd");
		driver.findElement(By.xpath(".//*[@id='reg_name']")).sendKeys("abcd");
		//driver.findElement(By.linkText("Pellipandiri Branches")).click();
		WebElement ab = driver.findElement(By.partialLinkText("Branches"));
		ab.click();
		
		List<WebElement> bc = driver.findElements(By.tagName("a"));
		for(int i=0;i<bc.size();i++)
		{
			if(!bc.get(i).getText().isEmpty())
			{
				System.out.println(bc.get(i).getText());
			}
			
		}
	}

}
