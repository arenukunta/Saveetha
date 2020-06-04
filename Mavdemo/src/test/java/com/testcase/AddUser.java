package com.testcase;

import com.testcases.WrapperMethod;

public class AddUser {

	public static void main(String[] args) {
		
		WrapperMethod wm = new WrapperMethod();
		
		wm.chrome_browser("https://opensource-demo.orangehrmlive.com/");
		//wm.enterapp("https://opensource-demo.orangehrmlive.com/");
		wm.byid_sendkey("txtUsername","Admin");
		wm.byid_sendkey("txtPassword","admin123");
		wm.byxpath_click("//*[@id=\"btnLogin\"]");
		wm.byid_click("menu_admin_viewAdminModule");
		wm.byxpath_click("//*[@id=\"menu_admin_UserManagement\"]");
		wm.byxpath_click("//*[@id=\"menu_admin_viewSystemUsers\"]");
		wm.byname_click("btnAdd");
		wm.selectdropdown("systemUser_userType","Admin");
		wm.byid_sendkey("systemUser_employeeName_empName","Robert Craig");
		wm.byid_sendkey("systemUser_userName","Utest");
		wm.selectdropdown("systemUser_status","Enabled");
		wm.byid_sendkey("systemUser_password","Testpass1234@");
		wm.byid_sendkey("systemUser_confirmPassword","Testpass1234@");
		wm.byid_click("btnSave");

	}

}

