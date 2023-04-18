package mousemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement Source = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement Destination = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		//to drag and drop
		Actions actions = new Actions(driver);
		actions.dragAndDrop(Source, Destination).build().perform();
	}

}
