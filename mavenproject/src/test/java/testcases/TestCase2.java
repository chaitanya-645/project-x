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
public class TestCase2 extends BaseClass {
@Test
public void tc2() throws Throwable
{
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys(d.dataDriven("PRABHAS", 0, 0));

}
}