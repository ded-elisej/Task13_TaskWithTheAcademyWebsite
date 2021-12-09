package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class HeaderTest extends TestBase {

    @Test
    @Description("this test compare page title with right title to make sure we're on the right page ")
    public void DaytimeCoursesLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToDaytimeCourses();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Дневные онлайн курсы в Академии BELHARD в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void ManagementAndBusinessAnalysisLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToManagementAndBusinessAnalysis();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы управление и бизнес-анализ в сфере разработки ПО в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void ITBusinessSupportLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToITBusinessSupport();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы сопровождение it бизнеса в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void ProgrammingCoursesLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToProgrammingCourses();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы программирования в Минске с трудоустройством");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void GameDevelopmentLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToGameDevelopment();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы по разработке игр с нуля, школа разработки игр");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void MarketingAndSalesLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToMarketingAndSales();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы маркетинга, рекламы в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void InformationSecurityAndAdministrationLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToInformationSecurityAndAdministration();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы информационной безопасности и DevOps Системный инженер в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void SoftSkillsLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToSoftSkills();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы развития гибких навыков Soft-Skills для IT-специалистов");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void IntensiveCoursesLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToIntensiveCourses();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void OfferForEnterpreneursLinkTest(){
        String initialTab = WebDriverRunner.getWebDriver().getWindowHandle();
        HeaderPage.goToOfferForEnterpreneurs();
        String newTab = WebDriverRunner.getWebDriver().getWindowHandles().toArray()[1].toString();
        switchTo().window(newTab);
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().switchTo().window(initialTab);
    }

    @Test
    public void onlineCoursesLinkTest(){
        HeaderPage.clickOnlineCoursesLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Виртуальные классы");
    }
    @Test
    public void ITCoursesForChildrenLinkTest() {
        HeaderPage.clickITCoursesForChildrenLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Онлайн курсы программирования для детей от 7 до 15 лет в Минске");
        open("https://belhard.academy/");
    }
    @Test
    public void InternshipForAllDirectionsLinkTest() {
        HeaderPage.clickInternshipForAllDirectionsLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Стажировка в Академии BELHARD");
    }

    @Test
    public void BusinessAnalystInternshipLinkTest() {
        HeaderPage.clickBusinessAnalystInternshipLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Стажировка для бизнес-аналитиков в сфере разработки ПО");
    }

    @Test
    public void HRInternshipLinkTest() {
        HeaderPage.clickHRInternshipLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Стажировка для IT-рекрутеров в Академии BELHARD");
    }

    @Test
    public void EmploymentLinkTest() {
        HeaderPage.clickEmploymentLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Трудоустройство Академии BELHARD");
    }

    @Test
    public void CorporateTrainingLinkTest() {
        HeaderPage.clickCorporateTrainingLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Корпоративные ИТ-курсы онлайн в Минске");
    }

    @Test
    public void EducationForCitizensOfOtherCountriesLinkTest() {
        HeaderPage.clickEducationForCitizensOfOtherCountriesLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "IT курсы онлайн в Москве и всей России - Академия BELHARD");
        open("https://belhard.academy/");

    }

    @Test
    public void ContactsLinkTest() {
        HeaderPage.clickContactsLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Контакты Академии BELHARD");
    }

    @Test
    public void VacanciesLinkTest() {
        HeaderPage.clickVacanciesLink();
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(title, "Вакансии");
    }

}
