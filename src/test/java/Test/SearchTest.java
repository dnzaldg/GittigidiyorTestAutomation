package Test;

import PageObject.HomeElements;
import Utils.ConstantElements;
import Utils.ExpectedValues;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchTest extends BaseTest {

    @Test
    public void searchPageTest() throws InterruptedException
    {
        HomeElements homeElements = PageFactory.initElements(driver, HomeElements.class);
        getURL(ConstantElements.webSite);
        waitSeconds(5);
        WebElement searchElement = (isElementPresent(By.xpath("/html/body/div[2]/header/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/input"))) ? homeElements.searchElement2 : homeElements.searchElement;
        click(searchElement);
        Thread.sleep(5000);
        sendKeysAndEnter(searchElement, ConstantElements.searchText);
        Assert.assertEquals(ExpectedValues.searchTextResult,getElementText(homeElements.resultSearchText));
    }
}
