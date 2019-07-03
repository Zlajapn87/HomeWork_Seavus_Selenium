package Pages;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class LoginPage extends BaseClass {



    public LoginPage(WebDriver driver) {
        super (driver);
        this.PAGE_TITLE = "Gmail";
        this.PAGE_URL = "https://gmail.com";
    }



    @FindBy(xpath = "//input[@type = \"email\"]") WebElement field_Email;
    @FindBy(xpath = "(//div[@role = \"button\"])[1]") WebElement button_Dalje;
    @FindBy(xpath = "//input[@type = \"password\"]") WebElement field_Password;
    @FindBy(xpath = "//div[@id = \"passwordNext\"]") WebElement button_passwordDalje;



    public void setEmail(String email) {
        setElementText(field_Email, email);
    };

    public void clickOnNextButton() {
        clickOnElmeent(button_Dalje);

    };

    public void clickOnNextPasswordButton() {
        clickOnElmeent(button_passwordDalje);

    };

    public void setPassword(String password) {
        setElementText(field_Password, password);
    };

    public WebElement returnPassField() {
        return field_Password;
    }


    //reading Password from a property file
    public String getPropertyValuePasswrod() throws IOException {
        Properties property = new Properties();
        FileInputStream fs;

        fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\DataProviders\\config.Property");
        property.load(fs);
        System.out.println(property.getProperty("password"));
        return property.getProperty("password");
    }

    //reading Email from a property file
    public String getPropertyValueEmail() throws IOException {
        Properties property = new Properties();
        FileInputStream fs;

        fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\DataProviders\\config.Property");
        property.load(fs);
        return property.getProperty("email");
    }

}



