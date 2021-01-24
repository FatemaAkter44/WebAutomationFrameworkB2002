package pageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HelpCenterPage;

import java.util.concurrent.TimeUnit;

public class HelpCenterPageTest {
    HelpCenterPage helpCenterPage = null;
    WebDriver driver = null;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatema Akter\\IdeaProjects\\WebAutomationFrameworkB2002\\utilities\\drivers\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.walgreens.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
    }
    @Test
    public void helpCenterLinkTest(){
        helpCenterPage.setHelpCenter();
        String actualText = helpCenterPage.signInText();
        String expectedText = "pf-dropdown-signin";
        Assert.assertEquals(actualText,expectedText);
    }

}
