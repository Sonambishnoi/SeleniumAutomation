package FacebookSignup;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:/selenium-java-3.5.3/geckodriver.exe");
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.name("firstname")).sendKeys("Test");
		 driver.findElement(By.name("lastname")).sendKeys("Admintester");
	     driver.findElement(By.name("reg_email__")).sendKeys("Test.Admintester@facebook.com");
	     driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test.Admintester@facebook.com");
	     driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
	     driver.findElement(By.name("birthday_day")).sendKeys("8");
	     driver.findElement(By.name("birthday_month")).sendKeys("Feb");
	     driver.findElement(By.name("birthday_year")).sendKeys("1991");
	     driver.findElement(By.xpath("//input[@name='sex' and @value='1' and @type='radio']")).click();
	     driver.findElement(By.name("websubmit")).click();
	     
	     driver.quit();
	     
	     
	}

}
