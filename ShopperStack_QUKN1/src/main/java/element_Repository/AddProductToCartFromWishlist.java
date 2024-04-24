package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCartFromWishlist extends BasePage
{

	public AddProductToCartFromWishlist(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[3]")
	private WebElement Wishlist;

	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/div[1]")
	private WebElement AddProcuctfromwishlist;

	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/div[1]/div[2]/div[2]/button[1]")
	private WebElement AddtoCart2;
	

	public WebElement getWishlist() {
		return Wishlist;
	}

	public WebElement getAddProcuctfromwishlist() 
	{
		return AddProcuctfromwishlist;
	}

	

	public WebElement getAddtoCart2() {
		return AddtoCart2;
	}
	
public void AddtoCartfromWishlist() {
		
		getWishlist().click();
		getAddtoCart2().click();

	}
	

}
