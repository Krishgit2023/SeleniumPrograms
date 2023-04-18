
//to inspect tool tips and to get title of tooltip using getattribute()

package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Tooltip = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String tool = Tooltip.getAttribute("title");
		System.out.println(tool);
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement MailToolTip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String tool1 = MailToolTip.getAttribute("title");
		System.out.println(tool1);
		WebElement GoogleToolTip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String tool2 = GoogleToolTip.getAttribute("title");
		System.out.println(tool2);
		WebElement YoutubeToolTip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		String tool3 = YoutubeToolTip.getAttribute("title");
		System.out.println(tool3);
		WebElement GithubToolTip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-github']"));
		String tool4 = GithubToolTip.getAttribute("title");
		System.out.println(tool4);
		

	}

}
