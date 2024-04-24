package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Generating_Invoice extends BasePage
{

	public Generating_Invoice(WebDriver driver)
	{
		super(driver);

	}

	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[4]")
	private WebElement myOrders;


	@FindBy(xpath="//*[@id=\"panel2a-header\"]/div/div/div/div[4]/div/button[1]")
	private WebElement InvoiceButton;


	public WebElement getMyOrders() 
	{
		return myOrders;
	}


	public WebElement getInvoiceButton()
	{
		return InvoiceButton;
	}



}
