package testscripts;

import org.testng.annotations.Test;
import element_Repository.AddProductToCartFromWishlist;
import element_Repository.Add_Address;
import element_Repository.Add_Product_To_Cart;
import element_Repository.Add_Product_To_Wishlist;
import element_Repository.BuyProductUsing_COD;
import element_Repository.DeleteAddress;
import element_Repository.DeleteMyLikes;
import element_Repository.Delete_ProductFromCart;
import element_Repository.Edit_Profile;
import element_Repository.Generating_Invoice;
import element_Repository.ModifyProductAddedToCart;
import element_Repository.RemoveProductFromCart;
import element_Repository.UpdateAddress;
import generic_Library.BaseTest;

public class Execlass extends BaseTest
{

	@Test(priority=1)

	public void Add_AddressExe()
	{
		Add_Address AA=new Add_Address(driver);
		AA.getAccountButton().click();
		AA.getMyprofileoption().click();
		AA.getMyAddress().click();
		AA.getAddAddress().click();
		AA.getaddName().sendKeys("Mary");
		AA.getHouseOfficeInf().sendKeys("Americana Beach");
		AA.getstreetinf().sendKeys("Orange Ave");
		AA.getLandmark().sendKeys("SeaWorld");
		AA.getCountry().sendKeys("USA");
		AA.getState().sendKeys("Florida");
		AA.getCity().sendKeys("Orlando");
		AA.getPincode().sendKeys("38139");
		AA.getPhoneNumber().sendKeys("40732334");
		AA.getAddressButton().click();
	}

	@Test(priority=2)
	public void EditProfile()
	{
		Edit_Profile EP=new Edit_Profile(driver);
		EP.getAccountButton().click();
		EP.getMyProfilefileButton().click();
		EP.getEditProfileButton().click();
		EP.getSubmitButton().click();
		driver.switchTo().alert().accept();
	}

	@Test(priority=3)
	public void AddProductToCart()
	{
		Add_Product_To_Cart AC=new Add_Product_To_Cart(driver);
		AC.getMenLink().click();
		AC.getMenOption().click();
		AC.getShirtsOption().click();
		AC.getAddToCart().click();
		driver.switchTo().alert().accept();
	}

	@Test(priority=4)
	public void COD() 
	{
		BuyProductUsing_COD cod=new BuyProductUsing_COD(driver);
		cod.getCart().click();
		cod.getBuyNow().click();
		cod.getChooseAddress().click();
		cod.getProceedButton().click();
		cod.getChooseCOD().click();
		cod.getProceed2().click();
	}

	@Test(priority=4)
	public void DeleteMylikes() 
	{
		DeleteMyLikes DL=new DeleteMyLikes(driver);
		DL.getAccountButton().click();
		DL.getMyLikes().click();
		DL.getDeleteCrossbutton();
	}

	@Test(priority=5)
	public void Add_Product_To_WishList()
	{
		Add_Product_To_Wishlist apl=new Add_Product_To_Wishlist(driver);
		apl.getMen().click();
		apl.getTShirts().click();
		apl.getSelectProduct().isSelected();
		apl.getLike().click();
	}


	@Test(priority=6)
	public void AddProductToCartfromwishlist()
	{
		AddProductToCartFromWishlist apw=new AddProductToCartFromWishlist(driver);
		apw.getAccountButton().click();  
		apw.getWishlist().click();


		apw.getAddProcuctfromwishlist().isSelected();
		apw.getAddtoCart2().click();
	}


	@Test(priority=7)
	public void DeleteProductfromwishlist()
	{
		Delete_ProductFromCart dpc=new Delete_ProductFromCart(driver);
		dpc.getCart().click();
		dpc.getSelectproduct().isSelected();
		dpc.getRemoveFromCart().click();
	}


	@Test(priority=8)
	public void Generating_invoice()
	{
		Generating_Invoice gi=new Generating_Invoice(driver);
		gi.getAccountButton().click();
		gi.getMyOrders().click();
		gi.getInvoiceButton().click();

	}

	@Test(priority=9)
	public void ModifyProductqty()
	{
		ModifyProductAddedToCart mp=new ModifyProductAddedToCart(driver);
		mp.getCart().click();
		mp.getSelectProduct().isSelected();
		mp.getIncreaseButton().click();
		mp.getDecreaseButton().click();

	}

	@Test(priority=10)
	public void RemoveProcuctfromcart()
	{

		RemoveProductFromCart rp=new RemoveProductFromCart(driver);
		rp.getCart().click();
		rp.getSelectProduct().isSelected();
		rp.getRemoveProduct().click();
	}


	@Test(priority=11)
	public void Updateaddress()
	{
		UpdateAddress ua=new UpdateAddress(driver);
		ua.getAccountButton().click();
		ua.getMyProfileoption().click();
		ua.getMyAddressButton().click();
		ua.getSelectAddress().isSelected();
		ua.getName().sendKeys("Manjula Reddy");
		ua.getUpdateAddressButton().click();
	}
	
	@Test(priority=12)
	public void Deleteaddress()
	{
		DeleteAddress da=new DeleteAddress(driver);
		da.getAccountButton().click();
		da.getMyProfileoption().click();
		da.getMyAddressButton().click();
		da.getDeleteIcon().click();
		driver.switchTo().alert().accept();
	}
}
