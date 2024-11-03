package com.priyalmultani.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	public static WebDriver driver = null;
	public WebDriverWait wait;
	public static Properties sitedata = null;
	
	@BeforeClass
	public void startUP() throws Exception
	{
		sitedata = new Properties();
		FileInputStream fi = new FileInputStream("./src/main/resources/propertiesData/AmazonData.properties");
		sitedata.load(fi);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get(sitedata.getProperty("url"));
	}
	
	public static WebElement isElementPresent(String propKey)
	{
		try {
			if(propKey.contains("xpath"))
			{
				return driver.findElement(By.xpath(sitedata.getProperty(propKey)));
			}
			else if(propKey.contains("id"))
			{
				return driver.findElement(By.id(sitedata.getProperty(propKey)));
			}
			else if(propKey.contains("linkText"))
			{
				return driver.findElement(By.linkText(sitedata.getProperty(propKey)));
			}
			else if(propKey.contains("name"))
			{
				return driver.findElement(By.name(sitedata.getProperty(propKey)));
			}
			
		}catch(Exception e)
		{
			
		}
		return null;
		
	}
	
	@AfterClass
	 public void tearDown() {
				driver.quit();
	    }
			
}
