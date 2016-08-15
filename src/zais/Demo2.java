package zais;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
         @Test 
         public void method1(){
        	
        	 WebDriver driver = new FirefoxDriver();
        	 driver.get("https://www.google.co.in");
        	 
        	 Reporter.log("method1 jenkin called", true);
        	 driver.close();
         }
}
