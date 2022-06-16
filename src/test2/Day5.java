package test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
	
	
	@Parameters({"URL"})
	@Test
	public void setGlobalValue(String url) {
		System.out.println("Global Values are set");
		System.out.println(url);
	}

}
