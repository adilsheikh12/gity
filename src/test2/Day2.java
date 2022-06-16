package test2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeTest
	public void setUpData()
	{
		System.out.println("I will execute first in HomeLoan");
	}
	@Test(groups= {"smoke"})
	public void PassedHomeLoan()
	{
		System.out.println("PassedHomeLoan");
	}

	@Test
	public void FailedHomeLoan()
	{
		Assert.assertTrue(false);
		System.out.println("FailedHomeLoan");
	}
	@AfterTest
	public void cleanLogs()
	{
		System.out.println("I will execute last in Home Loan");
	}

	
}
