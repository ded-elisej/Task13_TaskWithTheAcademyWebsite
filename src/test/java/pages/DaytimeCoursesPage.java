package pages;

import base.PageBase;
import org.openqa.selenium.WebDriver;

public class DaytimeCoursesPage extends PageBase {
    public HeaderPage header;
    WebDriver driver;
    public DaytimeCoursesPage(WebDriver driver){
        this.driver = driver;
    }
}
