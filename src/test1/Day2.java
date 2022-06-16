package test1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void HomeLoan() {
		System.out.println("Home Loan");
	}

	@Test
	public void LandLoan() {
		System.out.println("Land Loan");
	}
	@AfterSuite
	public void clearingCookies()
	{
		System.out.println("I will execute after everything");
	}

}
