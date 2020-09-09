package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserDemo {
	
	@Test
	public void setUp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//*
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//optional
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 11);//optional
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel4");//*
	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.fb.com");
	System.out.println(driver.getContext());
	
	driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("ravish");
	driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys("qwerty");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}