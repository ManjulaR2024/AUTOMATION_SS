package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteMyLikes extends BasePage
{

	public DeleteMyLikes(WebDriver driver) 
	{
		super(driver);

	}

	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1] ")
	private WebElement myProfileoption;

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[4]/div")
	private WebElement MyLikes;

	@FindBy(xpath="//*[@id=\"Delete Kids\"]/svg")
	private WebElement DeleteCrossbutton;

	public WebElement getMyProfileoption()
	{
		return myProfileoption;
	}

	public WebElement getMyLikes()
	{
		return MyLikes;
	}


	public WebElement getDeleteCrossbutton()
	{
		return DeleteCrossbutton;
	}




}
