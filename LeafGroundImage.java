import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://leafground.com/pages/Image.html");
		WebElement element = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		element.click();
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
	}
}