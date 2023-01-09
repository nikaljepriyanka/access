package test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alphabetically {
	
@Test(priority=0)
public void dommy() {
	
	System.out.println("is dommy");
	Assert.assertTrue(false);
}
@Test(enabled=false)
public void modify() {
	System.out.println("is modify");
}

@Test(invocationCount=3)
public void justify() {
	System.out.println("is justify");
}

@Test(dependsOnMethods="justify")
public void depend() {
	System.out.println("is justify");
}
}
