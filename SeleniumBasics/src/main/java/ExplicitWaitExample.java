import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='downloadButton']")));
		
		WebElement StartDownload = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		StartDownload.click();
		
		
		WebElement CancelDownload = driver.findElement(By.xpath("//button[text()='Cancel Download']"));
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Cancel Download']")));
		System.out.println("No cancel button");
		driver.quit();
		

	}

}
