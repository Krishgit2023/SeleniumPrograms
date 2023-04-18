package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailField = driver.findElement(By.id("email"));  //id locator
		emailField.sendKeys("Krishnasureshh@gmail.com");
		WebElement passwordField = driver.findElement(By.name("pass"));  //name locator
		passwordField.sendKeys("Test");
		//WebElement LoginButton = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")); //className locator
		//LoginButton.click();
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		String login = LoginButton.getCssValue("background-color");
		System.out.println(login);
		String logincolor = LoginButton.getCssValue("color");
		String loginfont = LoginButton.getCssValue("font-size");
		System.out.println(logincolor);
		System.out.println(loginfont);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbutton = driver.findElement(By.xpath("//a[text()='Sign in securely']"));
		String searchcolor = searchbutton.getCssValue("color");
		System.out.println(searchcolor);
	}

}
