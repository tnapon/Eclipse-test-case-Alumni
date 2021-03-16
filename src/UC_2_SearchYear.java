
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

class UC_2_SearchYear{

	@Test
	void TC_1001_SearchYear() {
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
		    driver.findElement(By.name("email")).sendKeys("614259003");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("�������������ҷ�����")).click();
		    driver.findElement(By.name("search")).click();
		    driver.findElement(By.name("search")).sendKeys("2560");
		    driver.findElement(By.name("submit")).click();
		    String result = driver.findElement(By.id("name")).getText();  
	        assertEquals("�����Ѱ �����Ҵ",result);	
	        driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.close();
		    System.out.println("Finish 1001 !!!");
	}
	@Test
	void  TC_1002_SearchYear() {
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
		    driver.findElement(By.name("email")).sendKeys("614259003");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("�������������ҷ�����")).click();
		    driver.findElement(By.name("search")).click();
		    driver.findElement(By.name("search")).sendKeys("2555");
		    driver.findElement(By.name("submit")).click();
		    String result = driver.findElement(By.id("name")).getText(); 
	        assertEquals("���� 㨵ç",result);	 
	        driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.close();
		    System.out.println("Finish 1002!!!");
	}
	@Test
	void TC_1003_SearchYear() {
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
		    driver.findElement(By.name("email")).sendKeys("614259003");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("�������������ҷ�����")).click();
		    driver.findElement(By.name("search")).click();
		    driver.findElement(By.name("search")).sendKeys("2000");
		    driver.findElement(By.name("submit")).click();
		    String result = driver.findElement(By.id("error")).getText(); 
	        assertEquals("��辺���ͤ����",result);	
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    System.out.println("FAIL 1003 !!!");
		    driver.close();
		   
	}
}
