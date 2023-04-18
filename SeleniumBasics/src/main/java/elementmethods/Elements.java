
//Getting multiple web element names

package elementmethods;

import java.util.List;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		// to get all web element text together using list
		List<WebElement> Tab = driver.findElements(By.xpath("//ul[@class='navbar-nav']/li/a"));
		
		System.out.println(Tab.size());   //to print element size
		for(int x =0; x<Tab.size(); x++) {
			String textString = Tab.get(x).getText();
			System.out.println(textString);
			
		}
		
		// to get all web element text together using for each loop
		for(WebElement element:Tab) {
			String textStrings = element.getText();
			System.out.println(textStrings);
		}
		

	}

}
