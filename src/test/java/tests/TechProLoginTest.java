package tests;

import org.testng.annotations.Test;
import pages.TechproLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TechProLoginTest {
    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        techproLoginPage.username.sendKeys("techproed");
        techproLoginPage.password.sendKeys("SuperSecretPassword");
        techproLoginPage.submitButton.click();


    }

}
