package touchactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TapDemo  extends Capabilities{

	@Test
	public void tapDemo()
	{
		AndroidElement ele = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		TouchAction t =new TouchAction(driver);
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
	
	}
}
