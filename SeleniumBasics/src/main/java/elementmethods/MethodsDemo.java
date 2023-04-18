
// Webelement methods------- to click two checkboxes, isSelected(), isEnabled(), isDisplayed(), getlocation(), getpagesource()


package elementmethods;

import java.lang.ref.Reference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		//inspecting checkbox
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//div[@class='example']/form/input[1]"));
		WebElement Checkbox2 = driver.findElement(By.xpath("//div[@class='example']/form/input[2]"));
		
		//creating boolean variable to check whether the checkbox is selected
		
		Boolean Checbox1Status = Checkbox1.isSelected();
		Boolean Checbox2Status = Checkbox2.isSelected();
		
		//print whether checkbox is selected
		
		System.out.println("Checkbox1 is selected: "+Checbox1Status);
		System.out.println("Checkbox2 is selected: "+Checbox2Status);
		
		//print whether checkbox is visible
		
		System.out.println("Checkbox1 is visible : "+Checkbox1.isDisplayed());
		System.out.println("Checkbox2 is visible : "+Checkbox2.isDisplayed());
		
		//print whether checkbox is enabled(clicked)
		
		System.out.println("Checkbox1 is clicked :" +Checkbox1.isEnabled());
		System.out.println("Checkbox2 is clicked :" +Checkbox2.isEnabled());
		
		//checks if checkboxstatus is false, then click on it
		
		if(!Checbox1Status) {   
			Checkbox1.click();
		}
		if(!Checbox2Status) {   
			Checkbox2.click();
		
	}
		
		//to get location of checkbox by creating two variables
		
		int x = Checkbox1.getLocation().x;
		int y = Checkbox2.getLocation().y;
		System.out.print("Location of checkbox1 :" +x);
		System.out.print("Location of checkbox2 :" +y);
		
		//to get pagesource info
		
		driver.getPageSource();
		System.out.println("Pagesource info : "+driver.getPageSource());
		
		String CheckboxAttributte2= Checkbox1.getAttribute("type");
		System.out.println("Attribute for checkboxattribute1 : "+CheckboxAttributte2);
		
	}
}


