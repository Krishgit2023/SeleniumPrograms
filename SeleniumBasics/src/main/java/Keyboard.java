import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement SearchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		
		//SearchField.sendKeys("Mobiles"+Keys.ENTER);
		//SearchField.sendKeys("Mobile");
		//SearchField.sendKeys(Keys.ENTER);   //use enter key
		//SearchField.sendKeys(Keys.BACK_SPACE);   //use backspace key
		//SearchField.sendKeys(Keys.chord(Keys.CONTROL,"A"));   //ctrl+A
		
		WebElement AllDropdown = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(AllDropdown).build().perform();

	}

}
