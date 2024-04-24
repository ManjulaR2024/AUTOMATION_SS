package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProductFromCart extends BasePage
{

	public RemoveProductFromCart(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"cartIcon\"]")
	private WebElement Cart;
	
	@FindBy(xpath="	//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[1]")
	private WebElement SelectProduct;

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div/div[2]/div[3]/button")
	private WebElement RemoveProduct;
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div/div[2]/button[2]")
	private WebElement Confirmation;

	public WebElement getCart()
	{
		return Cart;
	}

		public WebElement getRemoveProduct() 
	{
		return RemoveProduct;
	}


		public WebElement getSelectProduct() {
			return SelectProduct;
		}

	
	public WebElement getConfirmation()
	{
		return Confirmation;
	}

		
	
}
