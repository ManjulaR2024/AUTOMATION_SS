package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateAddress extends BasePage
{

	public UpdateAddress(WebDriver driver)
	{
		super(driver);

	}

	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1] ")
	private WebElement myProfileoption;


	@FindBy(xpath="///*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div ")
	private WebElement myAddressButton;

	@FindBy(xpath="//*[@id=\"editaddress_fl\"]")
	private WebElement UpdateAddressicon;
	

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[1]")
	private WebElement SelectAddress;

	@FindBy(xpath="//*[@id=\"Update Address\"]")
	private WebElement UpdateAddressbutton;
	
	
	
	public WebElement getSelectAddress() {
		return SelectAddress;
	}


	
	@FindBy(id="Name")
	private WebElement Name;


	@FindBy(id="House/Office Info")
	private WebElement House;


	@FindBy(id="Street Info")
	private WebElement Street;

	@FindBy(id="Landmark")
	private WebElement Landmark;

	@FindBy(id="Pincode")
	private WebElement Pincode;

	@FindBy(id="Phone Number")
	private WebElement PhoneNumber;

	@FindBy(id="Update Address")
	private WebElement UpdateAddressButton;

	public WebElement getMyProfileoption() {
		return myProfileoption;
	}



	public WebElement getMyAddressButton() {
		return myAddressButton;
	}


	public WebElement getUpdateAddress() {
		return UpdateAddressicon;
	}



	

	



	public WebElement getName()
	{
		return Name;
	}

	public WebElement getHouse()
	{
		return House;
	}


	public WebElement getStreet() 
	{
		return Street;
	}


	public WebElement getLandmark()
	{
		return Landmark;
	}

	public WebElement getPincode()
	{
		return Pincode;
	}

	public WebElement getPhoneNumber()
	{
		return PhoneNumber;
	}


	public WebElement getUpdateAddressButton()
	{
		return UpdateAddressButton;
	}


}
