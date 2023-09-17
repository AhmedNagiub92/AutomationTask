package magentoWeb.tests.myCart;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magentoWeb.tests.BaseTest;
import org.testng.Assert;

public class MyCartStepDef extends BaseTest {
    Faker faker = new Faker();
    String mail = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    String firstname = faker.artist().name();
    String lastname = faker.artist().name();
    String city =faker.address().city();
    String state =faker.address().state();
    String phone = String.valueOf(faker.phoneNumber());
    String postalCode =faker.address().zipCode();
    String country =faker.address().country();





        @When("user clicks on shop new yoga")
        public void userClicksOnShopNewYoga() {
            browser.magentoWebsite.cart=browser.magentoWebsite.home.clickOnShopNewYogaBtn();
        }

        @And("user choose Echo fit compression short")
        public void userChooseEchoFitCompressionShort() {
            browser.magentoWebsite.cart.clickOnEchoFitCompressionShort();

        }

        @And("user choose the size")
        public void userChooseTheSize() {
            browser.magentoWebsite.cart.clickOnChoose28size();
        }

        @And("user Choose the color")
        public void userChooseTheColor() {
            browser.magentoWebsite.cart.clickOnChooseBlackColor();
        }

        @And("user clicks on Add to cart")
        public void userClicksOnAddToCart() {
            browser.magentoWebsite.cart.clickOnAddToCartBtn();
        }

        @And("user clicks on the cart")
        public void userClicksOnTheCart() {
            browser.magentoWebsite.cart.clickOnShoppingCart();
        }

        @And("user clicks on proceed to checkout")
        public void userClicksOnProceedToCheckout() {
            browser.magentoWebsite.cart.clickOnProceedToCheckoutBtn();
        }

        @And("user enters  shipping email")
        public void userEntersShippingEmail() throws InterruptedException {
            Thread.sleep(4000);
            browser.magentoWebsite.cart.enterShoppingEmail(mail);
        }

        @And("user enters shipping firstName")
        public void userEntersShippingFirstName() {
            browser.magentoWebsite.cart.enterShoppingFirstName(firstname);
        }

        @And("user enters shipping lastName")
        public void userEntersShippingLastName() {
            browser.magentoWebsite.cart.enterShoppingLastNameTextFieled(lastname);
        }

        @And("user enters shipping street address")
        public void userEntersShippingStreetAddress() {
            browser.magentoWebsite.cart.enterShoppingStreetAdress(streetAddress);
        }

        @And("user enters city")
        public void userEntersCity() {
            browser.magentoWebsite.cart.enterShoppingCity(city);
        }

        @And("user choose state")
        public void userChooseState() {
            browser.magentoWebsite.cart.enterShoppingState();
        }

        @And("user enter Postal code")
        public void userEnterPostalCode() {
            browser.magentoWebsite.cart.enterShoppingPostal(postalCode);
        }

        @And("user enter country")
        public void userEnterCountry() {
            browser.magentoWebsite.cart.selectShoppingCountry();
        }

        @And("user enters phone number")
        public void userEntersPhoneNumber() {
            browser.magentoWebsite.cart.enterShoppingPhone(phone);
        }

        @And("user choose shipping method")
        public void userChooseShippingMethod() {
            browser.magentoWebsite.cart.clickOnShoppingFixedShippingMethod();
        }

        @And("user clicks on Next Btn")
        public void userClicksOnNextBtn() {
            browser.magentoWebsite.cart.clickOnShoppingNextBtn();
        }

        @And("user clicks on place order")
        public void userClicksOnPlaceOrder() throws InterruptedException {
            Thread.sleep(3000);
            browser.magentoWebsite.cart.clickOnPlaceOrderBtn();
        }

        @Then("user get succes purchase with tracking ID")
        public void userGetSuccesPurchaseWithTrackingID() {
            Assert.assertTrue(browser.magentoWebsite.cart.getOrderID().isDisplayed());
        }
    }


