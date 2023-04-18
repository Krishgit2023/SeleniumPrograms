import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement StartButton = driver.findElement(By.xpath("//button[text()='Start']"));
		StartButton.click();
		
		 //explicit wait given by creating WebDriver wait class
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']"))));
		
		
		WebElement HelloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String Message = HelloWorld.getText();
		System.out.println(Message);

	}

}
