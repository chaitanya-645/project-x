package datausability;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class KeyWordDriven {
	public String propertyFetch(String key) throws Throwable
	{
FileInputStream fis= new FileInputStream("C:\\Users\\CHAITANYA\\eclipse-workspace\\mavenproject\\src\\test\\resources\\property\\keyword.txt");
Properties pobj= new Properties();
pobj.load(fis);
String data = pobj.getProperty(key);
return data;
}
}