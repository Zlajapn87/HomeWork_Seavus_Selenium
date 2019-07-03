package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BaseClass {



    public WebDriver driver;
    public WebDriverWait wait;
    public String PAGE_TITLE;
    public String PAGE_URL;


    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 3);
    }


    public void loadPage(){
        driver.get(getPageURL());
        Assert.assertTrue(driver.getTitle().equals(getPageTitle()));

    }

    public void setElementText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
        Assert.assertEquals(element.getAttribute("value"), text);
    }

    public void clickOnElmeent(WebElement element){
        element.click();
    };

    public String getPageURL() {
        return PAGE_URL;
    }

    public String getPageTitle() {
        return PAGE_TITLE;
    }


}


