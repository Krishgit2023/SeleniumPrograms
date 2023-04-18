package mousemethod;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		WebElement Image1 = driver.findElement(By.xpath("(//div[@class='figure']//img[1])[1]"));
		
		//to hover the mouse
		Actions actions = new Actions(driver);
		actions.moveToElement(Image1).build().perform();    //method overloading example
		
	
		

	}

}
