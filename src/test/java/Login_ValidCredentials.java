import BasePackage.BaseClass;
import DataProviders.LoginCredentialsProvider;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class Login_ValidCredentials {

    public WebDriver driver;

    LoginPage lPage;
    HomePage hPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/chromedriver_74.exe");
        driver = new ChromeDriver();

        //Page factory
        lPage = PageFactory.initElements(driver, LoginPage.class);
        hPage = PageFactory.initElements(driver, HomePage.class);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }





    @Test
    public void LoginVerification() throws InterruptedException, IOException {
        lPage.loadPage();
        lPage.setEmail(lPage.getPropertyValueEmail());
        lPage.clickOnNextButton();
        lPage.wait.until(ExpectedConditions.elementToBeClickable(lPage.returnPassField()));
        lPage.setPassword(lPage.getPropertyValuePasswrod());
        lPage.clickOnNextPasswordButton();
        Assert.assertTrue(hPage.credentialsCheck());
    }
}
