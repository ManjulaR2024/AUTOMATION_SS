package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAddress extends BasePage
{

	public DeleteAddress(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1] ")
	private WebElement myProfileoption;


	@FindBy(xpath="///*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div ")
	private WebElement myAddressButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[1]")
	private WebElement SelectAddress;
	

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[1]/div[2]/div/button/span[1]/svg")
	private WebElement DeleteIcon;


	public WebElement getMyProfileoption() {
		return myProfileoption;
	}




	public WebElement getMyAddressButton() {
		return myAddressButton;
	}


	
	public WebElement getSelectAddress() {
		return SelectAddress;
	}


	public WebElement getDeleteIcon() {
		return DeleteIcon;
	}


	
}
