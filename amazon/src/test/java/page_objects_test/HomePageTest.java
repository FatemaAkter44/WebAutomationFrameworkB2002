package page_objects_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SignInPage;

public class HomePageTest {
    HomePage homePage = null;
    SignInPage signInPage =null;
    @Test
    public void allButtonTest(){
        homePage.clickAllManu();
        String actualPage =signInPage.confarmSignInLogo();
        Assert.assertEquals(actualPage, "hmenu-customer-avatar-icon");

    }
}
