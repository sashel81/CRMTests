package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage extends BasePageHelper {
    private WebDriver driver;

    @FindBy(linkText = "Создать проект")
    private WebElement projectCreationLink;

    @FindBy(css = ".oro-subtitle")
    private WebElement titleName;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProjectCreationPage createProject() {
        waitAndClick(driver, projectCreationLink);
        return new ProjectCreationPage(driver);
    }

    public String getText() {
        String actualTitle = titleName.getText();
        return actualTitle;
    }


}