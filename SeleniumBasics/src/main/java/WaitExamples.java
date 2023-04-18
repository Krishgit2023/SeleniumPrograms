import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement StartButton = driver.findElement(By.xpath("//button[text()='Start']"));
		StartButton.click();
		Thread.sleep(6000);   //giving wait time ---will freezes the code until/unless the time provided by user expires as it is hardcorded.
		WebElement HelloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String Message = HelloWorld.getText();
		System.out.println(Message);

	}

}
