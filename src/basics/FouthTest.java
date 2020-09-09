package basics;

import org.testng.annotations.Test;

//basic commands
public class FouthTest extends Capabilities {

	@Test
	public void basicCommands() {
		System.out.println(driver.getDeviceTime());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.currentActivity());
		driver.openNotifications();
		System.out.println(driver.getOrientation());
		System.out.println(driver.getBatteryInfo());

	}

}
