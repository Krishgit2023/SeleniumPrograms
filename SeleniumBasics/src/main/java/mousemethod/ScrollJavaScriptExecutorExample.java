package mousemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollJavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//to scroll in mouse
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		//js.executeScript("alert('Krishna')");
		
		//to scroll to particular element
		WebElement AmazonElement = driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
		js.executeScript("arguments[0].scrollIntoView();", AmazonElement);
		
		//to click an element after scroll
		js.executeScript("arguments[0].click();",AmazonElement);
		
		//to press particular key
		//Actions actions = new Actions(driver);
		//actions.keyPress(Keys.ENTER).build().perform();

	}

}
