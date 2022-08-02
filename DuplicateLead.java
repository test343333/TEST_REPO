import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// launch browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
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
		
		// enter first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("T");
		
		// Department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Subscription department");
				
		//Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test description");
		
		//email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasirajankala@testemail.com");
				
		//state selection
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
		Select select = new Select(dropdown);
		select.selectByVisibleText("New York");
				
		//create button
		driver.findElement(By.className("smallSubmit")).click();

		//get title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
				
		if(title.equals("Create Lead | opentaps CRM"))
				{
					System.out.println("its matching");
				}
		else
					System.out.println("not reached the page");
		
		Thread.sleep(3000);
		   //duplicate button
		//driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.className("subMenuButton")).click();
		
		
		   //clear company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
	
     	//Enter new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company_name");

		driver.findElement(By.id("createLeadForm_firstName")).clear();

		// enter new first field name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasi_new_name_entered");
		
		//create button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//title of the page
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(title2.equals("Create Lead | opentaps CRM"))
		{
			System.out.println("Create Lead | opentaps CRMg");
		}
		else
			System.err.println("Its not matching");

	}

}
