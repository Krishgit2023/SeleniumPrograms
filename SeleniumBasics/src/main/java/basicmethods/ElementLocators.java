package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField = driver.findElement(By.cssSelector("#twotabsearchtextbox")); //cssselector with id(#id value)
		searchField.sendKeys("Mobiles");
		//WebElement AllButton = driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect.nav-progressive-attrubute.nav-progressive-search-dropdown"));  //cssselector with class(.class value -- spaces in btw should be removed with dot)
		//AllButton.click();
		//WebElement allbutton = driver.findElement(By.tagName("select")); //using tag name ---select
		//allbutton.click();
		//WebElement link = driver.findElement(By.tagName("a"));   //using tag name ---'a'----not unique
		//link.click();
		WebElement Electronicslink = driver.findElement(By.linkText("Electronics"));     //using linktext --- can give text value
		Electronicslink.click();
		//driver.get("https://www.facebook.com/");
		//WebElement ForgottenPassLink = driver.findElement(By.partialLinkText("Forgotten"));   //using partiallinktext----no need to give entire text, can be given partially
		//ForgottenPassLink.click();
		String selection = "Mobiles";
		WebElement parametrizedlink = driver.findElement(By.linkText(selection));     //using linktext --- can give text value
		parametrizedlink.click();
		

	}

}
