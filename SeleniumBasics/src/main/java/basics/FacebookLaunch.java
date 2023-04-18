package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Browser drivers\\Edge driver\\msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.quit();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
	}

}
