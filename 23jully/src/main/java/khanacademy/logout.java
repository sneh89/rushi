package khanacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	
	@FindBy(xpath = "//span[@class='_wozql4 _13hnk7qk']")
private WebElement profile;
	
	
	@FindBy (xpath = "//span[text()='Log out']")
	private WebElement logout;
	
	public logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void pro() {
		profile.click();
	}
	public void lt() {
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
}
