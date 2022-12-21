package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genericlib.BaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Listeners(genericlib.ListnerClass.class)
public class Testcase1 extends BaseClass {
@Test
public void tc1() throws Throwable
{
	driver.findElement(By.id("taskSearchControl_field")).sendKeys(d.dataDriven("PRABHAS", 0, 0));


}
}
