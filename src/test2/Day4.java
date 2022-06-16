package test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(dependsOnMethods= {"setDataUP", "setPassword"})
	public void login() {
		System.out.println("Login Done");
	}
	@Parameters({"URL","Link"})
	@Test
	public void setDataUP(String url,String link ) {
		System.out.println("Getting Data");
		System.out.println(url);
		System.out.println(link);
	}
	
	@Test(enabled=false)
	public void setUsername() {
		System.out.println("Username");
	}

	@Test(timeOut=4000)
	public void setPassword() {
		System.out.println("Password");
	}

	@Test
	public void zallAreDone()
	{
		System.out.println("All are done");
	}


}
