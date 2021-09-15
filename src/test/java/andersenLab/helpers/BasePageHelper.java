package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageHelper {
    private WebDriverWait wait;

    public void waitAndClick(WebDriver driver, WebElement element) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(("loader-overlay"))));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(("loader-overlay"))));
        element.click();
    }
}
