import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		// launch browser
		driver.get("https://www.facebook.com/");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//create new account
		driver.findElement(By.linkText("Create New Account")).click();

		//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("sasi");

		//Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("kala");

		// Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9988998899");

		//Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");

		//find drop down day value
		WebElement findElement = driver.findElement(By.id("day"));
		Select select = new Select(findElement);
		select.selectByVisibleText("10");

		//find drop down month value
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select select2 = new Select(findElement2);
		select2.selectByVisibleText("Feb");

		//find drop down month value	
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select select3 = new Select(findElement3);
		select3.selectByVisibleText("1993");

		//custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		//custom drop down
		WebElement findElement4 = driver.findElement(By.name("preferred_pronoun"));
		Select select4 = new Select(findElement4);
		select4.selectByVisibleText("They: \"Wish them a happy birthday!\"");

		//gender option
		driver.findElement(By.name("custom_gender")).sendKeys("optional");

	}

}
