package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HeaderPage extends TestBase {

    private static By DaytimeCoursesLink = By.cssSelector("[href = 'https://belhard.academy/daycourses']");
    private static By ManagementAndBusinessAnalysisLink = By.cssSelector("[href = 'https://belhard.academy/businessanalysis']");
    private static By ITBusinessSupportLink = By.cssSelector("[href = 'https://belhard.academy/itbusiness']");
    private static By ProgrammingCoursesLink = By.cssSelector("[href = 'https://belhard.academy/developmentpo']");
    private static By GameDevelopmentLink = By.cssSelector("[href = 'https://belhard.academy/gamedevelopment']");
    private static By MarketingAndSalesLink = By.cssSelector("[href = 'https://belhard.academy/marketing']");
    private static By InformationSecurityAndAdministrationLink = By.cssSelector("[href = 'https://belhard.academy/security']");
    private static By SoftSkillsLink = By.cssSelector("[href = 'https://belhard.academy/sskills']");
    private static By IntensiveCoursesLink = By.cssSelector("[href = 'https://belhard.academy/intensive']");
    private static By OfferForEnterpreneursLink = By.cssSelector("[href = 'https://belhard.academy/entrepreneurs']");

    private static By OnlineCoursesLink = By.cssSelector("[href = '/virtualclass']");
    private static By ItCoursesDropdown = By.cssSelector("[href = '#submenu:more2']");
    private static By ITCoursesForChildrenLink = By.cssSelector("[href = '/teens']");

    private static By InternshipDropdown = By.cssSelector("[href = '#submenu:more']");
    private static By InternshipForAllDirectionsLink = By.cssSelector("[href = 'https://belhard.academy/internship']");
    private static By BusinessAnalystInternshipLink = By.cssSelector("[href = 'https://belhard.academy/internshipba']");
    private static By HRInternshipLink = By.cssSelector("[href = 'https://belhard.academy/internshiphr']");

    private static By EmploymentLink = By.cssSelector("[href = '/employment']");
    private static By CorporateTrainingLink = By.cssSelector("[href = '/corporate']");
    private static By EducationForCitizensOfOtherCountriesLink = By.cssSelector("[href = 'https://belhard.academy/ru']");

    private static By ContactsDropdown = By.cssSelector("[href = '#submenu:more3']");
    private static By ContactsLink = By.cssSelector("[href = '/contact']");
    private static By VacanciesLink = By.cssSelector("[href = '/vacancy']");

    WebDriver driver;


    public static void goToDaytimeCourses(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(DaytimeCoursesLink)).perform();
    }

    public static void goToManagementAndBusinessAnalysis(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(ManagementAndBusinessAnalysisLink)).perform();
    }

    public static void goToITBusinessSupport(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(ITBusinessSupportLink)).perform();
    }

    public static void goToProgrammingCourses(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(ProgrammingCoursesLink)).perform();
    }

    public static void goToGameDevelopment(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(GameDevelopmentLink)).perform();
    }

    public static void goToMarketingAndSales(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(MarketingAndSalesLink)).perform();
    }

    public static void goToInformationSecurityAndAdministration(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(InformationSecurityAndAdministrationLink)).perform();
    }

    public static void goToSoftSkills(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(SoftSkillsLink)).perform();
    }

    public static void goToIntensiveCourses(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(IntensiveCoursesLink)).perform();
    }

    public static void goToOfferForEnterpreneurs(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ItCoursesDropdown)).click(driver.findElement(OfferForEnterpreneursLink)).perform();
    }

    public static void clickOnlineCoursesLink(WebDriver driver){
        System.out.println("clicking online courses link");
        driver.findElement(OnlineCoursesLink).click();
    }

    public static void clickITCoursesForChildrenLink(WebDriver driver){
        System.out.println("clicking IT courses for children link");
        driver.findElement(ITCoursesForChildrenLink).click();
    }

    public static void clickInternshipForAllDirectionsLink(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(InternshipDropdown)).click(driver.findElement(InternshipForAllDirectionsLink)).perform();
    }

    public static void clickBusinessAnalystInternshipLink(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(InternshipDropdown)).click(driver.findElement(BusinessAnalystInternshipLink)).perform();
    }

    public static void clickHRInternshipLink(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(InternshipDropdown)).click(driver.findElement(HRInternshipLink)).perform();
    }

    public static void clickEmploymentLink(WebDriver driver){
        System.out.println("clicking employment link");
        driver.findElement(EmploymentLink).click();
    }

    public static void clickCorporateTrainingLink(WebDriver driver){
        System.out.println("clicking corporate training link");
        driver.findElement(CorporateTrainingLink).click();
    }

    public static void clickEducationForCitizensOfOtherCountriesLink(WebDriver driver){
        System.out.println("clicking education for citizens of other countries link");
        driver.findElement(EducationForCitizensOfOtherCountriesLink).click();
    }

    public static void clickContactsLink(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ContactsDropdown)).click(driver.findElement(ContactsLink)).perform();
    }

    public static void clickVacanciesLink(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ContactsDropdown)).click(driver.findElement(VacanciesLink)).perform();
    }


}
