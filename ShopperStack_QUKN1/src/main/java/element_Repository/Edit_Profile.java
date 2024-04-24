package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Edit_Profile extends LoginPage

{

	public Edit_Profile(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[1]/div ")
	private WebElement myProfileButton;

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/section/div[1]/button ")
	private WebElement editProfileButton;

	@FindBy(xpath="/html/body/div[3]/div[3]/div/form/div[2]/div[1]/div ")
	private WebElement editFirstName;

	@FindBy(xpath="//*[@id=\"Last Name\"]")
	private WebElement editLastName;

	@FindBy(xpath="//*[@id=\":r14:\"]")
	private WebElement Calender;

	@FindBy(xpath="//button[text()='1']")
	private WebElement SelectDateButton;

	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTextField;

	@FindBy(id="Country")
	private WebElement Country;

	@FindBy(id="India")
	private WebElement India;

	@FindBy(id="State")
	private WebElement State;

	@FindBy(id="Karnataka")
	private WebElement Karnataka;

	@FindBy(id="Bengaluru")
	private WebElement Bengaluru;

	@FindBy(id="City")
	private WebElement City;

	@FindBy(id="submit")
	private WebElement SubmitButton;


	public WebElement getMyProfilefileButton()
	{
		return myProfileButton;
	}


	public WebElement getEditProfileButton()
	{
		return editProfileButton;
	}

	public WebElement geteEditProfileFirstName()
	{
		return editFirstName;
	}

	public WebElement geteEditProfileLastName()
	{
		return editLastName;
	}

	public WebElement geteCalenderIcon()
	{
		return Calender;
	}

	public WebElement geteDateButton()
	{
		return SelectDateButton;
	}

	public WebElement getePhoneNumberTextField()
	{
		return PhoneNumberTextField;
	}

	public WebElement getCountryDropdown()
	{
		return Country;
	}

	public WebElement getStateDropdown()
	{
		return State;
	}

	public WebElement getKarnatakaDropdown()
	{
		return Karnataka;
	}

	public WebElement getCityDropdown()
	{
		return City;
	}

	public WebElement getIndiaDropdown()
	{
		return India;
	}

	public WebElement getBengaluruDropdown()
	{
		return Bengaluru;
	}

	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}

	/*public void performEditProfile(String firstname, String lastname, String phonenumber, String Country, String state, String city)
	{
		getAccountButton().click();
		getMyProfilefileButton().click();
		getEditProfileButton().click();
		geteEditProfileFirstName().click();
		geteEditProfileLastName().click();
		geteCalenderIcon().click();
		geteDateButton().click();
		getePhoneNumberTextField().click();
		getCountryDropdown().click();
		getIndiaDropdown().click();
		getStateDropdown().click();
		getKarnatakaDropdown().click();
		getCityDropdown().click();
		getBengaluruDropdown().click();
		getSubmitButton().click();


	}*/


}
