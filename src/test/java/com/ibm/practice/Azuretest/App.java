package com.ibm.practice.Azuretest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
	@Test(groups = { "include-test-one" })
	public void testMethodOne() throws Throwable  {
		System.out.println("Test method one");
		WebDriverManager.chromedriver().setup();

		ChromeDriver d = new ChromeDriver();

		d.get("https://shop.advanceautoparts.com/");
		Thread.sleep(3000);
		d.quit();
	}


}