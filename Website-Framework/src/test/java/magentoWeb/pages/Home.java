package magentoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Home extends BasePage {

    private final By creatAnAccountTab = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
    private final By shopNewYogaBtn =By.xpath("//span[@class='action more button']");

    public WebElement getShopNewYogaBtn() {
        return findElement(shopNewYogaBtn);
    }

    public WebElement getCreatAnAccountTab() {
        return findElement(creatAnAccountTab);
    }

    public Register clickOnCreatAnAccountTab() {
        getCreatAnAccountTab().click();
        return new Register();

    }
    public Cart clickOnShopNewYogaBtn() {
        getShopNewYogaBtn().click();
        return new Cart();

    }

}
