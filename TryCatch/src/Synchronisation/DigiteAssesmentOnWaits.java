package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DigiteAssesmentOnWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("ta1")).sendKeys("Java");
		//String t = driver.getTitle();
		//System.out.println(t);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("omayo (QAFox.com)"));
		String t1 = driver.getTitle();
		System.out.println(t1);
	}

}
