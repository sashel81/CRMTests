package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactFaceCreationPage extends BasePageHelper {
    private WebDriver driver;
    @FindBy(css = "input[data-name=\"field__last-name\"]")
    private WebElement surnameField;
    @FindBy(css = "input[data-name=\"field__first-name\"]")
    private WebElement nameField;
    @FindBy(css = ".company-container .select2-arrow")
    private WebElement companyField;
    @FindBy(xpath = "//div[contains(@class, 'select2-result-label') and text()='1234']")
    private WebElement selectCompanyName;
    @FindBy(css = "[data-name=\"field__job-title\"]")
    private WebElement positionField;
    @FindBy(css = ".btn-group:nth-child(4) > .btn")
    private WebElement saveAndCloseButton;


    public ContactFaceCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContactPage saveContactFace() {
        CharSequence uniqueName = "Face" + System.currentTimeMillis();
        surnameField.sendKeys(uniqueName);
        nameField.sendKeys("Роман");
        companyField.click();
        selectCompanyName.click();
        positionField.sendKeys("дворник");
        saveAndCloseButton.click();
        return new ContactPage(driver);
    }
}
