package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
   WebDriver driver = null;
   @FindBy(how = How.CLASS_NAME, using = "blue-shadow")
   WebElement searchBox; // a page object
   //@FindBy(how = How.XPATH, using = "//*[@id=\"Homepage_Bottom_Content_Marketing-Misc-TopBrands-WaystoLiveWell_CEP\"]/div/div/div/div[5]/div/div[2]/div[2]/ul/li[1]/a/span")
   @FindBy(how = How.LINK_TEXT, using = "Contacts")
   WebElement contuctUs;
   public String clickContactUs(){
      contuctUs.click();
      TestLogger.log("clicked contact us button");
      return getPageTitle();
   }
   public String getPageTitle(){
      String pageTitle = driver.getTitle();
      TestLogger.log("page tittle: "+ pageTitle);
      return pageTitle;
   }
}
