package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
public class NewDriver {
    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
        //Driver.getDriver().get("https://techproeducation.com");
        //Driver.getDriver().get("https://facebook.com");
    }
}
