package test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"smoke"})
	public void MobileLoan() {
		System.out.println("Mobile Loan");
	}

	@Test
	public void CarLoan() {
		System.out.println("Car Loan");
	}

	@AfterTest
	public void cleanLogs()
	{
		System.out.println("I will execute last in Personal Loan");
	}
}
