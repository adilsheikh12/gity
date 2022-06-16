package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@AfterMethod
	public void AuthenticateData()
	{
		System.out.println("I will execute after every method in  Day 3 Classes");
	}
	//@Parameters({"Car"})
	//@Test
	public void OneLoan(String car) {
		System.out.println("One Loan");
		System.out.println(car);
	}

	@Test
	public void TwoLoan() {
		System.out.println("Two Loan");
	}

	@BeforeMethod
	public void ValidationData()
	{
		System.out.println("I will execute before every method in  Day 3 Classes");
	}
	@Test
	public void ThreeLoan() {
		System.out.println("Three Loan");
	}

	@Test
	public void FourLoan() {
		System.out.println("Four Loan");
	}


}
