package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("http://www.gmail.com/");
		System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void testFacebook() {
		driver.get("http://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

}
