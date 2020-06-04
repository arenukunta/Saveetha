package com.testcase;

import java.io.IOException;

import com.testcases.WrapperMethod;

public class CallWrapper {

	public static void main(String[] args) throws InterruptedException, IOException {
		WrapperMethod wm = new WrapperMethod();
		wm.chrome_browser("https://opensource-demo.orangehrmlive.com/");
		//wm.enterapp("https://opensource-demo.orangehrmlive.com/");
		wm.byid_sendkey("txtUsername","Admin");
		wm.byid_sendkey("txtPassword","admin123");
		wm.byxpath_click("//*[@id=\"btnLogin\"]");
		wm.byxpath_click("//*[@id=\"menu_pim_viewPimModule\"]");
		Thread.sleep(2000);
		wm.byname_click("btnAdd");
		wm.byid_sendkey("firstName", "Saveetha");
		wm.byid_sendkey("lastName", "P");
		wm.fileupload("photofile","C:\\screenshot\\fileupload.jpg");
		wm.byxpath_click("//*[@id=\"btnSave\"]");
		wm.byid_click("btnSave");
		wm.byid_sendkey("personal_txtLicenNo","A12308974576");
		wm.byid_click("personal_optGender_2");
		//wm.byid_sendkey("personal_txtLicExpDate","2020-07-09");
		//wm.byxpath_sendkey("//*[@id=\"personal_txtLicExpDate\"]", "2020-08-09");
		//wm.byid_click("personal_cmbNation");
		wm.selectdropdown("personal_cmbNation","American");
		wm.byid_click("btnSave");
		wm.takesnap("C:\\Selenium\\session1.png");
		
		

	}

	
}
