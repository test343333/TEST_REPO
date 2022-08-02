import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();

		// launch browser
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Enter your email address
        driver.findElement(By.id("email")).sendKeys("test@testemail.com");
        
        //Append a text and press keyboard tab
        driver.findElement(By.xpath("//input[@value='Append ']"))
        .sendKeys("testuserappended");
        
        //Get default text entered
        System.out.println
        ("The text entered is" + driver.findElement(By.name("username")).getText());
        
        //Clear me
          driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
          
        //Confirm that edit field is disabled

          boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
        		System.out.println("Confirm that edit field is disabled" + enabled);
  
	}

}
