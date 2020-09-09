package basics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

public 	AndroidDriver<AndroidElement> driver;
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//*
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//optional
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");//optional
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");//*
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ravisha\\Downloads\\ApiDemos-debug.apk");//*
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "90");
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
