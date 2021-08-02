package selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation {
	
	@Test
	public void ElementSnap() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		WebElement Miclogo = d.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		int height = Miclogo.getRect().getDimension().getHeight();
		int width = Miclogo.getRect().getDimension().getWidth();
		int x = Miclogo.getRect().getX();
		int y = Miclogo.getRect().getY();
		
		
		System.out.println("height"+height +" "+ "width"+width + "X value"+x + "Y value"+y);
		
		
	}

}
