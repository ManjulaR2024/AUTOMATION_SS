package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generic_Library.BaseTest;

public class Add_Address extends BasePage
{

	public Add_Address(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1] ")
	private WebElement myProfileoption;
	

	@FindBy(xpath="///*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div ")
	private WebElement myAddressButton;

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/div/div[1]/a/button ")
	private WebElement AddAddressButton;

	//	 WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
 //    WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
       
	@FindBy(id="Home")
	private WebElement AddresstypeRadioButton;
	
	@FindBy(id="Name")
	private WebElement name;

	@FindBy(id="House/Office Info")
	private WebElement HouseOrOfficeAddress;

	@FindBy(id="Street Info-label")
	private WebElement StreetInf;

	@FindBy(id="Landmark")
	private WebElement landmark;
	
	@FindBy(id="Country")
	private WebElement country;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="Pincode")
	private WebElement pincode;
	
	@FindBy(id="Phonenumber")
	private WebElement phonenumber;
	
	@FindBy(id="btnDisabled")
	private WebElement addaddressbutton;
	
	@FindBy(xpath="//*[@id=\"9lkvx1u\"]/div[1]/div[2]")
	private WebElement toastermessage;
	
	
	public WebElement getMyprofileoption()
	{
		return myProfileoption;
	}
	
	public WebElement getMyAddress()
	{
		return  myAddressButton;
	}
	
	public WebElement getAddAddress()
	{
		return AddAddressButton;
	}
	
	public WebElement getAddresstype()
	{
		return AddresstypeRadioButton;
	}
	
	public WebElement getaddName()
	{
		return  name;
	}
	
	public WebElement getHouseOfficeInf()
	{
		return HouseOrOfficeAddress;
	}
	
	public WebElement getstreetinf()
	{
		return  StreetInf;
	}
	
	public WebElement getLandmark()
	{
		return  landmark;
	}
	
	public WebElement getCountry()
	{
		return country;
	}
	
	public WebElement getState()
	{
		return state;
	}
	
	
	public WebElement getCity()
	{
		return city;
	}
	

	public WebElement getPincode()
	{
		return pincode;
	}
	
	public WebElement getPhoneNumber()
	{
		return phonenumber;
	}
	
	public WebElement getAddressButton()
	{
		return addaddressbutton;
	}
	
	public WebElement getToasterMessage()
	{
		return toastermessage;
	}
	
	public void Addaddress(String yourname, String building, String strinf, String lmark,String reqCountry, String reqstate, String reqcity,String pin,String phone)
	{
		getAccountButton().click();
		getMyprofileoption().click();
		getMyAddress().click();
		getAddAddress().click();
		getAddresstype().click();
		name.sendKeys(yourname);
		HouseOrOfficeAddress.sendKeys(building);
		StreetInf.sendKeys(strinf);
		landmark.sendKeys(lmark);
		Select Ctry=new Select(country);
		Ctry.selectByVisibleText(reqCountry);
		
		Select St=new Select(state);
		St.selectByVisibleText(reqstate);
		
		Select Ct=new Select(city);
		Ct.selectByVisibleText(reqcity);
		
		pincode.sendKeys(pin);
		phonenumber.sendKeys(phone);
		getAddressButton().click();
		
	//	WebElement errormessage;
	//	String str=errormessage.getText();
		


	}
	
	
	
}
