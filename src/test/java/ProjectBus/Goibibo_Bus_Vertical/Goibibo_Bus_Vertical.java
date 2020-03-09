package ProjectBus.Goibibo_Bus_Vertical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Goibibo_Bus_Vertical {
	
	WebDriver driver;
	
	String Bus_Icon = "//i[@class='icon-bus db blue ico24 lh1-2 padT5 padB5']"; 
	
	String source = "//input[@id='gi_source']";
	
	String destination = "//input[@id='gi_destination']";
	
	String date_selection = "//input[@id='gi_onward_text']";
	
	String date = "//td[@id='jrdp_start-calen_3_30_2020']//span[contains(text(),'30')]";
	
	String search_button = "//button[@id='gi_search_btn']";
	
	String select_seats = "//li[1]//div[2]//div[5]//div[1]//span[2]//button[1]";
	
	String bording_point_selection = "//option[contains(text(),'Sagar Pur  -  05:24')]";
	
	String confirm_button_Seat_selection_page = "//a[@id='confirm']";
	
	String adult_choice = "//*[@id=\"adultchoose1\"]/option[2]" , first_name = "//input[@id='adultfirstname1']", last_name = "//input[@id='adultlastname1']",
			
			age = "//input[@id='adultage1']", email = "//input[@id='email']", mobile_no = "//input[@id='mobile']";
	
	String make_payment_review_page ="//input[@id='makePayment']";
	
	String Netbanking = "//div[@id='tab_nb']", bank_selection = "//div[@id='banksRadio']//div[1]//div[1]", pay_button ="//*[@id=\"nbPayNow\"]/div/button";
	
	
	
  @Test (priority=0)
  public void icon() {
	  
	  driver.findElement(By.xpath(Bus_Icon)).click();
  }
  
  @Test (priority=1)
  public void Bus_hompage() {
	  
	  driver.findElement(By.xpath(source)).sendKeys("Delhi");
	  
		driver.findElement(By.xpath("//*[@id=\"gi_source_wrapper\"]/div/ul/li[1]")).click();

	driver.findElement(By.xpath(destination)).sendKeys("Agra");
	
	    driver.findElement(By.xpath("//*[@id=\"gi_destination_wrapper\"]/div/ul/li[1]")).click();

	  
	  driver.findElement(By.xpath(date_selection)).click();
	  
	  driver.findElement(By.xpath(date)).click();
 
	  driver.findElement(By.xpath(search_button)).click();
}


  @Test (priority=2)
  public void bus_details_page() {
	  
	  driver.findElement(By.xpath(select_seats)).click();
	  
	  driver.findElement(By.className("availableSeat")).click();
	  
	  driver.findElement(By.xpath(bording_point_selection)).click();
	  
	  driver.findElement(By.xpath(confirm_button_Seat_selection_page)).click();
	  
	  
  }
  
  
  @Test (priority=3)
  public void Bus_Review_page () {
	  
	  driver.findElement(By.xpath(adult_choice)).click();
	  
	  driver.findElement(By.xpath(first_name)).sendKeys("Test");
	  
	  driver.findElement(By.xpath(last_name)).sendKeys("Bus");
	  
	  driver.findElement(By.xpath(age)).sendKeys("27");

	  driver.findElement(By.xpath(email)).sendKeys("testnoc009@gmail.com");
	  
	  driver.findElement(By.xpath(mobile_no)).sendKeys("9999999999");
	  
	  driver.findElement(By.xpath(make_payment_review_page)).click();
	  

  }
  
  
  @Test(priority=4)
  
  public void Bus_payment_page() throws InterruptedException {
	  
	  driver.findElement(By.xpath(Netbanking)).click();
	  
	  driver.findElement(By.xpath(bank_selection)).click();
	  
	  driver.findElement(By.xpath(pay_button)).click();
	  
	  Thread.sleep(5000);
  }
  
@BeforeClass
public void beforeClass()  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	


	
	  driver.navigate().to("http://www.goibibo.com");
	  
	  driver.manage().window().maximize();

}

@AfterClass
public void afterClass() {
	  
	  driver.quit();
}

}


