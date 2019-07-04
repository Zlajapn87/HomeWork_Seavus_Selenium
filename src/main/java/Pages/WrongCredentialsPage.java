package Pages;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WrongCredentialsPage extends BaseClass {

  public WrongCredentialsPage (WebDriver driver) {
      super (driver);
  }

  @FindBy (xpath = "//span[contains(text(), \"Погрешна\")]") WebElement text_message;

    public boolean credentialsCheck() {

        wait.until(ExpectedConditions.visibilityOf(text_message));

        if (text_message.isDisplayed()) {
            System.out.println("Inserted credentials are invalid, please check username and password");
            return true;
        }
        return false;
    }

}
