package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    WebDriver driver;

    public CheckoutCompletePage (WebDriver driver) {
        this.driver = driver;
    }

    By backHomeBtn = By.id("back-to-products");
    By thankyouMessage = By.className("complete-header");

    public void clickBackHomeBtn() {
        driver.findElement(backHomeBtn).click();
    }

    public String getThankyouMessage() {
      return   driver.findElement(thankyouMessage).getText();
    }
}
