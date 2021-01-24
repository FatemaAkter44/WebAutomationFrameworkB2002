package page_objects_test;

import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SignInPage;

public class SignInTest {
    HomePage homePage = null;
    SignInPage signInPage = null;
    @Test
    public void signinTest(){
       homePage.clickAllManu();
       homePage.clickonSigniBnutton();
       signInPage.putemail();
       signInPage.setClickContinue();
    }

}
