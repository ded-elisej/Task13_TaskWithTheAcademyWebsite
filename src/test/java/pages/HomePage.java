package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    public HeaderPage header;
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
