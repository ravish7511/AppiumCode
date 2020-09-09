package end2end;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class End_2_End {

	@Test
	public void addTOCart() throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// *
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// optional
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");// optional
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");// *
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ravisha\\Desktop\\appium\\ecom.apk");// *
		// dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"))")
				.click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("ravish");
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		System.out.println(driver.getContext());
		Thread.sleep(3000);
		System.out.println(driver.getContextHandles());
		Set<String> all_window = driver.getContextHandles();

		for (String win : all_window) {
			if (win.contains("WEB")) {
				driver.context("WEBVIEW_com.androidsample.generalstore");
			}
		}

		System.out.println(driver.getContext());

		Thread.sleep(10000);
		driver.findElementByXPath("//a").click();

	}
}
