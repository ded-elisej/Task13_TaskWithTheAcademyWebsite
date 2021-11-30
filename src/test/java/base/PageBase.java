package base;

import org.openqa.selenium.WebDriver;

public class PageBase {
    public String getTitle(WebDriver driver){
        return driver.getTitle();
    }
}
