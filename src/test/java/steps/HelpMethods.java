package steps;

import junit.framework.Assert;
import pages.*;

import static browserFactory.BeforeAfterHooks.driver;


public class HelpMethods {


    public void startBrowser() {
        driver.get("https://www.saucedemo.com/");
        hardWait(3000);
    }


    public void enterUsername(String uname) {
        LoginPage login = new LoginPage(driver);
        login.enterUsername(uname);
        hardWait(3000);
    }

    public void enterPassword(String pass) {
        LoginPage login1 = new LoginPage(driver);
        login1.enterPassword(pass);
        hardWait(3000);
    }

    public void clickSubmit() {
        LoginPage login2 = new LoginPage(driver);
        login2.clickSubmit();
        hardWait(3000);
    }

    public void assertErrorMessageIsVisible() {
        LoginPage loginPage = new LoginPage(driver);
        String actual = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals( loginPage.getErrorMessage(),actual);
    }

    public void badgeDisplayed() {
        MainPage main3 = new MainPage(driver);
        main3.isBadgeDisplayed();
    }


    public void assertHomePageIsVisible() {
        MainPage main2 = new MainPage(driver);
        String expected = "Swag Labs";
//        String actual = "Swag Labs";
        Assert.assertEquals(expected, main2.mainPageTitle());
    }

    public void clickAddToCart() {
        MainPage main = new MainPage(driver);
        main.clickAddToCart();
        hardWait(3000);
    }

    public void clickCartIcon() {
        MainPage main1 = new MainPage(driver);
        main1.clickCartIcon();
        hardWait(3000);
    }

    public void clickCheckoutBtn() {
        CartPage cart = new CartPage(driver);
        cart.clickCheckout();
        hardWait(3000);
    }


    public void enterFName(String fname) {
        CheckoutInfoPage checkoutInfo = new CheckoutInfoPage(driver);
        checkoutInfo.enterFirstName("Petya");
        hardWait(3000);
    }

    public void enterLName(String lname) {
        CheckoutInfoPage checkoutInfo = new CheckoutInfoPage(driver);
        checkoutInfo.enterLastName("Todorova");
        hardWait(3000);
    }

    public void enterPostcode(String pcode) {
        CheckoutInfoPage postcode = new CheckoutInfoPage(driver);
        postcode.enterPostcode("1000");
        hardWait(3000);
    }

    public void clickContinue() {
        CheckoutInfoPage clickContinueButton = new CheckoutInfoPage(driver);
        clickContinueButton.clickContinueBtn();
        hardWait(3000);

    }

    public void clickFinishButton() {
        CheckoutOverviewPage finish = new CheckoutOverviewPage(driver);
        finish.clickFinishBtn();
        hardWait(3000);
    }

    public void clickBackHomeButton() {
        CheckoutCompletePage backHome = new CheckoutCompletePage(driver);
        backHome.clickBackHomeBtn();
        hardWait(3000);
    }

    public void isProductDisplay() {
        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.isProductDisplayed());

    }

    public void assertThankyouMessageDisplay() {
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        String expectedMessage = "Thank you for your order!";
        Assert.assertEquals(expectedMessage, checkoutCompletePage.getThankyouMessage());

    }

    public void assertOrderDisplay() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertTrue(checkoutOverviewPage.checkPaymentInfo());
        Assert.assertTrue(checkoutOverviewPage.shippingInfomation());
        Assert.assertTrue(checkoutOverviewPage.priceTotal());
    }

    public void assertCheckoutPageDisplay() {
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
        Assert.assertTrue(checkoutInfoPage.isCheckoutPageDisplay());
    }

    public void hardWait(int timeSecond) {
        try {
            Thread.sleep(timeSecond);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
