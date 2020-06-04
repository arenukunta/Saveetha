package com.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srenu\\savitha\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
  
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Utest");
        //driver.findElement(By.id("searchSystemUser_userType")).click();
        Select dropdown = new Select(driver.findElement(By.id("searchSystemUser_userType")));
        dropdown.selectByVisibleText("Admin");
        System.out.println(dropdown.getOptions().size());
        driver.findElement(By.id("searchBtn")).click();
        //File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
              	
         try {
			FileUtils.copyFile(source,new File("C:/Selenium/screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
        
        //System.out.println(dropdown.getOptions().contains("All"));
        //List<WebElement> optionsList = new ArrayList<WebElement>();
        //optionsList = dropdown.getOptions();
        //System.out.println("First"+optionsList.indexOf(0));
        //System.out.println("Second"+optionsList.indexOf(1));
        //System.out.println("Third"+optionsList.indexOf(2));

	}

}
