package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SignInPage {
    @FindBy(how = How.ID, using = "ap_email")
    WebElement signin;
    @FindBy(how = How.ID, using = "hmenu-customer-avatar-icon")
    WebElement signinLogo;
    @FindBy(how = How.ID, using = "continue")
    WebElement clickContinue;
    @FindBy(how = How.CLASS_NAME, using = "a-alert-heading")
    WebElement errorMessage;
    public void putemail(){
        signin.sendKeys("hibijibi@gmail.com");
        TestLogger.log("type an envalid email on email field");
        //clickContinue.click();
        setClickContinue();
    }
    public void setClickContinue() {
        TestLogger.log("click continue button");
        clickContinue.click();
        TestLogger.log("clicked continue buttion");
    }
    public String getErrorMessage(){
        String error = errorMessage.getText();
        return error;
    }
    public String confarmSignInLogo(){
      String loginlogo = signinLogo.getText();
      return loginlogo;
    }
}
