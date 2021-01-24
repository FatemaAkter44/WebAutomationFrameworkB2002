package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class ContactUsPage {
    @FindBy(how = How.CLASS_NAME, using = "btn btn__rounded btn__white mt-close custom__close-modal")
    WebElement cuponExitButton;
    @FindBy (how = How.LINK_TEXT,using = "btn btn__blue")//class
    WebElement reorderContactLence;
    public void cutcupponButton(){
        TestLogger.log("click exit button on the cuppon offer ");
       cuponExitButton.click();
       TestLogger.log("Exit the cuppon");
    }
    public void setReorderContactLence(){
        TestLogger.log("click on reorder contact lence button");
        cuponExitButton.click();
        TestLogger.log("clicked on reorder contact lense button");
    }
}
