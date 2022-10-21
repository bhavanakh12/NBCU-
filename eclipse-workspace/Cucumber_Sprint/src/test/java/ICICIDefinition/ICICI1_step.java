package ICICIDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsPackage.iCICIObjects;

public class ICICI1_step {
	WebDriver driver=null;
    @Before 
    public void setUp() throws InterruptedException {
      //set system property for chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	//URL of the website
	driver.get("https://www.icicibank.com/#");
	
	//Title of the first page
	String expectedTitle="Personal Banking & Netbanking Services Online - ICICI Bank";
	String actualTitle=driver.getTitle();
	System.out.println("Actual Title is:"+actualTitle);
	Assert.assertEquals(actualTitle,expectedTitle,"Title is matched");
	Thread.sleep(2000);
    }
    
    //launch the browser
    @Given("^Open the browser$")
    public void open_the_browser() throws InterruptedException  {
    	//popup has been closed
	   driver.findElement(By.id("push-modal-close")).click();
	   
	   //maximize the window
		driver.manage().window().maximize();
	System.out.println("Loading the application");
    }
      //Here give the valid userid and incorrect password
    @When("^Enter the userid and wrong password$")
    public void Enter_the_userid_and_wrong_password() {
    	iCICIObjects home1=new iCICIObjects(driver);
    	 home1.click_signin();
    	 home1.click_user();
    	 home1.enter_userid("577187266");
    	 home1.enter_password("Disha@456");
     }
    //click on login to enter the homepage
    @And("^Click on login$")
    public void click_on_login() {
    	iCICIObjects home1=new iCICIObjects(driver);
    	home1.click_Login1();
    }
    //homepage is not displayed due to invalid password
    @Then("^Account login denied$")
    public void account_login_denied() {
    	 System.out.println("login denied");
    }
    @After
	public void cleanUp() {
		
	}
}
