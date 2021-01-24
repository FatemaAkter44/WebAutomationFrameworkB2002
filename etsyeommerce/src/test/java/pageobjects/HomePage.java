package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "global-enhancements-search-query")
    WebElement searchBox;
    @FindBy(how = How.CLASS_NAME, using = "wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin")
    WebElement signIn;
    @FindBy(how = How.ID, using = "join-neu-overlay-title")
    WebElement signinPageTittle;

    public String getPageTittle() {
        String pageTittle = driver.getTitle();
        TestLogger.log("page tittle : " + pageTittle);
        return pageTittle;
    }

    public void clickSignIn() {
        signIn.click();
        TestLogger.log("clicked on Sign In button");
    }

    public String getTilleSignInPage() throws NullPointerException {
        String titleText = signinPageTittle.getText();
        return titleText;
    }

    public void search() {

        searchBox.sendKeys("Indoor plants");
        TestLogger.log("Typed \"indoor plants\" on search bar ");
    }

}

