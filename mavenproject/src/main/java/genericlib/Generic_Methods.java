package genericlib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;

public class Generic_Methods {
	public  WebDriver driver;
	
	public   void geturl(String url) {
			driver.get(url);
	}
	
	/*
	     minimizing the web application page
	  */
    public void  minimize() {
		driver.manage().window().minimize();
	}
	
    /*
    maximizing the web application page
 */
public void  maximize() {
	driver.manage().window().minimize();
}

/*
resizing the web application page
*/

public void resize(int width,int height) {
	  
	Dimension d = new Dimension(width, height);
	driver.manage().window().setSize(d);
	
}

/*
positioning the web application page
*/

public void setposition(int x,int y) {
	  
	Point p = new Point(x, y);
	driver.manage().window().setPosition(p);
	
}

/*
implicitly wait for the web application page
*/

public void  implicitwait(int time)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

}





	
}
