package touchactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDropDemo extends Capabilities {

	@Test
	public void dragAndDrop()
	{
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();
		AndroidElement src = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		AndroidElement dest = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		TouchAction t =new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions().
				withElement(ElementOption.element(src)).
				withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(dest)).release().perform();
		
	}
	
}
