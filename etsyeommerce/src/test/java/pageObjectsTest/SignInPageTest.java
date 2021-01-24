package pageObjectsTest;

import browserdriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import reporting.TestLogger;

public class SignInPageTest extends BrowserDriver {
    HomePage homePage = null;
    SignInPage signInPage = null;

    @BeforeMethod
    public void initializeElement(){
        WebDriver driver = null;
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage =PageFactory.initElements(driver, SignInPage.class); //we pussing the bye code
    }

    @Test
    public void typeInvalidEmailEInvalidPasswordToSignin(){
        homePage.clickSignIn();
        signInPage.typeInvalidEmailEmptyPasswordToSignIn();
        String actualErrorMessage
                = signInPage.getErrorMessegeInvalidEmaiAndPassword();
        String expectedErrorMessage = "Invalid password";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        TestLogger.log("Test Passed");
    }
}
