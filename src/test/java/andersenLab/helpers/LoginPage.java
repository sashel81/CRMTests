package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage extends BasePageHelper {
    private WebDriver driver;
    private Properties properties;
    private By usernameField = By.id("prependedInput");
    private By passwordField = By.id("prependedInput2");
    private By signInButton = By.id("_submit");


    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }


    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }


}
