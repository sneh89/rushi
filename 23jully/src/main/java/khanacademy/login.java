package khanacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	// step1 to decleare the global variable
	@FindBy (xpath="//a[@id='login-or-signup']")
     private WebElement loginlink;
	
	
	@FindBy (xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")
	private WebElement username;
	
	

	 @FindBy (xpath="//input[@type='password']")
	 private WebElement password;
	
	

	@FindBy (xpath="//button[@type='submit']")
	private WebElement login;
	
	// step 2 initialisation of variable
	
	    public login(WebDriver driver) {
	     PageFactory.initElements(driver,this);
	    }
	   
	// step3 method create
	    
	    public void Loginlink() {
	    	loginlink.click();
	    }
	     public void enterun() {
	    	 username.sendKeys("krishikeshkatale57@gmail.com");
	     }
	    public void pwd() {
	    	password.sendKeys("Sn@67ehal");
	    }
	    public void Login() {
	    	 login.click();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
