package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		//to print text: 
		String ButtonName = loginButton.getText();
		System.out.println(ButtonName);
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		WebElement RadioButton = driver.findElement(By.xpath("//input[@id='yes']"));
		RadioButton.click();
		WebElement CheckBox = driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		CheckBox.click();
		WebElement TextCheck = driver.findElement(By.xpath("//p[@class='radiobutton']"));
		String Check = TextCheck.getText();
		System.out.println(Check);
		
		
		
	}

}
