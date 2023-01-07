package khanacademy;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class method {
	
	 @BeforeClass
	 public void beforeclass() {
		 System.out.println("Before class");
	 }
      @BeforeMethod
       public void beforeMethod() {
    	  System.out.println("before method");
      }
      @Test (priority=1)
      public void test1() {
    	  System.out.println("test");
      }
      @Test (priority=2,dependsOnMethods= {"test3"})
      public void test2() {
    	  System.out.println("test2");}
    	  
    	  @Test (priority=3)
          public void test3() {
        	  System.out.println("test3");}
    	
        	  @Test (priority=4)
              public void test4() {
            	  System.out.println("test4");
      }
      @AfterMethod
      public void aftermethod1() {
    	  System.out.println("After Method is running");
      }
      @AfterClass
      public void afterclass() {
    	  System.out.println("after class is running");
      }
      
      
      
      
      
      
      
      
      
}
