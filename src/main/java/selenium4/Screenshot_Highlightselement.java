package selenium4;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Highlightselement {
	
	@Test
	public void ElementSnap() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		
		WebElement Miclogo = d.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		HighlightElement(Miclogo, d);
		
		TakesScreenshot ts = (TakesScreenshot)d;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
String dateformat = Dateformat();
		File des = new File("google"+dateformat+".png");
	
		FileUtils.copyFile(screenshotAs, des);
		d.close();
		
		
	}
	
	public void HighlightElement(WebElement ele, WebDriver d) {
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
public String Dateformat() {
		
		String pattern;
		DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
		Date da = new Date();
		String Dates = df.format(da);
		return Dates;
	}

}
