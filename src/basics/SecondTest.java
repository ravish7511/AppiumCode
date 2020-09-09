package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidElement;

//script to take screenshot
public class SecondTest extends Capabilities {

	@Test
	public void secondTest() throws IOException {
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		driver.findElementByAndroidUIAutomator("text(\"People Names\")").click();
		AndroidElement ele = driver.findElementByAndroidUIAutomator("text(\"David\")");
		Assert.assertTrue(ele.isDisplayed());// execution will be interrupted
		TakesScreenshot ts = driver;// driver is of type AndroidDriver
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E://sample.png");
		FileHandler.copy(src, dest);

	}

}
