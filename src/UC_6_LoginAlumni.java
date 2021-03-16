
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class UC_6_LoginAlumni {

	@Test
	void TC_1001_Login() {
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
		
		driver.get("https://tzs-global.com/alumni-1/index.php/Welcome");
	    driver.manage().window().setSize(new Dimension(1054, 807));
	    driver.findElement(By.cssSelector(".btn-outline-light")).click();	
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("614259003");
	    driver.findElement(By.name("psw")).click();
	    driver.findElement(By.name("psw")).sendKeys("01234566+");
	    driver.findElement(By.name("login")).click();
	
	    String result = driver.findElement(By.id("user_fullname")).getText(); 
        assertEquals("���� 㨵ç",result);	
        String results = driver.findElement(By.id("logout_btn")).getText(); 
        assertEquals("�͡�ҡ�к�",results);	
        driver.findElement(By.cssSelector(".btn-outline-light")).click();
        driver.close();
	    System.out.println("Finish 1001 !!!");
	}
	@Test
	void TC_1002_Login() {
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
		
		driver.get("https://tzs-global.com/alumni-1/index.php/Welcome");
	    driver.manage().window().setSize(new Dimension(1054, 807));
	    driver.findElement(By.cssSelector(".btn-outline-light")).click();
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("614259035");
	    driver.findElement(By.name("psw")).click();
	    driver.findElement(By.name("psw")).sendKeys("");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.cssSelector(".btn-outline-light")).click();
	    String result = driver.findElement(By.id("login_head")).getText(); 
        assertEquals("�������к�",result);	
	    driver.close();
	    System.out.println("Fail 1002 !!!");
	}
	@Test
	void TC_1003_Login() {
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
		
		driver.get("https://tzs-global.com/alumni-1/index.php/Welcome");
	    driver.manage().window().setSize(new Dimension(1054, 807));
	    driver.findElement(By.cssSelector(".btn-outline-light")).click();
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("614259007");
	    driver.findElement(By.name("psw")).click();
	    driver.findElement(By.name("psw")).sendKeys("01234566+");
	    driver.findElement(By.name("login")).click();
	 
	    String result = driver.findElement(By.id("user_fullname")).getText(); 
        assertEquals("�����Ѱ �����Ҵ",result);	
        String results = driver.findElement(By.id("logout_btn")).getText(); 
        assertEquals("�͡�ҡ�к�",results);	
        driver.findElement(By.cssSelector(".btn-outline-light")).click();
	    driver.close();
	    System.out.println("Finish 1003 !!!");
	}



}
