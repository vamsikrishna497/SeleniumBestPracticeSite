package com.Selenium.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAndFrames {
	static WebDriver driver;
	
	public static void main(String[]args) throws FileNotFoundException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/Raj/Downloads/Documents/SeleniumBestPracticeSite/src/com/Selenium/practice/Login.properties");
		try{
			prop.load(fis);
			
		}catch( Exception e){
			e.printStackTrace();
			
		}
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Raj/Desktop/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    
	    
	}

	
	

}
