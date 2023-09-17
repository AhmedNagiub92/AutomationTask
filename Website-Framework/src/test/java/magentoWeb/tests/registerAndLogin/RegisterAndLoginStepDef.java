package magentoWeb.tests.registerAndLogin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magentoWeb.driver.WebDriverHandler;
import magentoWeb.pages.BasePage;
import magentoWeb.tests.BaseTest;
import org.testng.Assert;

public class RegisterAndLoginStepDef extends BaseTest {
    Faker faker = new Faker();
    String emailAddress = faker.internet().emailAddress();
    String password = "Test@1234";
    String firstname = faker.artist().name();
    String lastname = faker.artist().name();

    @Given("Magento website is opened")
    public void magentoWebsiteIsOpened() throws InterruptedException {
        BasePage.waitUntilPageIsLoaded();
        Thread.sleep(2000);
    }

    @When("user clicks on create an account tab")
    public void userClicksOnCreateAnAccountTab() {
        browser.magentoWebsite.register = browser.magentoWebsite.home.clickOnCreatAnAccountTab();
    }

    @And("user enters firstName")
    public void userEntersFirstName() {
        browser.magentoWebsite.register.enterFirstName(firstname);
    }

    @And("user enters lastName")
    public void userEntersLastName() {
        browser.magentoWebsite.register.enterLastName(lastname);
    }

    @And("user enters email")
    public void userEntersEmail() {
        browser.magentoWebsite.register.enterEmail(emailAddress);
    }

    @And("user enters password")
    public void userEntersPassword() {
        browser.magentoWebsite.register.enterPassword(password);

    }

    @And("user enters confirmPassword")
    public void userEntersConfirmPassword() {
        browser.magentoWebsite.register.enterConfirmPassword(password);

    }

    @And("user clicks on create an account button")
    public void userClicksOnCreateAnAccountButton() {
        browser.magentoWebsite.register.scrollTo(browser.magentoWebsite.register.getCreateAnAccountBtn());
        browser.magentoWebsite.myAccount = browser.magentoWebsite.register.clickOnCreateAccountBtn();
    }


    @Then("user account created successfully")
    public void userAccountCreatedSuccessfully() {
        Assert.assertTrue(browser.magentoWebsite.myAccount.getSuccessMessage().isDisplayed());
    }


}
