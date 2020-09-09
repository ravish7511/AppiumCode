package touchactions;

import java.time.Duration;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPressDemo extends Capabilities {

	//write a script to perform long press action
	@Test
	public void longPressDemo() {
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		AndroidElement ele = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		TouchAction t = new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(ele))
				.withDuration(Duration.ofSeconds(3))).release().perform();

	}
}
