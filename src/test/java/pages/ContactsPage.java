package pages;

import org.openqa.selenium.WebDriver;

public class ContactsPage {
    public HeaderPage header;
    WebDriver driver;
    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }
}
