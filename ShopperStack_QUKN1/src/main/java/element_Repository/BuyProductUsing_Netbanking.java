package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProductUsing_Netbanking extends BasePage
{


	public BuyProductUsing_Netbanking(WebDriver driver) 
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

	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/article/div/form/div[1]/div/label[1]/span[1]/input")
	private WebElement ChooseNetBanking;


	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/article/div/form/div[3]/button")
	private WebElement Proceed2;


	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/form/div[1]/div/label[2]/span[1]/input")
	private WebElement ChooseBank;


	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/form/div[2]/button")
	private WebElement Submit3;


	@FindBy(xpath = "//*[@id=\"User ID\"]")
	private WebElement UserId;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement Pwd;

	@FindBy(xpath = "//*[@id=\"Submit\"]")
	private WebElement Submit4;

	public WebElement getCart() {
		return Cart;
	}


	public WebElement getBuyNow() {
		return BuyNow;
	}



	public WebElement getChooseAddress() {
		return ChooseAddress;
	}



	public WebElement getProceedButton() {
		return ProceedButton;
	}



	public WebElement getChooseNetBanking() {
		return ChooseNetBanking;
	}


	public WebElement getProceed2() {
		return Proceed2;
	}



	public WebElement getChooseBank() {
		return ChooseBank;
	}



	public WebElement getSubmit3() {
		return Submit3;
	}


	public WebElement getUserId() {
		return UserId;
	}



	public WebElement getPwd() {
		return Pwd;
	}



	public WebElement getSubmit4() {
		return Submit4;
	}







}
