package hw3.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

// login view locator
    @FindBy(id = "user-icon")
    private WebElement loginVew;

// login enter locator
   @FindBy(id = "name")
   private WebElement loginField;

// password enter locator
   @FindBy(id = "password")
   private WebElement passwordField;

// login button locator
   @FindBy(id = "login-button")
   private WebElement loginButton;

// user name locator
   @FindBy(id = "user-name")
   private WebElement userLogName;

// open login view
   public void openView(){

       loginVew.click();
   }

// enter login
   public void inputLogin(String login)
   {

       loginField.sendKeys(login);
   }

// enter password
    public void inputPassword(String password)
    {

        passwordField.sendKeys(password);
    }

// login
   public void clickLoginButton()
   {

       loginButton.click();
   }

// check user name
    public void checkUserName(String text)
    {

        assertEquals(userLogName.getText(), text);
    }

}
