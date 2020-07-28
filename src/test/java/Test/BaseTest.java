package Test;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseTest {
    WebDriver driver;
    Wait<WebDriver> wait;

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(12))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }


    public void getURL(String URL){
        driver.get(URL);
    }

    public void click(WebElement webElement){
            webElement.click();
    }
    public void clickWithEnter(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
    }
    public void sendKeys(WebElement webElement, String text){
            webElement.sendKeys(text);
    }
    public void sendKeysAndEnter(WebElement webElement, String text){

            webElement.sendKeys(text, Keys.ENTER);
    }
    public String getElementText(WebElement element){
        return  element.getText();
    }

    public void waitSeconds(int seconds) {
        try {
            System.out.println(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    //@After
    public void afterTest(){
        driver.quit();
    }


    public void waitForElement(By by) { //tıklanana kadar bekle
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
        catch(TimeoutException e){
            System.out.println(e);
        }
    }


    public void waitForElementByElement(WebElement element) { //element hali
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch(TimeoutException e){
            System.out.println(e);
        }
    }



}
