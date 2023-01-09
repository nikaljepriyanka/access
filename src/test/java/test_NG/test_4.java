package test_NG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_4 {

	  @BeforeMethod
	    public void m4() {
	    	System.out.println("browser opening");
	    }
	    
	    @Test(invocationCount=3)
	    public void TestA() {
	    	System.out.println("im testA");
	    	Assert.assertTrue(false);
	    }
	    
	    @Test(dependsOnMethods="TestA")
	    public void regression() {
	    	System.out.println("im testB");
	    	
	    }
	    
	    @Test
	    public void sanity1() {
	    	System.out.println("im testc");
	    }
	    
	    
	    @AfterMethod
	    public void c1() {
	    	System.out.println("broser close");
	    }
	    
}
