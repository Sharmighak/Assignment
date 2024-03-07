import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPratice {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA5ODIzNzI4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		driver.findElement(By.id("email")).sendKeys("9345977099");
		driver.findElement(By.name("pass")).sendKeys("chandra@123");
		
	
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}

}

