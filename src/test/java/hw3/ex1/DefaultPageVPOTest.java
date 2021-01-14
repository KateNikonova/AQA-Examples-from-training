package hw3.ex1;

import hw3.data.AbstractPageTest;
import hw3.data.GetProperties;
import hw3.page.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefaultPageVPOTest extends AbstractPageTest {

    public static DefaultPage defaultPage;
    public static LoginPage loginPage;
    public static Headers header;
    public static DefaultPageImages image;
    public static DefaultPageImagesText imageText;
    public static DefaultPageFrames frame;
    public static LeftMenuItems leftMenuItem;
    public static String multiText;

    @BeforeClass
    public static void startUp() {
        defaultPage =new DefaultPage(driver);
        loginPage = new LoginPage(driver);
        header = new Headers(driver);
        image = new DefaultPageImages(driver);
        imageText = new DefaultPageImagesText(driver);
        frame = new DefaultPageFrames(driver);
        leftMenuItem = new LeftMenuItems(driver);
        multiText = "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…";

    }

    @Test
    public void loginTest() {

    defaultPage.openDefaultPage();
    defaultPage.checkDefaultPageTitle();

    loginPage.openView();
    loginPage.inputLogin(GetProperties.getProperty("login"));
    loginPage.inputPassword(GetProperties.getProperty("password"));
    loginPage.clickLoginButton();
    loginPage.checkUserName(GetProperties.getProperty("username"));

    header.checkHeadersAmount(4);
    header.checkHeaders(header.headerHome,GetProperties.getProperty("headerHome"));
    header.checkHeaders(header.headerContactForm,GetProperties.getProperty("headerContactForm"));
    header.checkHeaders(header.headerService,GetProperties.getProperty("headerService"));
    header.checkHeaders(header.headerMetalColors,GetProperties.getProperty("headerMetalColors"));

    image.checkImagesAmount(4);
    image.imageIsDisplayed(image.iconPractise);
    image.imageIsDisplayed(image.iconCustom);
    image.imageIsDisplayed(image.iconMulti);
    image.imageIsDisplayed(image.iconBase);

    imageText.checkImagesTextAmount(4);
    imageText.checkImagesText(imageText.iconPractiseText,GetProperties.getProperty("iconPractiseText"));
    imageText.checkImagesText(imageText.iconCustomText,GetProperties.getProperty("iconCustomText"));
    imageText.checkImagesText(imageText.iconMultiText, multiText);
    imageText.checkImagesText(imageText.iconBaseText,GetProperties.getProperty("iconBaseText"));

    String window_hendler = driver.getWindowHandle();
    driver.switchTo().frame("frame");
    frame.checkButton();
    driver.switchTo().window(window_hendler);

    leftMenuItem.checkItemsAmount(5);
    leftMenuItem.checkItems(leftMenuItem.menuItemHome,GetProperties.getProperty("itemHome"));
    leftMenuItem.checkItems(leftMenuItem.menuItemContactForm,GetProperties.getProperty("itemContactForm"));
    leftMenuItem.checkItems(leftMenuItem.menuItemService,GetProperties.getProperty("itemService"));
    leftMenuItem.checkItems(leftMenuItem.menuItemMetalColors,GetProperties.getProperty("itemMetalColors"));
    leftMenuItem.checkItems(leftMenuItem.menuItemElementPacks,GetProperties.getProperty("itemElementPacks"));

    }
}
