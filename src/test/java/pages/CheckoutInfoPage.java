package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage {

    WebDriver driver;

    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstnameField = By.id("first-name");
    By lastnameField = By.id("last-name");
    By postcodeField = By.id("postal-code");
    By continueBtn = By.id("continue");
    By checkoutPageTitle = By.className("title");

    public void enterFirstName(String user) {
        driver.findElement(firstnameField).sendKeys(user);
    }

    public void enterLastName(String user) {
        driver.findElement(lastnameField).sendKeys(user);
    }

    public void enterPostcode(String code) {
        driver.findElement(postcodeField).sendKeys(code);
    }

    public void clickContinueBtn() {
        driver.findElement(continueBtn).click();
    }

    public boolean isCheckoutPageDisplay() {
        return driver.findElement(checkoutPageTitle).isDisplayed();
    }

}
