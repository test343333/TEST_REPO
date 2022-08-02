import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
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
		
		//click on phone
		  driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		  
		  //Enter phone number
		  driver.findElement(By.name("phoneAreaCode")).sendKeys("12");
		  driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
		  
		  //Click find leads button
		  driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		  
		 //Capture lead ID of First Resulting lead
		  String text = driver.findElement(By.xpath("//a[text()='13303']")).getText();
		  System.out.println(text);
		  
		  //click the captured id
		  driver.findElement(By.xpath("//a[text()='13303']")).click();
		  
		  // Click Delete
		  driver.findElement(By.className("subMenuButtonDangerous")).click();
		  
		  //Click Find leads
		  driver.findElement(By.linkText("Find Leads")).click();
		  
		  //Enter captured lead ID
		  driver.findElement(By.name("id")).sendKeys("13303");
		  
		  //find leads button
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  
       //  Verify message "No records to display" in the Lead List
		   String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
           System.out.println(text2);
       
           if(text2.equals("No records to display"))
           {
        	   System.out.println("Record deleted successfully");
           }
           else
        	   System.out.println("Record Not deleted; please check");
	}

}
