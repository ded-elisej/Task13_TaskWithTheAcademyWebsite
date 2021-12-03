package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
    protected static WebDriver driver;
    private static String baseUrl = "https://belhard.academy/";

    @BeforeTest
    public void setup(){
        browserSetup();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    protected static void browserSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }




}
