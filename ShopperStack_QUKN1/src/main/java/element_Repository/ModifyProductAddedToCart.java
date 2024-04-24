package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifyProductAddedToCart extends BasePage
{

	public ModifyProductAddedToCart(WebDriver driver)
	{
		super(driver);

	}

	@FindBy(xpath="//*[@id=\"cartIcon\"]")
	private WebElement Cart;

	@FindBy(xpath="	//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[1]")
	private WebElement SelectProduct;


	public WebElement getSelectProduct() {
		return SelectProduct;
	}


	

	@FindBy(xpath="//*[@id=\"decrease\"]")
	private WebElement DecreaseButton;

	@FindBy(xpath="//*[@id=\"increase\"]")
	private WebElement IncreaseButton;

	
	
	public WebElement getCart() {
		return Cart;
	}


	public WebElement getDecreaseButton() {
		return DecreaseButton;
	}



	public WebElement getIncreaseButton() {
		return IncreaseButton;
	}



}
