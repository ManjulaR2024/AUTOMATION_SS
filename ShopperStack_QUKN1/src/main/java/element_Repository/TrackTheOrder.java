package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackTheOrder extends BasePage
{

	public TrackTheOrder(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[4] ")
	private WebElement myOrdersButton;
	
	@FindBy(xpath="//*[@id=\"panel2a-header\"]/div/div/div/div[4]/div/button[2]")
	private WebElement TrackOrder;

	public WebElement getMyOrdersButton()
	{
		return myOrdersButton;
	}

	
	public WebElement getTrackOrder()
	{
		return TrackOrder;
	}

	
	
	
}
