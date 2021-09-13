package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage extends BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private By projectCreationLink = By.linkText("Создать проект");
    private By titleName = By.cssSelector(".oro-subtitle");

    public ProjectPage(WebDriver driver) {
        this.driver=driver;
    }

    public void createProject() {
        waitAndClick(driver, projectCreationLink);
    }

    public String getText() {
        String actualTitle = driver.findElement(titleName).getText();
        return actualTitle;
    }


}