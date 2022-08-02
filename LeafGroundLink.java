
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//click on to Home Page
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		//hyperlink button
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();

		//Find where am supposed to go without clicking me?
		WebElement findElement = driver.findElement(By.partialLinkText("Find where am supposed"));
		String attribute = findElement.getAttribute("href");
		System.out.println(attribute);
		
		//Verify am I broken?
		 driver.findElement(By.linkText("Verify am I broken?")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 if(title.equals("404 Not Found"))
		 {
			 System.out.println(title);
		 }
		 else
			 System.out.println("link broken");
		 

         
    	 driver.navigate().back();
    	 
    	 
		 //Home page click again
    	 WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));
 		

        try {
     		homepage1.click();
        } cacth(StaleElementReferenceException )
		 
		 driver.navigate().back();
		
			
		 List<WebElement> findElements1 = driver.findElements(By.tagName("a"));
		 int size = findElements1.size();
		 System.out.println(size);
	}

}
