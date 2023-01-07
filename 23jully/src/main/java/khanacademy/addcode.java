package khanacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcode {
	
	@FindBy (xpath= "//input[@maxlength='8']")
	 private WebElement addcod;
	
	
	 @FindBy (xpath="//button[@type='button']")
	  private WebElement continues;
	 
	 @FindBy (xpath="//a[@role='button']")
	 private WebElement back;
	
	public addcode (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Add () {
		addcod.sendKeys("12345678");
	}
	public void continues() {
		continues.click();
	}
	
	public void bac() {
		back.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
