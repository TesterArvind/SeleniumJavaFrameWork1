package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String ProjectPath=System.getProperty("user.dir");
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();

	}
	
  public static void getProperties() {
	  
	try {
		  prop = new Properties();
		  
		  InputStream input = new FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
	      prop.load(input);
	      String browser= prop.getProperty("browser");
	      System.out.println(browser);
		
	}
	catch(Exception exe) {
		System.out.println(exe.getMessage());
		System.out.println(exe.getCause());
		exe.printStackTrace();
		
		
	}
	  
	}
  
  public static void setProperties() {
	  try {
		  
		  OutputStream output = new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties");
		  prop.setProperty("browser", "firefox");
		  prop.store(output, "null");
		  
	  }
	  catch(Exception exe) {
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
			
			
		}

	 
  
  }
}
