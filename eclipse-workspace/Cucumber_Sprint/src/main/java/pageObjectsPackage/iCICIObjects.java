package pageObjectsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class iCICIObjects {
	public iCICIObjects (WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	//to click the Login button
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
	   
	   //to click the Login button
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
			txtbx_password.sendKeys("Disha@456");
				}
		public void click_Login1() {
			txtbx_Login1.click();
			
		}
		
	    
}
