package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    By finishBtn = By.id("finish");
    By paymentInfoMessage = By.xpath("//div[normalize-space()='Payment Information']");
    By shippingInfomation = By.xpath("//div[normalize-space()='Shipping Information']");
    By priceTotal = By.xpath("//div[normalize-space()='Price Total']");

    public void clickFinishBtn() {
        driver.findElement(finishBtn).click();
    }


    public boolean checkPaymentInfo() {
        return driver.findElement(paymentInfoMessage).isDisplayed();
    }

    public boolean shippingInfomation() {
        return driver.findElement(shippingInfomation).isDisplayed();
    }

    public boolean priceTotal() {
        return driver.findElement(priceTotal).isDisplayed();
    }


}
