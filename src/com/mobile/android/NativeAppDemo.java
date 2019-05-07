package com.mobile.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class NativeAppDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		File app = new File(new File("src"), "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "venu_android_emulator_device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), cap);
		//driver.closeApp();

	}

}
