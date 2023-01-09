package test_NG;

import org.testng.annotations.Test;

public class regre_sanity {

	
	@Test(groups= {"sanity"})
	public void sanity() {
		System.out.println("sanity");
		
	}
	
	@Test(groups= {"sanity"})
	public void sanity1() {
		System.out.println("sanity1");
		
	}
	@Test(groups= {"sanity"})
	public void sanity2() {
		System.out.println("sanity2");
		
	}
	@Test(groups= {"regression"})
	public void regre() {
		System.out.println("regre");
		
	}

}
