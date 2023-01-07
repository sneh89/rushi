package testkhan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class register {
	
	@FindBy (xpath="//a[text()='Register']")
	private WebElement register;
	
	@FindBy (xpath="//input[@id='name']")
	 private WebElement fullname;
	
	@FindBy (xpath="//input[@name='email']")
	 private WebElement email;
	
	@FindBy (xpath="(//input[@autocomplete='on'])[3]")
	private WebElement publicun;
	
	@FindBy (xpath="//input[@name='password']")
    private WebElement  pass;
	
	//@FindBy (xpath="")
	//private WebElement 
}
