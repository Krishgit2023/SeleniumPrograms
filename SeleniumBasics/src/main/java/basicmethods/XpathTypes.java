package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailField = driver.findElement(By.xpath("//input[@id = 'email']"));    //relative xpath used---//tagname[@attribute='value']
		emailField.sendKeys("Test@gmail.com");
		WebElement buttonField = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));    
		buttonField.click();*/
		/*driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		radioButton.click();
		//to click on multiple checkbox
		String checkbox = "checkbox1";
		WebElement parametrizedcheckbox = driver.findElement(By.xpath("//input[@value='"+checkbox+"']"));     //concatenation
		parametrizedcheckbox.click();
		checkbox = "checkbox2";
		parametrizedcheckbox = driver.findElement(By.xpath("//input[@value='"+checkbox+"']"));
		parametrizedcheckbox.click();*/
		driver.get("https://www.amazon.in/");
		//using following
		WebElement followingUsage = driver.findElement(By.xpath("//span[contains(text(),'Select your address')]//following::input[@id='twotabsearchtextbox']"));
		followingUsage.sendKeys("Mobiles");
		
	}

}
