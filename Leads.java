import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	public static void main(String[] args) {

		/*Steps: 01_ Launch, maximize 
		02_ Login to application 
		03_ Click CRM/SFA Link 
		04_ Click Leads Link 
		05_ Click Create Lead Link 
		06_ Enter Company Name 
		07_ Enter First Name 
		08_ Enter Last Name 
		09_ Click Submit button 
		10_ Verify the Verify Lead Page Title*/
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			//maximize window
			driver.manage().window().maximize();
			
			// launch browser
			driver.get("http://leaftaps.com/opentaps/");
			
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
			
			//select dropdown
			WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			Select select = new Select(dropdown);
			select.selectByVisibleText("Existing Customer");
			
			
			//Click Submit button 
			driver.findElement(By.name("submitButton")).click();
			
			//Get title
			String txt = driver.getTitle();
			System.out.println(txt);
			
			if(txt.equals("View Lead | opentaps CRM"))
			{
				System.out.println("its matching");
			}
			else
				System.out.println("not reached the page");
	}
}
