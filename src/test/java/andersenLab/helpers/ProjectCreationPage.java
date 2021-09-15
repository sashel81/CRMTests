package andersenLab.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectCreationPage extends BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(css = "[data-name=\"field__name\"]")
    private WebElement nameField;
    @FindBy(css = ".company-container .select2-chosen")
    private WebElement companyField;
    @FindBy(xpath = "//div[contains(@class, 'select2-result-label') and text()='1234']")
    private WebElement selectCompanyName;
    @FindBy(css = "[data-name=\"field__business-unit\"]")
    private WebElement businessUnitField;
    @FindBy(xpath = "//option[. = 'Research & Development']")
    private WebElement businessUnitName;
    @FindBy(css = "[data-name=\"field__curator\"]")
    private WebElement curatorField;
    @FindBy(xpath = "//option[. = 'Ким Юрий']")
    private WebElement curatorName;
    @FindBy(css = "[data-name=\"field__rp\"]")
    private WebElement rpField;
    @FindBy(xpath = "//option[. = 'Ермакова Анастасия']")
    private WebElement rpName;
    @FindBy(css = "[data-name=\"field__administrator\"]")
    private WebElement adminField;
    @FindBy(xpath = "//option[. = 'Исаева Анастасия']")
    private WebElement adminName;
    @FindBy(css = "[data-name=\"field__manager\"]")
    private WebElement managerField;
    @FindBy(xpath = "//option[. = 'Воденеева Алла']")
    private WebElement managerName;
    @FindBy(css = ".btn-group:nth-child(4) > .btn")
    private WebElement saveProjectTab;

    public ProjectCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProjectPage createProjectInfo() {
        waitAndClick(driver, nameField);
        CharSequence uniqueName = "aData_" + System.currentTimeMillis();
        nameField.sendKeys(uniqueName);
        companyField.click();
        selectCompanyName.click();
        businessUnitField.click();
        businessUnitName.click();
        curatorField.click();
        curatorName.click();
        rpField.click();
        rpName.click();
        adminField.click();
        adminName.click();
        managerField.click();
        managerName.click();
        saveProjectTab.click();
        return new ProjectPage(driver);
    }


}
