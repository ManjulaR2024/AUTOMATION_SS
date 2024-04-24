package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cancel_Order extends BasePage
{

	public Cancel_Order(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[4] ")
	private WebElement myOrdersButton;
	
	@FindBy(xpath="//*[@id=\"panel2a-header\"]/div/div/div/div[5]/div/button ")
	private WebElement CancelOrdersButton;
	
	public WebElement getMyOrdersButton()
	{
		return  myOrdersButton;
	}
	
	public WebElement getCancelOrderButton()
	{
		return CancelOrdersButton;
	}
	
	public void CancelOrder()
	{
		getMyOrdersButton().click();
		getCancelOrderButton().click();
	
	}
	
	
}
