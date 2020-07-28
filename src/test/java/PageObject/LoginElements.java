package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginElements {
    @FindBy(how= How.ID,using ="L-UserNameField")
    public WebElement inputUserName;
    @FindBy(how= How.ID,using ="L-PasswordField")
    public WebElement inputPassword;
    @FindBy(how = How.ID,using = "gg-login-enter")
    public  WebElement loginButton;

}
