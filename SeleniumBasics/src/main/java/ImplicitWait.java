import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait given
		WebElement StartButton = driver.findElement(By.xpath("//button[text()='Start']"));
		StartButton.click();
		WebElement HelloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String Message = HelloWorld.getText();
		System.out.println(Message);

	}

}
