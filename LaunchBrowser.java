package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// Manage Drivers -- Download driver to local machine
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Launch the URL
		// driver.get("https://www.google.com");
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Get the title of the current page/browser
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		

		// Close the browser
		// driver.close();
	}
}
