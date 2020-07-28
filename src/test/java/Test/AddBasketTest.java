package Test;

import PageObject.HomeElements;
import Utils.ConstantElements;
import Utils.ExpectedValues;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AddBasketTest extends BaseTest {
    @Test
    public void BasketTest() throws InterruptedException
    {
        HomeElements homeElements = PageFactory.initElements(driver, HomeElements.class);
        getURL(ConstantElements.pcPage);
        waitForElementByElement(homeElements.resultSearchText);
        JavascriptExecutor js = (JavascriptExecutor) driver; //sayfa kaydırma js
        js.executeScript("window.scrollBy(0,1000)");
        Random rnd=new Random();
        int result = rnd.nextInt(10) + 1;
        //System.out.println(result);
        waitSeconds(2);
        waitForElement(By.className("clearfix"));
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[4]/div[2]/ul/li["+result+"]")).click();
        waitForElementByElement(homeElements.addBasket);
        js.executeScript("window.scrollBy(0,1000)");
        String resultPrice=getElementText(homeElements.actualPrice);
        resultPrice=resultPrice.split(",")[0].replace(".","");
        clickWithEnter(homeElements.addBasket);
        waitSeconds(2);
        clickWithEnter(homeElements.toBasketPage);
        waitForElementByElement(homeElements.basketPagePrice);
        ExpectedValues.expectedPrice=getElementText(homeElements.basketPagePrice).split(",")[0].replace(".","");
        Assert.assertEquals(ExpectedValues.expectedPrice,resultPrice);

    }


}
