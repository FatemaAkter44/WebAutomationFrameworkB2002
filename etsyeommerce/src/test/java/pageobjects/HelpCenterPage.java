package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class HelpCenterPage {
    @FindBy(how = How.XPATH,using ="/html/body/header/div[1]/nav/div/div/div[4]/div/a/span[1]/strong")
    WebElement helpCenter;
    @FindBy(how = How.ID, using = "pf-dropdown-signin")
    WebElement signin;

    public void setHelpCenter(){
        helpCenter.click();
    }
    public String signInText(){
        String text = signin.getText();
        return text;
    }
}

