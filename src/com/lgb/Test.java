package com.lgb;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Test extends UiAutomatorTestCase{
	
	public void testDemo() {
	
		try {
			UiDevice.getInstance().pressHome();
			UiObject browserObject=new UiObject(new UiSelector().text("浏览器"));
			browserObject.clickAndWaitForNewWindow();
			UiObject editObject = new UiObject(new UiSelector().className("android.widget.EditText"));
			editObject.click();
			UiDevice.getInstance().pressDelete();
			editObject.setText("www.baidu.com");
			UiDevice.getInstance().pressEnter();
			sleep(2000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
