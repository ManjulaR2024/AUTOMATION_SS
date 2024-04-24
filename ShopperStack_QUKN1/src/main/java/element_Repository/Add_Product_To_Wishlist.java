package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Product_To_Wishlist extends BasePage
{

	public Add_Product_To_Wishlist(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"men\"] ")
	private WebElement Men;

	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/nav/ul/li[1]/div/aside/div[1]/ul[1]/li[2]/a")
	private WebElement TShirts;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/svg/path")
	private WebElement Like;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]")
	private WebElement SelectProduct;
	
	

	public WebElement getSelectProduct() {
		return SelectProduct;
	}

	

	public WebElement getMen()
	{
		return Men;
	}

	public WebElement getTShirts() 
	{
		return TShirts;
	}

	public WebElement getLike()
	{
		return Like;
	}
	
	
	
/*	public void AddToWish()
	{
		getMenOption().click();
		getShirtsOption().click();
		getAddToWishList().click();
	}
		*/
}
