package khanacademy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class teachers {

	@FindBy (xpath="//span[text()='Teachers']")
	 private WebElement teacher;
	
	
	@FindBy (xpath="//a[@role='button']")
	private WebElement enterclasscode;
	
	
	@FindBy (xpath= "//span[text()='Profile']")
	private WebElement profile;
	
	public teachers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void teach() {
		teacher.click();
	}
	public void code() {
		enterclasscode.click();
	}
	public void prof() {
		profile.click();
	}
	
}
