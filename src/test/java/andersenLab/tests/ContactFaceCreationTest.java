package andersenLab.tests;// Generated by Selenium IDE

import andersenLab.helpers.ContactFaceCreationPage;
import andersenLab.helpers.ContactPage;
import andersenLab.helpers.HomePage;
import andersenLab.helpers.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactFaceCreationTest extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private Properties properties;
    private ContactPage contactPage;
    private ContactPage contactPageNew;
    private ContactFaceCreationPage contactFaceCreationPage;

    @Test
    public void contactFaceCreation() throws IOException {
        driver = super.driver;
        properties = new Properties();
        properties.load(new FileReader(new File("src/main/resources/local.properties")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(properties.getProperty("web.username"));
        loginPage.setPassword(properties.getProperty("web.password"));
        homePage = loginPage.clickSignInButton();
        contactPage = homePage.selectContactFace();
        contactFaceCreationPage = contactPage.creationOfContactFace();
        contactPageNew = contactFaceCreationPage.saveContactFace();
        assertEquals(true, contactPageNew.isTitleDisplayed());
    }
}
