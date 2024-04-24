package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delete_ProductFromCart extends BasePage
{

	public Delete_ProductFromCart(WebDriver driver)
	{
		super(driver);
		
	}


	@FindBy(xpath="//*[@id=\"cartIcon\"] ")
	private WebElement Cart;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[1]")
	private WebElement Selectproduct;
	
	
	
	public WebElement getSelectproduct() {
		return Selectproduct;
	}


	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[1]/div[2]/div[3]/button ")
	private WebElement RemoveFromCart;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2] ")
	private WebElement RemoveProductConfirmation;

	public WebElement getCart() {
		return Cart;
	}

	
	public WebElement getRemoveFromCart() {
		return RemoveFromCart;
	}

	
	public WebElement getRemoveProductConfirmation() {
		return RemoveProductConfirmation;
	}

	
	
	
}
