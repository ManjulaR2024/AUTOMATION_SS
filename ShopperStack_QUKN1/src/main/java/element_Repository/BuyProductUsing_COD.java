package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProductUsing_COD extends BasePage
{

	public BuyProductUsing_COD(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath = "//*[@id=\"cartIcon\"]/path")
	private WebElement Cart;

	@FindBy(xpath = "//*[@id=\"buynow_fl\"]/span")
	private WebElement BuyNow;


	@FindBy(xpath = "//*[@id=\"36514\"]")
	private WebElement ChooseAddress;


	@FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[3]/button")
	private WebElement ProceedButton;

	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/article/div/form/div[1]/div/label[2]/span[1]/input")
	private WebElement ChooseCOD;


	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/article/div/form/div[3]/button")
	private WebElement Proceed2;


	public WebElement getCart()
	{
		return Cart;
	}


	public WebElement getBuyNow() 
	{
		return BuyNow;
	}


	public WebElement getChooseAddress() 
	{
		return ChooseAddress;
	}


	public WebElement getProceedButton()
	{
		return ProceedButton;
	}


	public WebElement getChooseCOD()
	{
		return ChooseCOD;
	}


	public WebElement getProceed2()
	{
		return Proceed2;
	}





}
