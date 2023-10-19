package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement srcbox = driver.findElement(By.id("APjFqb"));
		srcbox.sendKeys("java tutorial");
		srcbox.sendKeys(Keys.ENTER);
		
	}

}
