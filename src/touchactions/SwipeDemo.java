package touchactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basics.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeDemo extends Capabilities {

@Test
public void swipeDemo()
{
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Inline\"]")).click();
	driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	AndroidElement src = driver.findElement(By.xpath("//*[@content-desc='15']"));
	AndroidElement dest = driver.findElement(By.xpath("//*[@content-desc='45']"));
	TouchAction t =new TouchAction(driver);
	t.longPress(LongPressOptions.longPressOptions().
			withElement(ElementOption.element(src)).
			withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(dest)).release().perform();
	
}

}
