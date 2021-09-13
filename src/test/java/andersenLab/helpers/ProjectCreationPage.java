package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectCreationPage extends BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private By nameField = By.cssSelector("[data-name=\"field__name\"]");
    private By companyField = By.cssSelector(".company-container .select2-chosen");
    private By selectCompanyName = By.xpath("//div[contains(@class, 'select2-result-label') and text()='1234']");
    private By businessUnitField = By.cssSelector("[data-name=\"field__business-unit\"]");
    private By businessUnitName = By.xpath("//option[. = 'Research & Development']");
    private By curatorField = By.cssSelector("[data-name=\"field__curator\"]");
    private By curatorName = By.xpath("//option[. = 'Ким Юрий']");
    private By rpField = By.cssSelector("[data-name=\"field__rp\"]");
    private By rpName = By.xpath("//option[. = 'Ермакова Анастасия']");
    private By adminField = By.cssSelector("[data-name=\"field__administrator\"]");
    private By adminName = By.xpath("//option[. = 'Исаева Анастасия']");
    private By managerField = By.cssSelector("[data-name=\"field__manager\"]");
    private By managerName = By.cssSelector("[data-name=\"field__manager\"]");
    private By saveProjectTab = By.cssSelector(".btn-group:nth-child(4) > .btn");
    public ProjectCreationPage projectCreationPage;

    public ProjectCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProjectCreationPage createProject() {
        waitAndClick(driver, nameField);
        CharSequence uniqueName = "aData_" + System.currentTimeMillis();
        driver.findElement(nameField).sendKeys(uniqueName);
        driver.findElement(companyField).click();
        driver.findElement(selectCompanyName).click();
        driver.findElement(businessUnitField).click();
        WebElement dropdownBusinessUnit = driver.findElement(businessUnitField);
        dropdownBusinessUnit.findElement(businessUnitName).click();
        driver.findElement(curatorField).click();
        WebElement dropdownCurator = driver.findElement(curatorField);
        dropdownCurator.findElement(curatorName).click();
        driver.findElement(rpField).click();
        WebElement dropdownRp = driver.findElement(rpField);
        dropdownRp.findElement(rpName).click();
        driver.findElement(adminField).click();
        WebElement dropdownAdmin = driver.findElement(adminField);
        dropdownAdmin.findElement(adminName).click();
        driver.findElement(managerField).click();
        WebElement dropdownManager = driver.findElement(managerField);
        dropdownManager.findElement(managerName).click();
        driver.findElement(saveProjectTab).click();
        return new ProjectCreationPage(driver);
    }


}
