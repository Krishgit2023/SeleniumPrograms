
//to inspect dropdowns if the tagname is not 'select'

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement Dropdowntitle = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		Dropdowntitle.click();
		WebElement Dropdowntypefield = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		String State = "California";
		Dropdowntypefield.sendKeys(State);
		WebElement SelectionState = driver.findElement(By.xpath("//li[text()='"+State+"']"));
		SelectionState.click();
		

	}

}
