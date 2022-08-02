import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// launch browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//finding user name and sending keys
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//finding user name and sending password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crm link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//create company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company_name");
		
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasi");
		
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kala");
		
		// Department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Subscription department");
		
		//Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test description");
		
		//email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasirajankala@testemail.com");
		
		//state selection
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Arkansas");
		
		//create button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//get title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Create Lead | opentaps CRM"))
		{
			System.out.println("its matching");
		}
		else
			System.out.println("not reached the page");	
	}	
}
