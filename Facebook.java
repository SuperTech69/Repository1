package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
	
@BeforeTest
public void openBrowser(){
	//System.setProperty("webdriver.chrome.driver", "E:\\AllDriver\\chromedriver.exe");
	//driver=new ChromeDriver();
   driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
public void FacebookSignUp() throws InterruptedException{
	driver.get("https://www.facebook.com/");

	String ActualTitle=driver.getTitle();
	
	Assert.assertEquals(ActualTitle, "Facebook - Log In or Sign Up");
	
	System.out.println("Facebook page title is: "+driver.getTitle());

	WebElement FN =driver.findElement(By.name("firstname"));
	FN.sendKeys("Mohammad");
	
	WebElement LN=driver.findElement(By.name("lastname"));
	LN.sendKeys("Kabir");
	
	WebElement Email=driver.findElement(By.name("reg_email__"));
	Email.sendKeys("telentitdiscussiongroup@gmail.com");
	
	WebElement AgEmail =driver.findElement(By.name("reg_email_confirmation__"));
	AgEmail.sendKeys("telentitdiscussiongroup@gmail.com");
	
	WebElement password= driver.findElement(By.name("reg_passwd__"));
	password.sendKeys("mgtf5f12345");
	
	WebElement BMonth=driver.findElement(By.id("month"));
	Select seleMonth=new Select(BMonth);
	seleMonth.selectByIndex(3);
	
	WebElement BDay=driver.findElement(By.id("day"));
	Select seleDay=new Select(BDay);
	seleDay.selectByValue("16");
	
	WebElement BYear=driver.findElement(By.id("year"));
	Select seleYear=new Select(BYear);
	
	seleYear.selectByVisibleText("1970");
	
	WebElement Gender=driver.findElement(By.xpath(".//*[@id='u_0_7']"));
	Gender.click();
	
	WebElement SignUpButton=driver.findElement(By.cssSelector("#u_0_r"));
	SignUpButton.click();
	/*String Mainwindow=driver.getWindowHandle();
	Set<String>Childwindows=driver.getWindowHandles();
	for(String Childwindow:Childwindows){
		driver.switchTo().window(Childwindow);
	}

	driver.switchTo().window(Mainwindow);*/
	Thread.sleep(3000);
	System.out.println("Facebook SignUp Successfully");
	
}
@AfterTest
public void CloseBrowser(){
	driver.close();
	driver.quit();
	System.out.println("Facebook SignUp Successfully");
}


}
