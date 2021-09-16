package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePageHelper {
    private WebDriver driver;
    @FindBy(xpath = "//span[contains(.,'Контрагенты')]")
    private WebElement contractorTab;
    @FindBy(xpath = "//span[contains(.,'Контактные лица')]")
    private WebElement contactFaceTab;
    @FindBy(xpath = "//span[contains(.,'Проекты')]")
    private WebElement projectTab;
    @FindBy(xpath = "//span[contains(.,'Мои проекты')]")
    private WebElement myProjectsTab;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContactPage selectContactFace() {
        Actions builder = new Actions(driver);
        builder.moveToElement(contractorTab).perform();
        contactFaceTab.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return new ContactPage(driver);
    }

    public ProjectPage selectProject() {
        Actions builder = new Actions(driver);
        builder.moveToElement(projectTab).perform();
        myProjectsTab.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new ProjectPage(driver);
    }
}