package com.mtab.baseTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	private  URL url;
	protected  AndroidDriver driver;
	
	
	
//	public AndroidDriver getDriver(){
//		return driver;
//	}
	
	public  void launchApplication(String thePathOfApps) {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        ds.setCapability(MobileCapabilityType.NO_RESET, true);
        ds.setCapability(MobileCapabilityType.APP, thePathOfApps);
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, ds);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
	
}
