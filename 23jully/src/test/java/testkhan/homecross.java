package testkhan;

                        
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import khanacademy.addcode;
	import khanacademy.login;
	import khanacademy.logout;
	import khanacademy.teachers;

	public class homecross {
		WebDriver driver;
		 login l;
		 teachers tea;
		 addcode a;
		 logout log;
	 @Parameters("browser")
	 @BeforeTest
	 public void openBrowser(String browsername) {
		 System.out.println(browsername);
		 if(browsername.equals("Chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver = new ChromeDriver();}
	
		 if(browsername.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\sneha\\Downloads\\Firefox Installer (1).exe\"geckodriver-v0.32.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();}
		       
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.khanacademy.org/login");
	 }
			 
		   @BeforeClass
		   public void beforeclass()  {
			   l = new login(driver);
			   tea = new teachers(driver);
			   log = new logout(driver) ;
                             }
	   
		   @BeforeMethod
		   public void beforemethod() {
	      
			   l = new login(driver);
	       l.Loginlink(); 
	       l.enterun();
	       l.pwd();
	       l.Login();}
		   
		   @Test
		   public void test1() {
			   System.out.println("test1 is running");
			   
			//   tea = new teachers(driver);
			   tea.teach();
			   
			   
			   String url = driver.getCurrentUrl();
			   
			   if(url.equals("https://www.khanacademy.org/profile/me/teachers")) {
				 System.out.println("Test1 case is passed");  
				 
			   }
			   else {
				   System.out.println("test1 case is failed");
			   }
		   }
		   
		   
		 
		   
		   @Test
		   public void test2() {
			   System.out.println("test2 is running");
			   
			  // tea = new teachers(driver);
			   tea.prof();
			   
			   String url2 = driver.getCurrentUrl();
			   
			   if(url2.equals("https://www.khanacademy.org/profile/me/")) {
				 System.out.println("Test2 case is passed");  
			   }
			   else {
				   System.out.println("test2 case is failed");
			   }
		   }
		   
			   @AfterMethod
			   public void aftermethod() {
				    
				 
				  log.pro(); 
				   log.lt();
			   }
			   
			   @AfterClass
			   public void afterclass() {
				   l=null;
				   tea=null;
				   log=null;
				   
			   }
			   @AfterTest
			   public void aftertest () {
				   driver.close();
				   System.gc();
			   }
			   
			   
			   
			   

}
