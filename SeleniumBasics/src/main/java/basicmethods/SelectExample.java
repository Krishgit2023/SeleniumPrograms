
//to inspect dropdown if the tagname is 'select'

package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement CategoryDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(CategoryDropdown);
		select.selectByIndex(4);
		select.selectByValue("search-alias=amazon-devices");
		select.selectByVisibleText("Apps & Games");
		select.selectByVisibleText("Baby");
		

	}

}
