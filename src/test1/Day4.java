package test1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void CreditCard() {
		System.out.println("CreditCard");
	}

	@Test(groups= {"smoke"})
	public void DebitCard() {
		System.out.println("DebitCard");
	}
	@BeforeTest
	public void SetUpData()
	{
		System.out.println("I will execute first in PesonalLoan");
	}
	@Test(groups= {"sanity"})
	public void ChecqueBook() {
		System.out.println("ChecQueBook");
	}

	@Test
	public void PassBook() {
		System.out.println("PassBook");
	}


	@BeforeSuite
	public void SetGlobalData()
	{
		System.out.println("I will execute before anything");
	}
}
