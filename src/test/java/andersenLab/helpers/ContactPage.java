package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private By createContactFaceLink = By.linkText("Создать контактное лицо");
    private By tableTitle = By.cssSelector("[data-page-component-name=\"crm-contact-grid\"]");
    public ContactPage(WebDriver driver) {
        this.driver=driver;
    }

    public ContactFaceCreationPage creationOfContactFace() {
        driver.findElement(createContactFaceLink).click();
        return new ContactFaceCreationPage(driver);
    }
    public boolean isTitleDisplayed(){
        boolean isDisplayed;
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(tableTitle));
        isDisplayed = driver.findElement(tableTitle).isDisplayed();
        return isDisplayed;
    }
}
