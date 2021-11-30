package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Browsers.*;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private static String baseUrl = "https://belhard.academy/";

    @BeforeTest
    public void setup(){
        browserSetup();
    }

    @AfterTest
    public void teardown() {
        WebDriverRunner.getWebDriver().quit();
    }

    protected static void browserSetup(){
        Configuration.browser = System.getProperty("browser", CHROME);
        open(baseUrl);
    }




}
