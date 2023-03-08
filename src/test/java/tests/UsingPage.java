package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class UsingPage {
    @Test
    public void testName(){
        AmazonPage amazonPage=new AmazonPage();
        //Navigate to Amazon
        Driver.getDriver().get("https://amazon.com");

        //Let us search for Iphone
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //Let's test that the result text contains iphone
        String actualResult=amazonPage.sonucYazisi.getText();
        String searchedWord="iphone";
        assert actualResult.contains(searchedWord);
        Driver.closeDriver();
    }
}
