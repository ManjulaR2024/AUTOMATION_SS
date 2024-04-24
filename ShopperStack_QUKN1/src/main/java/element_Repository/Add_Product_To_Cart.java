package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Library.BaseTest;

public class Add_Product_To_Cart extends BasePage
{

	public Add_Product_To_Cart(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"men\"] ")
	private WebElement Men;

	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/nav/ul/li[1]/div/aside/div[1]/ul[1]/li[3]/a")
	private WebElement Shirts;

	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div/div[3]/div[2]/button ")
	private WebElement AddtoCart;
	
	public WebElement getMenOption()
	{
		return Men;
	}
	
	public WebElement getShirtsOption()
	{
		return  Shirts;
	}
	
	public WebElement getAddToCart()
	{
		return AddtoCart;
	}
	
	public void AddToCart()
	{
		getMenOption().click();
		getShirtsOption().click();
		getAddToCart().click();
	}
	

}
