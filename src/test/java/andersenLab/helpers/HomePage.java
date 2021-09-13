package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePageHelper{
    private WebDriver driver;
    private By contractorTab = By.xpath("//span[contains(.,'Контрагенты')]");
    private By contactFaceTab = By.xpath("//span[contains(.,'Контактные лица')]");
    private By projectTab = By.xpath("//span[contains(.,'Проекты')]");
    private By myProjectsTab = By.xpath("//span[contains(.,'Мои проекты')]");

    public HomePage(WebDriver driver) {
       this.driver=driver;
    }

    public ContactPage selectContactFace() {
        driver.findElement(contractorTab);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(contractorTab)).perform();
        driver.findElement(contactFaceTab).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return new ContactPage(driver);
    }

    public ProjectPage selectProject() {
        WebElement element = driver.findElement(projectTab);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(myProjectsTab).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new ProjectPage(driver);
    }
}