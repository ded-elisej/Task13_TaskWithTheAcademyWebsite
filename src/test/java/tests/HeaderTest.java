package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

public class HeaderTest extends TestBase {

    @Test
    public void DaytimeCoursesLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToDaytimeCourses(driver);
        String newTab =driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Дневные онлайн курсы в Академии BELHARD в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void ManagementAndBusinessAnalysisLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToManagementAndBusinessAnalysis(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы управление и бизнес-анализ в сфере разработки ПО в Минске");
        driver.close();
       driver.switchTo().window(initialTab);
    }

    @Test
    public void ITBusinessSupportLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToITBusinessSupport(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы сопровождение it бизнеса в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void ProgrammingCoursesLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToProgrammingCourses(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы программирования в Минске с трудоустройством");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void GameDevelopmentLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToGameDevelopment(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы по разработке игр с нуля, школа разработки игр");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void MarketingAndSalesLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToMarketingAndSales(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы маркетинга, рекламы в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void InformationSecurityAndAdministrationLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToInformationSecurityAndAdministration(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы информационной безопасности и DevOps Системный инженер в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void SoftSkillsLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToSoftSkills(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы развития гибких навыков Soft-Skills для IT-специалистов");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void IntensiveCoursesLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToIntensiveCourses(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void OfferForEnterpreneursLinkTest(){
        String initialTab = driver.getWindowHandle();
        HeaderPage.goToOfferForEnterpreneurs(driver);
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Интенсивные онлайн курсы: маркетинг, реклама, программирование, разработка ПО, IT в Минске");
        driver.close();
        driver.switchTo().window(initialTab);
    }

    @Test
    public void onlineCoursesLinkTest(){
        HeaderPage.clickOnlineCoursesLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Виртуальные классы");
    }
    @Test
    public void ITCoursesForChildrenLinkTest() {
        HeaderPage.clickITCoursesForChildrenLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн курсы программирования для детей от 7 до 15 лет в Минске");
        driver.get("https://belhard.academy/");
    }
    @Test
    public void InternshipForAllDirectionsLinkTest() {
        HeaderPage.clickInternshipForAllDirectionsLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Стажировка в Академии BELHARD");
    }

    @Test
    public void BusinessAnalystInternshipLinkTest() {
        HeaderPage.clickBusinessAnalystInternshipLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Стажировка для бизнес-аналитиков в сфере разработки ПО");
    }

    @Test
    public void HRInternshipLinkTest() {
        HeaderPage.clickHRInternshipLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Стажировка для IT-рекрутеров в Академии BELHARD");
    }

    @Test
    public void EmploymentLinkTest() {
        HeaderPage.clickEmploymentLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Трудоустройство Академии BELHARD");
    }

    @Test
    public void CorporateTrainingLinkTest() {
        HeaderPage.clickCorporateTrainingLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Корпоративные ИТ-курсы онлайн в Минске");
    }

    @Test
    public void EducationForCitizensOfOtherCountriesLinkTest() {
        HeaderPage.clickEducationForCitizensOfOtherCountriesLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "IT курсы онлайн в Москве и всей России - Академия BELHARD");
        driver.get("https://belhard.academy/");

    }

    @Test
    public void ContactsLinkTest() {
        HeaderPage.clickContactsLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Контакты Академии BELHARD");
    }

    @Test
    public void VacanciesLinkTest() {
        HeaderPage.clickVacanciesLink(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Вакансии");
    }

}
