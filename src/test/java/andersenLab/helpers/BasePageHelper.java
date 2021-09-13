package andersenLab.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageHelper {
    private WebDriver driver;
    private WebDriverWait wait;

    public void waitAndClick(WebDriver driver, By selector) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(("loader-overlay"))));
        wait.until(ExpectedConditions.elementToBeClickable(selector));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(("loader-overlay"))));
        driver.findElement(selector).click();
    }
}
