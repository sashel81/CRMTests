package andersenLab;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class ContactFaceCreationTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        String chromeDriverPath = "\\src\\main\\resources\\chromedriver.exe";
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + chromeDriverPath);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void contactFaceCreation() {
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'Контрагенты')]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.xpath("//span[contains(.,'Контактные лица')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.cssSelector("input[data-name=\"field__last-name\"]")).sendKeys("Саленко");
        driver.findElement(By.cssSelector("input[data-name=\"field__first-name\"]")).sendKeys("Роман");
        driver.findElement(By.cssSelector(".company-container .select2-arrow")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'select2-result-label') and text()='1234']")).click();
        driver.findElement(By.cssSelector("[data-name=\"field__job-title\"]")).sendKeys("дворник");
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-page-component-name=\"crm-contact-grid\"]")));
        boolean isDisplayed = driver.findElement(By.cssSelector("[data-page-component-name=\"crm-contact-grid\"]")).isDisplayed();
        assertTrue(isDisplayed);
    }
}
