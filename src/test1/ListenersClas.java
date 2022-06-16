package test1;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClas implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("I failed executed  " +result.getName());
	}



}
