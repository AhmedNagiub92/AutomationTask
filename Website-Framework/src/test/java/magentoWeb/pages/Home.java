package magentoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Home extends BasePage {

    private final By creatAnAccountTab = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
    private final By shopNewYogaBtn =By.xpath("//span[@class='action more button']");
    private final By searchTextFieled =By.id("search");
    private final By emailTextFieled =By.id("email");
    private final By passwordTextFieled =By.id("pass");
    private final By signINBtn =By.id("send2");
    private final By noSearchresult =By.xpath("//div[@class='message notice']//div[1]");
    private final By signIn =By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    private final By searchBtn =By.xpath("//button[@title='Search']");




    public WebElement getShopNewYogaBtn() {
        return findElement(shopNewYogaBtn);
    }
    public WebElement getCreatAnAccountTab() {
        return findElement(creatAnAccountTab);
    }
    public WebElement getSearchTextFieled() {
        return findElement(searchTextFieled);
    }
    public WebElement getSignIN() {
        return findElement(signIn);
    }
    public WebElement getEmailTextFieled() {
        return findElement(emailTextFieled);
    }
    public WebElement getPasswordTextFieled() {
        return findElement(passwordTextFieled);
    }
    public WebElement getSignINBtn() {
        return findElement(signINBtn);
    }
    public WebElement getSearchBtn() {
        return findElement(searchBtn);
    }

    public WebElement getNoSearchresult() {
        return findElement(noSearchresult);
    }

    public Register clickOnCreatAnAccountTab() {
        getCreatAnAccountTab().click();
        return new Register();

    }
    public Cart clickOnShopNewYogaBtn() {
        getShopNewYogaBtn().click();
        return new Cart();

    }
    public void clickOnSignIn() { getSignIN().click();}
    public void clickOnSignInBtn() { getSignINBtn().click();}
    public void clickOnSerchBtn() { getSearchBtn().click();}

    public void enterEmail(String email) {
        getEmailTextFieled().sendKeys("Test@12345.com");
    }
    public void enterPassword(String pass) {
        getPasswordTextFieled().sendKeys("Test@12345");
    }
    public void enterSearchKeyword(String keyword) {
        getSearchTextFieled().sendKeys("Nike");
    }

}
