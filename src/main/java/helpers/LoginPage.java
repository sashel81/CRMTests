package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePageHelper {
    private WebDriver driver;

    @FindBy(id = "prependedInput")
    private WebElement usernameField;

    @FindBy(id = "prependedInput2")
    private WebElement passwordField;

    @FindBy(id = "_submit")
    private WebElement signInButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public LoginPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public HomePage clickSignInButton() {
        signInButton.click();
        return new HomePage(driver);
    }


}
