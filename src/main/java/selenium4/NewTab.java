package selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {
	
	@Test
	public void ElementSnap() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		
		//to switch to new tab ...method 1
		d.switchTo().newWindow(WindowType.TAB).get("https://mvnrepository.com/");
		
		//to switch to new tab ...method 2
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://mvnrepository.com/");
		Thread.sleep(5000);
		
		d.close();
		
		
	}

}
