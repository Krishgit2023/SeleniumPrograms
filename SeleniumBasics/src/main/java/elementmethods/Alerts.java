
//Javascript Alerts check

package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement Button1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement Button2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement Button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Button1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();         //to click OK button in javascript alert
		Button2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();       //to click CANCEL button in javascript alert
		Button2.click();
		String alerttext = driver.switchTo().alert().getText();  // to get text inside an alert
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		Button3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test");   //to give text value in the text field of an alert
		driver.switchTo().alert().accept(); 
		
		

	}

}
