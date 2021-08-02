package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito {

	public static void main(String[] args) {
		{
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");		
			WebDriverManager.chromedriver().setup();		
			WebDriver driver = new ChromeDriver(options); 
			driver.get("https://www.google.co.in");
			String Tittle=driver.getTitle();
			System.out.println("Tittle of Page is"+Tittle);
		}
	}

	

}
