package UC_SearchName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class TC_1003_SearchName {

	@Test
	void test() {
		WebDriver driver = null;
		String browser = "chrome";
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		 driver.get("https://tzs-global.com/alumni-1/index.php/Welcome/");
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("614259035");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("123456789");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("¢ÈÕ¡Ÿ≈»‘…¬Ï‡°Ë“∑—ÈßÀ¡¥")).click();
		    driver.findElement(By.name("search")).click();
		    driver.findElement(By.name("search")).sendKeys("∏πæ≈f");
		    driver.findElement(By.name("submit")).click();
		

		    //String result = driver.findElement(By.id("name")).getText();
		     //driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h1"));
	        //assertEquals("∏πæ≈",result);
		    //driver.findElements(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr/th[2][text()=\"∏πæ≈\"]")); 
		     System.out.println("FAIL !!!");
		     driver.close();
		   
	}


}

