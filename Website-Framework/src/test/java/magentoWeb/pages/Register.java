package magentoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends BasePage {

    private final By firstNameTextField = By.id("firstname");
    private final By lastNameTextField = By.id("lastname");
    private final By emailTextField = By.id("email_address");
    private final By passwordTextField = By.id("password");
    private final By confirmPasswordTextField = By.id("password-confirmation");
    private final By createAnAccountBtn = By.xpath("//button[@title='Create an Account']");

    public WebElement getFirstNameTextField() {
        return findElement(firstNameTextField);
    }

    public void enterFirstName(String firstName1) {
        getFirstNameTextField().sendKeys(firstName1);
    }

    public WebElement getLastNameTextField() {
        return findElement(lastNameTextField);
    }

    public void enterLastName(String lastName1) {
        getLastNameTextField().sendKeys(lastName1);
    }

    public WebElement getEmailTextField() {
        return findElement(emailTextField);
    }

    public void enterEmail(String email1) {
        getEmailTextField().sendKeys(email1);
    }

    public WebElement getPasswordTextField() {
        return findElement(passwordTextField);
    }

    public void enterPassword(String password) {
        getPasswordTextField().sendKeys(password);
    }

    public WebElement getConfirmPasswordTextField() {
        return findElement(confirmPasswordTextField);
    }

    public void enterConfirmPassword(String password1) {
        getConfirmPasswordTextField().sendKeys(password1);
    }

    public WebElement getCreateAnAccountBtn() {
        return findElement(createAnAccountBtn);
    }

    public MyAccount clickOnCreateAccountBtn() {
        getCreateAnAccountBtn().click();
        return new MyAccount();
    }
}