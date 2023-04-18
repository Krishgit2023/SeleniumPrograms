package mousemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		
		WebElement RightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement DoubleClickMe = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick().build().perform();
		actions.doubleClick(DoubleClickMe).build().perform();          //to double click on particular button
		driver.switchTo().alert().accept();
		
		actions.contextClick().build().perform();
		actions.contextClick(RightClickMe).build().perform();
		WebElement EditButton = driver.findElement(By.xpath("//span[text()='Edit']"));
		//actions.moveToElement(EditButton).build().perform();
		//actions.click().build().perform();
		//driver.switchTo().alert().accept();
		actions.click(EditButton).build().perform();
	}

}
