package pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private AndroidElement dropdown;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private AndroidElement name;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private AndroidElement letsShop;
	
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickDropdown()
	{
		dropdown.click();
	}
	
	public void setName(String firstName)
	{
		name.sendKeys(firstName);
	}
	
	public void clickLetsShop()
	{
		letsShop.click();
	}

}
