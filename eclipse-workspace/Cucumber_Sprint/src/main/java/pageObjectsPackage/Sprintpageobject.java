package pageObjectsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.docstring.DocString;

public class Sprintpageobject {
	public Sprintpageobject(WebDriver driver) {
    PageFactory.initElements(driver, this);
}
    //to click the login button
    @FindBy(how=How.XPATH, using="//a[text()='LOGIN']")
    private WebElement txtbx_signin;
    
    //to click the userid button
   @FindBy(how=How.NAME, using="DUMMY1")
   private WebElement txtbx_user;
  
   //to click the userid textfield
   @FindBy(how=How.NAME, using= "AuthenticationFG.USER_PRINCIPAL")
   private WebElement txtbx_userid;
 
   //to click the password textfield
   @FindBy(how=How.NAME, using ="AuthenticationFG.ACCESS_CODE")
   private WebElement txtbx_password;
   
   //to click the dropdown button
   @FindBy(how=How.XPATH, using="//div[text()='Dashboard']")
   private WebElement txtbx_Dropdown;
   
   //to select the dropdown button
   @FindBy(how=How.XPATH, using="//a[text()='Customer Service']")
   private WebElement txtbx_Customer_Service;
   
   //to select the checkbox
   @FindBy(how=How.ID, using="AuthenticationFG.REMEMBER_USERID_CHECKBOX")
   private WebElement txtbx_checkbox;
   
   //to click the login button
   @FindBy(how=How.NAME, using="Action.VALIDATE_CREDENTIALS")
   private WebElement txtbx_Login1;
   
   public void click_signin() {
	   txtbx_signin.click();
   }
  
   public void click_user() {
	   txtbx_user.click();
		}
	
	public void enter_userid(String username) {
		txtbx_userid.sendKeys("577187266 ");
			}
	
	public void enter_password(String password) {
		txtbx_password.sendKeys("Disha@123");
			}
	public void click_Dropdown() {
		txtbx_Dropdown.click();
			}
	public void click_Customer_Service() {
		txtbx_Customer_Service.click();
			}
	public void click_checkbox() {
		txtbx_checkbox.click();
			}
	public void click_Login1() {
		txtbx_Login1.click();
		
	}
	//to click the mobile number button
 @FindBy(how=How.NAME, using="DUMMY2")
    private WebElement txtbx_Mobnum;
  
 public void click_Mobnum() {
	   txtbx_Mobnum.click();
   }
 //to click the mobile number textfield 
 @FindBy(how=How.ID, using="AuthenticationFG.RIB_LOGIN_MOBILE")
    private WebElement txtbx_Mobnum1;
 
 public void enter_Mobnum1( String number) {
	   txtbx_Mobnum1.sendKeys("7760577023");
   }
 //to click the authenticate button
 @FindBy(how=How.NAME, using="Action.RIB_VALIDATE_MOBILE_LOGIN")
    private WebElement txtbx_Authenticate;
 
 public void click_Authenticate() {
	   txtbx_Authenticate.click();
   }
 //to click the ATM button
 @FindBy(how=How.ID, using="AuthenticationFG.RIB_LOGIN_ATM_PIN")
    private WebElement txtbx_ATM;
 
 public void click_ATM() {
	   txtbx_ATM.click();
   }
 //enter the atm pin into the textfield
 @FindBy(how=How.XPATH, using="//input[@class='login-input-password']")
    private WebElement txtbx_atm;
 
 public void enter_ATM(String number) {
	   txtbx_atm.sendKeys("7411");
}
 //to click the atm pin
 @FindBy(how=How.ID, using="RIB_VALIDATE_MOBILE_PIN")
    private WebElement txtbx_PIN;
 
 public void click_PIN() {
	   txtbx_PIN.click();
 }
 //to click the otp button
 @FindBy(how=How.NAME, using="AuthenticationFG.RIB_LOGIN_OTP")
 private WebElement txtbx_OTP;

public void click_OTP() {
	   txtbx_OTP.click();
}
 //@FindBy(how=How.ID, using="RIB_VALIDATE_MOBILE_OTP")
   // private WebElement txtbx_OTP;
 
 //public void click_OTP() {
	//   txtbx_OTP.click();
//}

//@FindBy(how=How.NAME, using= "AuthenticationFG.USER_PRINCIPAL")
//private WebElement txtbx_userid1;
//
//
//public void enter_userid1(String username) {
//	txtbx_userid1.sendKeys("577187266 ");
//		}
//@FindBy(how=How.NAME, using ="AuthenticationFG.ACCESS_CODE")
//private WebElement txtbx_password1;
//
//public void enter_password1(String password) {
//	txtbx_password1.sendKeys("Disha@456");
//		}
//
//to click the login button
 @FindBy(how=How.XPATH, using="//input[@name='Action.RIB_VALIDATE_MOBILE_OTP']")
 private WebElement txtbx_Login;
 
 public void click_Login() {
	   txtbx_Login.click();
}
 
 	}
	

	
	 