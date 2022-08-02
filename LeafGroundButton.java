import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// launch browser
		driver.get("http://leafground.com/pages/Button.html");
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//home
		driver.findElement(By.id("home")).click();
		
		//button click
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		//Find position
		int x = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation().getX();
		System.out.println(x);
		int y = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation().getY();
		System.out.println(y);
		
		//Wt colour I am
	     String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
	     System.out.println(cssValue);
		
		
		//Find the height and width
		int height = driver.findElement(By.id("size")).getSize().getHeight();
		System.out.println(height);
		int width = driver.findElement(By.id("size")).getSize().getWidth();
		System.out.println(width);
	}

}
