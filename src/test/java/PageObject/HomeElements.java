package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeElements {
    @FindBy(how= How.CSS,using ="#header_wrapper > div.header-icon-container.robot-header-iconContainer.gg-w-5.gg-d-6.gg-t-14.gg-m-11.gg-w-push-14.gg-d-push-12.gg-t-push-0.gg-m-push-0 > div.profile-container.robot-header-iconContainer-profile > a > div.profile-icon-title > div > span.profile-name")
    public WebElement loginElement;
    @FindBy(how= How.CLASS_NAME,using ="profile-name")
    public WebElement profileName;
    @FindBy(how= How.ID,using ="search_word")
    public WebElement searchElement;
    @FindBy(how= How.XPATH,using ="/html/body/div[2]/header/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/input")
    public WebElement searchElement2;
    @FindBy(how = How.CLASS_NAME,using = "search-result-keyword")
    public  WebElement resultSearchText;
    @FindBy(how = How.ID,using = "add-to-basket")
    public WebElement addBasket;
    @FindBy(how = How.CLASS_NAME,using = "dIB")
    public WebElement toBasketPage;
    @FindBy(how = How.ID,using = "sp-price-highPrice")
    public WebElement actualPrice;
    @FindBy(how = How.CLASS_NAME,using = "total-price")
    public WebElement basketPagePrice;



}
