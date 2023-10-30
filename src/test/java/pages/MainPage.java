package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {

    WebDriver driver;
    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.xpath("//a[@class='shopping_cart_link']");
    By mainPageTitle = By.xpath("//div[text()='Swag Labs']");
    By badge = By.xpath("//span[@class='shopping_cart_badge']");



    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }
    public String mainPageTitle() {
        return  driver.findElement(mainPageTitle).getText();

    }

    public boolean isBadgeDisplayed() {
        driver.findElement(badge);
        return driver.findElements(badge).size() > 0;
    }
}
