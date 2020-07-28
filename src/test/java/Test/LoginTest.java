package Test;

import PageObject.HomeElements;
import PageObject.LoginElements;
import Utils.ConstantElements;
import Utils.ExpectedValues;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BaseTest {
   @Test
   public void Test() throws InterruptedException{
       HomeElements homeElements = PageFactory.initElements(driver, HomeElements.class);
       LoginElements loginElements = PageFactory.initElements(driver, LoginElements.class);
       getURL(ConstantElements.webSite); //ConstantElements sayfası içinden sabit link verildi
       waitSeconds(3);
       click(homeElements.loginElement);
       waitSeconds(2);
       sendKeys(loginElements.inputUserName, ConstantElements.userName);
       sendKeys(loginElements.inputPassword, ConstantElements.password);
       waitSeconds(2);
       click(loginElements.loginButton);
       waitSeconds(2);
       Assert.assertEquals(getElementText(homeElements.profileName), ExpectedValues.expectedName);

   }



}
