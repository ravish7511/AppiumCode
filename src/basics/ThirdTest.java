package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ThirdTest extends Capabilities {

//write a script to scroll to specific element
	@Test
	public void thirdTest()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	
	}

}
