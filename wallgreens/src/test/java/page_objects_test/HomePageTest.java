package page_objects_test;

import org.testng.annotations.Test;
import page_objects.ContactUsPage;
import page_objects.HomePage;

public class HomePageTest {
    HomePage homePage=null;
    ContactUsPage contactUsPage=null;
    @Test
    public void clickContactUsLink(){
     homePage.clickContactUs();
     contactUsPage.cutcupponButton();
    }
}
