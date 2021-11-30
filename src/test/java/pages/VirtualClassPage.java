package pages;

import base.PageBase;
import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class VirtualClassPage extends TestBase {
    public HeaderPage header;
    WebDriver driver;
    public VirtualClassPage(WebDriver driver){
        this.driver = driver;
    }
    //public static String getPageTitle(){
    //    return WebDriverRunner.getWebDriver().getTitle();
    //}
}
