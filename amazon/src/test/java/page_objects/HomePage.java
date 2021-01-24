package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver=null;
    @FindBy(how = How.ID, using ="nav-hamburger-menu")
    WebElement allmanu;
    @FindBy(how = How.ID, using = "hmenu-customer-name")
    WebElement signIn;
    public void clickonSigniBnutton(){
        signIn.click();
        TestLogger.log("clicked on Hello, signin on top og the page");
    }
    public void clickAllManu(){
        allmanu.click();
        TestLogger.log("clicked on All manu button");
    }
    public String getpageTitale(){
        String pageTitale = driver.getTitle();
        TestLogger.log("Page Title" + pageTitale);
        return pageTitale;
    }
}
