package magentoWeb;

import magentoWeb.driver.WebDriverHandler;
import magentoWeb.pages.*;

import org.openqa.selenium.WebDriver;

public class MagentoWebsite extends BasePage {
    private final WebDriver webDriver = WebDriverHandler.getWebDriver();

    public Home home ;
    public Register register;
    public MyAccount myAccount;
    public Cart cart;


    public MagentoWebsite() {
        home=new Home();


    }
}
