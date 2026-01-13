package framework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

import framework.FrameworkException;

public class Settings {
 
	public static Properties properties= loadWebProperties();

	public static Properties loadWebProperties()  {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		try {
			String relativePath= System.getProperty("user.dir");
			String fullPath=relativePath+"//src//test//resources//GlobalSettings.properties";
			properties.load(new FileInputStream(fullPath));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FrameworkException("FileNotFoundException while loading the Global Settings file");
		} catch (IOException e) {
			e.printStackTrace();
			throw new FrameworkException("IOException while loading the Global Settings file");
		}
		
		return properties;
	}
	
	public static Properties getProperties() {
		return properties;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
