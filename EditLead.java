import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

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
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		 //click crm link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		 //click leads link
		driver.findElement(By.linkText("Leads")).click();
		
       //click Find leads
		driver.findElement(By.xpath
				("//div[@class='frameSectionBody']//ul[@class='shortcuts']//li[3]//a")).click();
      
		//Enter first name
		driver.findElement
		(By.xpath("//div[@class='x-form-item x-tab-item']"
				+ "//div[@class='x-form-element']//input[@name=\"firstName\"]")).sendKeys("firstname");	
		
	  //Click Find leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        //-> doubt how to check the resulting lead if the number varies
        //Click on first resulting lead - 
        driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10387']")).click();
        
        //Verify title of the page
        String title = driver.getTitle();
        System.out.println(title);
        
        //click edit
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        
        //Change the company name
        WebElement  elemnt1 = driver.findElement(By.id("updateLeadForm_companyName"));
        elemnt1.sendKeys("update");
        
        //Click Update
        driver.findElement(By.name("submitButton")).click();
        
       String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
       System.out.println(text);
       
      if(elemnt1.equals(text))
    
	System.out.println("Its matches and the text is :" +text);

      
       driver.close();
       
	}
 
}
