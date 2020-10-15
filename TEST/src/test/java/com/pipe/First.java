package com.pipe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class First {

	
	@Test
	public void getTest()
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeOptions options= new ChromeOptions();
		options.addArguments("---headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
				System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	public static void main(String[] args) 
	{
		TestListenerAdapter adap = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {First.class});
		testng.addListener(adap);
		testng.run();

	}

}
