package UC_RegisterAlumni;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TC_1002_RegisterAlumni {

	@Test
	void test() {
		WebDriver driver = null;
		String browser = "firefox";
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	    driver.get("https://tzs-global.com/alumni-1/index.php/Welcome");
	    driver.manage().window().setSize(new Dimension(1260, 644));
	    driver.findElement(By.linkText("ลงทะเบียน")).click();
	    driver.findElement(By.name("fname")).click();
	   
	    driver.findElement(By.name("email")).sendKeys("614259039@webmail.npru.ac.th");
	    driver.findElement(By.name("tel")).click();
	    driver.findElement(By.name("tel")).sendKeys("0911169040");
	    driver.findElement(By.name("face")).click();
	    driver.findElement(By.name("face")).sendKeys("tnapon jaitong");
	    driver.findElement(By.name("line")).click();
	    driver.findElement(By.name("line")).sendKeys("mr.yell");
	    driver.findElement(By.name("homea")).click();
	    driver.findElement(By.name("homea")).sendKeys("562");
	    driver.findElement(By.name("mou")).click();
	    driver.findElement(By.name("mou")).sendKeys("3");
	    driver.findElement(By.name("song")).click();
	    driver.findElement(By.name("song")).sendKeys("1");
	    driver.findElement(By.name("road")).click();
	    driver.findElement(By.name("road")).sendKeys("-");
	    driver.findElement(By.name("tampon")).click();
	    driver.findElement(By.name("tampon")).sendKeys("กระตีบ");
	    driver.findElement(By.name("ampor")).click();
	    driver.findElement(By.name("ampor")).sendKeys("กำแพงแสน");
	    driver.findElement(By.cssSelector("form:nth-child(1)")).click();
	    driver.findElement(By.name("prov")).click();
	    driver.findElement(By.name("prov")).sendKeys("นครปฐม");
	    driver.findElement(By.name("zipcode")).click();
	    driver.findElement(By.name("zipcode")).sendKeys("73180");
	    driver.findElement(By.name("h2")).click();
	    driver.findElement(By.name("h2")).sendKeys("644");
	    driver.findElement(By.name("m2")).click();
	    driver.findElement(By.name("m2")).sendKeys("3");
	    driver.findElement(By.name("s2")).click();
	    driver.findElement(By.name("s2")).sendKeys("2");
	    driver.findElement(By.name("road2")).click();
	    driver.findElement(By.name("road2")).click();
	    driver.findElement(By.name("road2")).sendKeys("มาลัยแมน");
	    driver.findElement(By.name("t2")).click();
	    driver.findElement(By.name("t2")).sendKeys("แพงพวย");
	    driver.findElement(By.cssSelector(".form-row:nth-child(16) > .form-group:nth-child(3)")).click();
	    driver.findElement(By.name("a2")).click();
	    driver.findElement(By.name("a2")).sendKeys("ดำเนิน");
	    driver.findElement(By.cssSelector("form:nth-child(1)")).click();
	    driver.findElement(By.name("prov2")).click();
	    driver.findElement(By.name("prov2")).sendKeys("ราชบุรี");
	    driver.findElement(By.name("zip2")).click();
	    driver.findElement(By.name("zip2")).sendKeys("72380");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).sendKeys("0901169040");
	    driver.findElement(By.name("sid")).click();
	    driver.findElement(By.name("sid")).sendKeys("614259035");
	    driver.findElement(By.name("sec")).click();
	    driver.findElement(By.name("sec")).sendKeys("61/47");
	    driver.findElement(By.name("grade")).click();
	    driver.findElement(By.name("grade")).sendKeys("4.00");
	    driver.findElement(By.name("ry")).click();
	    driver.findElement(By.name("ry")).sendKeys("2560");
	    driver.findElement(By.name("sy")).click();
	    driver.findElement(By.name("sy")).sendKeys("2564");
	    driver.findElement(By.name("pass")).click();
	    driver.findElement(By.name("pass")).sendKeys("123456789");
	    driver.findElement(By.cssSelector(".form-row:nth-child(25) > .form-group:nth-child(2)")).click();
	    driver.findElement(By.name("repass")).click();
	    driver.findElement(By.name("repass")).sendKeys("123456789");
	    driver.findElement(By.cssSelector(".custom-control-label")).click();
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    
	    String result = driver.findElement(By.className("nav-link")).getText();
       assertEquals("ลงทะเบียน",result);
	    driver.close();
		
	}

}
