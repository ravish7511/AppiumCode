package touchactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class PressDemo extends Capabilities {

	@Test
	public void pressDemo() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(3000);
		int heightOfTheScreen = driver.manage().window().getSize().getHeight();
		int widthOfTheScreen = driver.manage().window().getSize().getWidth();
		int middleHeightOfTheScreen = heightOfTheScreen/2;
		System.out.println(heightOfTheScreen);
		System.out.println(widthOfTheScreen);
		System.out.println(middleHeightOfTheScreen);
		
		int x=(int) (widthOfTheScreen * 0.5);//50% of the width
		int y=(int) (heightOfTheScreen * 0.5);//50% of the height
		System.out.println(x);
		System.out.println(y);
		
//		TouchAction swipe = new TouchAction(driver);//verical swipe
//		swipe.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(540,840)))
//		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
//		.moveTo(PointOption.point(540,400))
//		.release()
//		.perform();
		

	}
}
	
