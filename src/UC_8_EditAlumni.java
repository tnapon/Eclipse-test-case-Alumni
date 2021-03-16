
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

class UC_8_EditAlumni{

	@Test
	void TC_1001_EditAlumni() {
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
		    driver.manage().window().setSize(new Dimension(1320, 733));
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("614259003");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("แก้ไขข้อมูลผู้ใช้")).click();
		    driver.findElement(By.cssSelector(".form-row:nth-child(2)")).click();
		    driver.findElement(By.name("ename")).sendKeys("tnapon jaitrong");
		    driver.findElement(By.cssSelector(".btn-primary")).click();    
		    String result = driver.findElement(By.id("view_detail_head")).getText();  
	        assertEquals("ดูรายละเอียดของศิษย์เก่า",result);	
		    
	        driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.close();
		    System.out.println("Finish 1001 !!!");
	}
	@Test
	void TC_1002_EditAlumni() {
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
		    driver.manage().window().setSize(new Dimension(1320, 733));
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("614259007");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("แก้ไขข้อมูลผู้ใช้")).click();
		    driver.findElement(By.cssSelector(".form-row:nth-child(4)")).click();
		    driver.findElement(By.name("job")).sendKeys("programer");
		    driver.findElement(By.cssSelector(".btn-primary")).click();    
		    String result = driver.findElement(By.id("view_detail_head")).getText();  
	        assertEquals("ดูรายละเอียดของศิษย์เก่า",result);	
		   
	        driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.close();
		    System.out.println("Finish 1002 !!!");
	}
	@Test
	void TC_1003_EditAlumni() {
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
		    driver.manage().window().setSize(new Dimension(1320, 733));
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("614259007");
		    driver.findElement(By.name("psw")).click();
		    driver.findElement(By.name("psw")).sendKeys("01234566+");
		    driver.findElement(By.name("login")).click();
		    driver.findElement(By.linkText("แก้ไขข้อมูลผู้ใช้")).click();
		    driver.findElement(By.cssSelector(".form-row:nth-child(4)")).click();
		    driver.findElement(By.name("job")).sendKeys("programer");
		    driver.findElement(By.cssSelector(".btn-danger")).click();
		    driver.findElement(By.cssSelector(".container:nth-child(6) h4")).click(); 
	
		    String result = driver.findElement(By.id("welcome_head")).getText(); 
	        assertEquals("สาขาวิศวกรรมซอฟต์แวร์ ยินดีต้อนรับ",result);
	        driver.findElement(By.cssSelector(".btn-outline-light")).click();
		    driver.close();
		    System.out.println("Fail 1003 !!!");
	}
}
