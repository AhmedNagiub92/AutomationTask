package magentoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cart extends BasePage{
    private final By echoFitCompressionShort =By.xpath("//img[@alt='Echo Fit Compression Short']");
    private final By choose28size = By.id("option-label-size-143-item-171");
    private final By chooseBlackColor =By.id("option-label-color-93-item-49");
    private final By addToCartBtn =By.id("product-addtocart-button");
    private final By shoppingCart =By.linkText("shopping cart");
    private final By proceedToCheckoutBtn =By.xpath("//button[@data-role='proceed-to-checkout']");
    private final By shoppingEmailTextFieled =By.id("customer-email");
    private final By shoppingFirstNameTextFieled =By.xpath("//input[@name='firstname']");
    private final By shoppingLastNameTextFieled =By.xpath("//input[@name='lastname']");
    private final By shoppingStreetAdressTextFieled =By.xpath("//input[@name='street[0]']");
    private final By shoppingCityTextFieled =By.xpath("//input[@name='city']");
    private final By shoppingStateTextFieled =By.xpath("//div[@name='shippingAddress.region']//input[@name='region']");
    private final By shoppingPostalCodeTextFieled =By.xpath("//input[@name='postcode']");
    private final By shoppingCountryTextFieled =By.xpath("//div[@name='shippingAddress.country_id']//select[@name='country_id']");
    private final By shoppingPhoneTextFieled =By.xpath("//input[@name='telephone']");
    private final By shoppingFixedshippingMethod =By.xpath("//input[@name='ko_unique_1']");
    private final By shoppingNextBtn =By.xpath("//button[@class='button action continue primary']");
    private final By orderID = By.xpath("//div[@class='checkout-success']//p[1]");
    private final By placeorder = By.xpath("//button[@title='Place Order']");



    public WebElement getEchoFitCompressionShort() {
        return findElement(echoFitCompressionShort);
    }
    public WebElement getChoose28size() {
        return findElement(choose28size);
    }
    public WebElement getChooseBlackColor() {
        return findElement(chooseBlackColor);
    }
    public WebElement getAddToCartBtn() {
        return findElement(addToCartBtn);
    }
    public WebElement getShoppingCart() {
        return findElement(shoppingCart);
    }
    public WebElement getProceedToCheckoutBtn() {
        return findElement(proceedToCheckoutBtn);
    }
    public WebElement getShoppingEmailTextFieled() {
        return findElement(shoppingEmailTextFieled);
    }
    public WebElement getShoppingFirstNameTextFieled() {
        return findElement(shoppingFirstNameTextFieled);
    }
    public WebElement getShoppingLastNameTextFieled() {
        return findElement(shoppingLastNameTextFieled);
    }
    public WebElement getShoppingStreetAdressTextFieled() {
        return findElement(shoppingStreetAdressTextFieled);
    }
    public WebElement getShoppingCityTextFieled() {
        return findElement(shoppingCityTextFieled);
    }
    public WebElement getShoppingStateTextFieled() {
        return findElement(shoppingStateTextFieled);
    }
    public WebElement getShoppingPostalCodeTextFieled() {
        return findElement(shoppingPostalCodeTextFieled);
    }
    public WebElement getShoppingCountryTextFieled() {
        return findElement(shoppingCountryTextFieled);
    }
    public WebElement getShoppingPhoneTextFieled() {
        return findElement(shoppingPhoneTextFieled);
    }
    public WebElement getShoppingFixedshippingMethod() {
        return findElement(shoppingFixedshippingMethod);
    }
    public WebElement getShoppingNextBtn() {
        return findElement(shoppingNextBtn);
    }
    public WebElement getOrderID() {
        return findElement(orderID);
    }
    public WebElement getPlaceOrder() {
        return findElement(placeorder);
    }

    public void clickOnEchoFitCompressionShort() { getEchoFitCompressionShort().click();}
    public void clickOnChoose28size() { getChoose28size().click();}
    public void clickOnChooseBlackColor() { getChooseBlackColor().click();}
    public void clickOnAddToCartBtn() { getAddToCartBtn().click();}
    public void clickOnShoppingCart() { getShoppingCart().click();}
    public void clickOnProceedToCheckoutBtn() { getProceedToCheckoutBtn().click();}
    public void clickOnShoppingNextBtn() { getShoppingNextBtn().click();}
    public void clickOnShoppingFixedShippingMethod() { getShoppingFixedshippingMethod().click();}
    public void clickOnPlaceOrderBtn() { getPlaceOrder().click();}


    public void enterShoppingEmail(String mail) {
        getShoppingEmailTextFieled().sendKeys(mail);
    }
    public void enterShoppingFirstName(String firstName) {
        getShoppingFirstNameTextFieled().sendKeys(firstName);
    }
    public void enterShoppingLastNameTextFieled(String lastName) {
        getShoppingLastNameTextFieled().sendKeys(lastName);
    }
    public void enterShoppingStreetAdress(String address) {
        getShoppingStreetAdressTextFieled().sendKeys(address);
    }
    public void enterShoppingCity(String city) {
        getShoppingCityTextFieled().sendKeys(city);
    }
    public void enterShoppingPostal(String postal) {
        getShoppingPostalCodeTextFieled().sendKeys(postal);
    }
    public void selectShoppingCountry() {
        Select country = new Select (getShoppingCountryTextFieled());
        country.selectByVisibleText("Egypt");
    }
    public void enterShoppingPhone(String phone) {
        getShoppingPhoneTextFieled().sendKeys(phone);
    }
    public void enterShoppingState() {
        Select state = new Select (getShoppingStateTextFieled());
        state.selectByIndex(1);
    }

    public void shoppingPostal(String postal) {
        getShoppingPostalCodeTextFieled().sendKeys(postal);
    }

}
