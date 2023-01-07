package testkhan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import khanacademy.addcode;
import khanacademy.login;
import khanacademy.teachers;

public class test1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
   driver.get("https://www.khanacademy.org/login");
   
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   
   Thread.sleep(2000);
   
   driver.manage().window().maximize();
   
     login l = new login(driver);
   
       l.Loginlink(); 
       l.enterun();
       l.pwd();
       l.Login();
   
       
       teachers teach = new teachers(driver);
       
       teach.teach();
       teach.code();
       
       
       addcode add = new addcode(driver);
       
       add.Add();
       add.continues();
       add.bac();
       
       
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
}
