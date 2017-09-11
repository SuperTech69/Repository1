package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SuperTech {
	WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "D:\\All Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("file:///D:/WebSite/SuperTech.html");
		System.out.println("Build is success");
		driver.close();
	}

}
