package Selenium_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page implements Method_defination,Variable_declaration {
	WebDriver driver;
	public void front() {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://web.openrainbow.com/");
	login();
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		WebElement email_address = driver.findElement(By.id("username"));
		email_address.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		email_address.sendKeys(Keys.ENTER);
		WebElement password = driver.findElement(By.name("authPwd"));
		password.sendKeys("Jagan1228!");
		password.sendKeys(Keys.ENTER);
	}

	@Override
	public void send_message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void make_call() {
		// TODO Auto-generated method stub
		
	}
	public static void main() {
		Login_page obj1 = new Login_page();
		obj1.front();
	}

}
