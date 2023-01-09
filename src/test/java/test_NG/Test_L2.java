package test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_L2 {
    @BeforeSuite
    public void m1() {
    	System.out.println("im m1");
    }
	
    @BeforeClass
    public void m2() {
    	System.out.println("BeforeClass");
    }
    
    @BeforeTest
    public void m3() {
    	System.out.println("im m3");
    }
    
    @BeforeMethod
    public void m4() {
    	System.out.println("im m4");
    }
    
    @Test
    public void TestA() {
    	System.out.println("im testA");
    }
    
    @AfterMethod
    public void c1() {
    	System.out.println("im c1");
    }
    
    @AfterTest
    public void c2() {
    	System.out.println("im c2");
    }
    
    @AfterClass
    public void c3() {
    	System.out.println("im c3");
    }
    
    @AfterSuite
    public void c4() {
    	System.out.println("im c4");
    }
    
	}


