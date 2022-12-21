package genericlib;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnerClass implements ITestListener{

	//@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test case started"+result.getName(),true);
	}

	//@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test case executed successfully"+result.getName(),true);
	}

	//@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh= (TakesScreenshot)BaseClass.driver;
		File src = sh.getScreenshotAs(OutputType.FILE);
		 File dist = new File("C:\\Users\\CHAITANYA\\eclipse-workspace\\mavenproject\\src\\main\\resources\\screenshot"+result.getName()+".png");
		 try {
			Files.copy(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
