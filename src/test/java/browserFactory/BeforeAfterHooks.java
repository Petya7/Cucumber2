package browserFactory;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterHooks {

    public static WebDriver driver;

    public static WebDriver getBrowser(String browserType) {
        driver = null;
        switch (browserType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                
                options.addArguments("window-size=1920,1080");
                options.addArguments("--no-sanbox");
                options.addArguments("--remote-allow-origins=*");
                if("TRUE".equalsIgnoreCase(System.getenv("CHROME_HEADLESS"))){
                    options.addArguments("headless");
                }
                return driver = new ChromeDriver(options);
            case "edge":
                WebDriverManager.edgedriver().setup();
                return driver = new EdgeDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }

    @Before
    public void openBrowser() {
        driver = getBrowser("chrome");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
