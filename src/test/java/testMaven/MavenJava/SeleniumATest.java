package testMaven.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumATest {

	@Test
	public void getData() {
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nitinvijaytest.azurewebsites.net/webapp/");
		String text = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Nitin Learning"));
		driver.close();
	}
}
