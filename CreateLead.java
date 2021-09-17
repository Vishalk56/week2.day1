package week2.day1;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		/*
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password
		 * 
		 * 3. Click on Login Button
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on Leads Button
		 * 
		 * 6. Click on create Lead Button
		 * 
		 * 7. Enter all the text fields in CreateLead page
		 ** 
		 * Note 1. Donot work on Parent Account Field 2.Enter the Birthdate using
		 * SendKeys
		 * 
		 * 8. Enter all the text fields in contact information
		 * 
		 * 9. Enter all the text fields in primary address
		 * 
		 * 10. Get the Firstname and print it
		 * 
		 * 11. Click on create Lead Button
		 * 
		 * 12. Get and Verify the Title of the resulting Page(View Lead)
		 */

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD Company");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishal");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kashetty");

		WebElement sourceDD = driver.findElement(By.name("dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByVisibleText("Direct Mail");

		WebElement marketingCampaignDD = driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaign = new Select(marketingCampaignDD);
		marketingCampaign.selectByValue("CATRQ_CAMPAIGNS");

		driver.findElement(By.name("firstNameLocal")).sendKeys("Local first");

		driver.findElement(By.name("lastNameLocal")).sendKeys("Local last");

		driver.findElement(By.name("personalTitle")).sendKeys("Mr.");

		driver.findElement(By.name("generalProfTitle")).sendKeys("Tech Lead");

		driver.findElement(By.name("birthDate")).sendKeys("09/22/90");

		driver.findElement(By.name("departmentName")).sendKeys("IT");

		driver.findElement(By.name("annualRevenue")).sendKeys("2000000");

		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryDD);
		industry.selectByIndex(3);

		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipDD);
		ownership.selectByValue("OWN_SCORP");

		driver.findElement(By.name("numberEmployees")).sendKeys("450");

		driver.findElement(By.name("sicCode")).sendKeys("SIC5678");

		driver.findElement(By.name("tickerSymbol")).sendKeys("ABCD");

		driver.findElement(By.name("description")).sendKeys("Create Lead");

		driver.findElement(By.name("importantNote")).sendKeys("Test");

		// Contact Information

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("040000");

		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("99");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testmail.com");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("77878787");

		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("primary phone");

		driver.findElement(By.name("primaryWebUrl")).sendKeys("www.testxyz.com");

		// Primary Address

		driver.findElement(By.name("generalToName")).sendKeys("Raj");

		driver.findElement(By.name("generalAttnName")).sendKeys("xyz");

		driver.findElement(By.name("generalAddress1")).sendKeys("Address 1");

		driver.findElement(By.name("generalAddress2")).sendKeys("Address 2");

		driver.findElement(By.name("generalCity")).sendKeys("HYD");

		driver.findElement(By.name("generalPostalCode")).sendKeys("500049");

		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("500050");

		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByIndex(7);

		WebElement countryDD = driver.findElement(By.name("generalCountryGeoId"));
		Select country = new Select(countryDD);
		country.selectByValue("ECU");

		// To get first name text and the Value entered in Firstname field
		String text = driver.findElement(By.xpath("//span[text()='First name']")).getText();
		System.out.println("First name text : " + text);

		String fnValue = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("First name value entered is : " + fnValue);

		// Click Create Lead button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		// Get title from next page
		String viewLead = driver.getTitle();
//		System.out.println("Title after Create Lead is : " + viewLead);
	}

}
