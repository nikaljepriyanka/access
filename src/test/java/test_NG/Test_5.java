package test_NG;

import org.testng.annotations.Test;

public class Test_5 {

	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("Sanity test 1");
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("Regression test 2");
	}
	@Test(groups= {"sanity"})
	public void test3() {
		System.out.println("sanity test 3");
	}
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println(" Regression test 4");
	}
	

	

}
