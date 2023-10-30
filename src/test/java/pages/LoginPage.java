package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    By UsernameField = By.className("input_error");
    By PasswordField = By.cssSelector("input[name=password]");
    By SubmitBtn = By.className("submit-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");


    public void clickSubmit() {
        driver.findElement(SubmitBtn).click();
    }
    public void enterUsername(String user) {
        driver.findElement(UsernameField).sendKeys(user);
    }
    public void enterPassword(String pass) {
        driver.findElement(PasswordField).sendKeys(pass);
    }

    public String getErrorMessage() {
       return driver.findElement(errorMessage).getText();
    }
}
