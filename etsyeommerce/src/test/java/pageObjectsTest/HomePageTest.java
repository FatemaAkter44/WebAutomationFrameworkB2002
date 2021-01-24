package pageObjectsTest;

import browserdriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomePageTest extends BrowserDriver {
    HomePage homePage = null;
   @BeforeMethod
    public void initializeElements(){
       WebDriver driver = null;
       homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void searchTest(){
       homePage.search();
       String actualPageTitle = driver.getTitle();
       String expectedPageTitle = "Indoor plants | Etsy";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);

    }
    @Test
    public void signInButtonTest(){
       homePage.clickSignIn();
       String actualTitle = homePage.getTilleSignInPage();
       String expectedTittle ="\n" +
               "                            Sign in\n" +
               "                        ";
       Assert.assertEquals(expectedTittle, actualTitle);
    }

}
