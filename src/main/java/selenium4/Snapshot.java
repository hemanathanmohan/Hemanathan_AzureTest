package selenium4;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {
	
	@Test
	public void ElementSnap() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		WebElement Miclogo = d.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		File MicscreenshotAs = Miclogo.getScreenshotAs(OutputType.FILE);
/*		File dest = new File("mic.png");*/
		String dateformat = Dateformat();
		System.out.println("dateformat"+dateformat);
			File des = new File("mic"+dateformat+".png");
		FileUtils.copyFile(MicscreenshotAs, des);
		d.close();
		
		
	}
public String Dateformat() {
		
		String pattern;
		DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
		Date da = new Date();
		String Dates = df.format(da);
		return Dates;
	}
	

}
