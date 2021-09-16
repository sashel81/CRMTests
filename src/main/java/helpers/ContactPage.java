package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText = "Создать контактное лицо")
    private WebElement createContactFaceLink;

    @FindBy(css = "[data-page-component-name=\"crm-contact-grid\"]")
    private WebElement tableTitle;


    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContactFaceCreationPage creationOfContactFace() {
        createContactFaceLink.click();
        return new ContactFaceCreationPage(driver);
    }

    public boolean isTitleDisplayed() {
        boolean isDisplayed;
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(tableTitle));
        isDisplayed = tableTitle.isDisplayed();
        return isDisplayed;
    }
}
