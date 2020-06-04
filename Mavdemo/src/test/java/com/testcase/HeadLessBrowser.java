package com.testcase;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadLessBrowser {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		
		System.out.println("Title of the page is "+driver.getTitle());
				

	}

}
