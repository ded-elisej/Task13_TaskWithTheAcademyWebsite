package pages;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.Wait;

public class HeaderPage extends TestBase {
    private static By HomeLink = By.cssSelector("[href = 'https://belhard.academy']");

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

    public static void goToHomePage(){
        $(HomeLink).click();
    }

    public static void goToDaytimeCourses(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(DaytimeCoursesLink)).perform();
    }

    public static void goToManagementAndBusinessAnalysis(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(ManagementAndBusinessAnalysisLink)).perform();
    }

    public static void goToITBusinessSupport(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(ITBusinessSupportLink)).perform();
    }

    public static void goToProgrammingCourses(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(ProgrammingCoursesLink)).perform();
    }

    public static void goToGameDevelopment(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(GameDevelopmentLink)).perform();
    }

    public static void goToMarketingAndSales(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(MarketingAndSalesLink)).perform();
    }

    public static void goToInformationSecurityAndAdministration(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(InformationSecurityAndAdministrationLink)).perform();
    }

    public static void goToSoftSkills(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(SoftSkillsLink)).perform();
    }

    public static void goToIntensiveCourses(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(IntensiveCoursesLink)).perform();
    }

    public static void goToOfferForEnterpreneurs(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ItCoursesDropdown)).click($(OfferForEnterpreneursLink)).perform();
    }

    public static void clickOnlineCoursesLink(){
        System.out.println("clicking online courses link");
        $(OnlineCoursesLink).click();
    }

    public static void clickITCoursesForChildrenLink(){
        System.out.println("clicking IT courses for children link");
        $(ITCoursesForChildrenLink).click();
    }

    public static void clickInternshipForAllDirectionsLink(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(InternshipDropdown)).click($(InternshipForAllDirectionsLink)).perform();
    }

    public static void clickBusinessAnalystInternshipLink(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(InternshipDropdown)).click($(BusinessAnalystInternshipLink)).perform();
    }

    public static void clickHRInternshipLink(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(InternshipDropdown)).click($(HRInternshipLink)).perform();
    }

    public static void clickEmploymentLink(){
        System.out.println("clicking employment link");
        $(EmploymentLink).click();
    }

    public static void clickCorporateTrainingLink(){
        System.out.println("clicking corporate training link");
        $(CorporateTrainingLink).click();
    }

    public static void clickEducationForCitizensOfOtherCountriesLink(){
        System.out.println("clicking education for citizens of other countries link");
        $(EducationForCitizensOfOtherCountriesLink).click();
    }

    public static void clickContactsLink(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ContactsDropdown)).click($(ContactsLink)).perform();
    }

    public static void clickVacanciesLink(){
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.moveToElement($(ContactsDropdown)).click($(VacanciesLink)).perform();
    }


}
