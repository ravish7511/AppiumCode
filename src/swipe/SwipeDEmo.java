package swipe;

import java.time.Duration;

import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeDEmo extends Capabilities {

	
	@Test
	public void swipeDemo()
	{
//		int heightOfscreen = driver.manage().window().getSize().getHeight();
//		int widthOfScrenn=driver.manage().window().getSize().getWidth();
//		System.out.println(heightOfscreen+" "+widthOfScrenn);
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
//		TouchAction t=new TouchAction(driver);
//		t.longPress(LongPressOptions.
//				longPressOptions().withPosition(PointOption.point(540, 940))
//				.withDuration(Duration.ofSeconds(3))).moveTo(PointOption.point(540,500)).release().perform();
		System.out.println(driver.getContext());
	}
	
}
