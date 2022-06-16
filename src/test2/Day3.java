package test2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void MobileCreditCard() {
		System.out.println("MobileCreditCard");
	}

	@Test
	public void MobileDebitCard() {
		System.out.println("MobileDebitCard");
	}
	@BeforeClass
	public void StartClass() {
		System.out.println("I will execute first in class before any method execute");
	}
	@AfterClass
	public void EndClass() {
		System.out.println("I will execute last in class after every method execute");
	}
	@Test
	public void PhoneChecQueBook() {
		System.out.println("PhoneChecQueBook");
	}

	@Test
	public void PhonePassBook() {
		System.out.println("PhonePassBook");
	}

}
