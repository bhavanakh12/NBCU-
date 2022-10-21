package SprintDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsPackage.Sprintpageobject;

public class Sprint_step {
WebDriver driver=null;
    @Before public void setUp() throws InterruptedException {
    	//set system property for chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	//URL of the website
	driver.get("https://www.icicibank.com/#");
	Thread.sleep(2000);
    }
    //launch the browser
   @Given("^Open the chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application() throws InterruptedException  {
	   //popup has been closed
	    driver.findElement(By.id("push-modal-close")).click();
	    //maximize the window
		driver.manage().window().maximize();
	System.out.println("Loading the application");
    }
   //enter the valid userid and password
   @When("^Enter the User ID and Password$")
  public void enter_the_user_id_and_password() throws Throwable {
	  Sprintpageobject home=new  Sprintpageobject(driver);
	   home.click_signin();
	   home.click_user();
	   home.enter_userid("577187266");
	   home.enter_password("Disha@123");
	   //to select the dropdown
	   driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
   	Thread.sleep(5000);
   	List<WebElement>a=driver.findElements(By.xpath("//a[text()='Customer Service']"));
   	Thread.sleep(2000);
   	for(WebElement i:a) {
			String b=i.getText();
			
					if(b.contains("Customer Service"))
					{
						i.click();
						break;
					}
					}
   	Thread.sleep(2000);
	   home.click_checkbox();
	 }
  //click on login to enter the homepage
   @And("^Clicks on login button$")
   public void clicks_on_login_button() throws Throwable{
	   Sprintpageobject home=new  Sprintpageobject(driver);
	   home.click_Login1();
   }
   //homepage is displayed
   @Then("^Login should be successful$")
   public void Login_should_be_successful() throws Throwable {
	   System.out.println("hello");
  }

   
//Login to ICICI Net Banking account with userid and password
  
   @Given("^user is on Homepage$")
   public void user_is_on_Homepage() {
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    //popup has been closed
    driver.findElement(By.id("push-modal-close")).click();
    //maximize the window
    driver.manage().window().maximize();
   }
   
   @When("^user Navigate to Login Page$")
   public void user_Navigate_to_Login_Page() {
	   Sprintpageobject home=new  Sprintpageobject(driver);
	   home.click_signin();
   }
   
   //it takes the value from the feature file
   @When("user enters {string} and {string}")
   public void user_enters_userid_and_password(String userid, String password) throws InterruptedException { 
	   Sprintpageobject home=new  Sprintpageobject(driver);
	   //scrollby
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,-500)");
	   Thread.sleep(3000);
       home.click_user();
	   home.enter_userid("userid");
	   home.enter_password("password");
	   home.click_Login1();
	 }
   //user enters into the homepage
   @Then("^user account is visible$")
   public void user_account_is_visible() {
	   System.out.println("Account login success");
   }
   
//User should able to Login through Mobile Number
   //launch the browser
   @Given("^Open the browser$")
   public void login1() throws InterruptedException  {
   driver.findElement(By.id("push-modal-close")).click();
   driver.manage().window().maximize();
   }
   //user enters the mobile number and ATM pin and OTP
   @When("^Enter the Mobile Number, ATM Pin and OTP$")
    public void Enter_the_Mobile_Number_ATM_Pin_OTP() throws InterruptedException {
	Sprintpageobject home=new  Sprintpageobject(driver);
	home.click_signin();
	home.click_Mobnum();
	home.enter_Mobnum1("7760577023");
	home.click_Authenticate();
	Thread.sleep(5000);
	home.click_ATM();
	home.enter_ATM("7411");
	Thread.sleep(5000);
	home.click_PIN();
	home.click_OTP();
   }
	
	//click on login to enter the homepage
	@And("^Click on login button$")
	   public void login2() throws InterruptedException   {
		   Sprintpageobject home =new  Sprintpageobject(driver);
		   Thread.sleep(2000);
		   home.click_Login();
	}
	//homepage is displayed
	@Then("^ Login should be successful$")
	   public void login3() {
		   System.out.println("hello to home page");
	  }
	
	   @After
		public void cleanUp() {
			
		}
	}





