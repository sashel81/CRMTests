package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactFaceCreationPage extends BasePageHelper {
    private WebDriver driver;
    private By surnameField = By.cssSelector("input[data-name=\"field__last-name\"]");
    private By nameField = By.cssSelector("input[data-name=\"field__first-name\"]");
    private By companyField = By.cssSelector(".company-container .select2-arrow");
    private By selectCompanyName = By.xpath("//div[contains(@class, 'select2-result-label') and text()='1234']");
    private By positionField = By.cssSelector("[data-name=\"field__job-title\"]");
    private By saveAndCloseButton = By.cssSelector(".btn-group:nth-child(4) > .btn");

    public ContactFaceCreationPage(WebDriver driver) {
        this.driver=driver;
    }

    public ContactPage saveContactFace() {
        CharSequence uniqueName = "Face" + System.currentTimeMillis();
        driver.findElement(surnameField).sendKeys(uniqueName);
        driver.findElement(nameField).sendKeys("Роман");
        driver.findElement(companyField).click();
        driver.findElement(selectCompanyName).click();
        driver.findElement(positionField).sendKeys("дворник");
        driver.findElement(saveAndCloseButton).click();
        return new ContactPage(driver);
    }
}
