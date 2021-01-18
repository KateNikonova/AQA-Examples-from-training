package hw4.steps;

import hw3.data.GetProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertionStep extends AbstractStep{
    public AssertionStep(WebDriver driver) {
        super(driver);
    }
    public static String multiText;


    @Step("Check Default page title")
    public void checkDefaultPageTitle(){
        defaultPage.checkDefaultPageTitle();
    }

    @Step("Headers on the page: '{count}'. And they have proper texts.")
    public void checkHeaders(int count){
        header.checkHeadersAmount(count);
        header.checkHeaders(header.headerHome, GetProperties.getProperty("headerHome"));
        header.checkHeaders(header.headerContactForm,GetProperties.getProperty("headerContactForm"));
        header.checkHeaders(header.headerService,GetProperties.getProperty("headerService"));
        header.checkHeaders(header.headerMetalColors,GetProperties.getProperty("headerMetalColors"));
    }

    @Step("Images on the page: '{count}'")
    public void checkImages(int count){
        image.checkImagesAmount(count);
        image.imageIsDisplayed(image.iconPractise);
        image.imageIsDisplayed(image.iconCustom);
        image.imageIsDisplayed(image.iconMulti);
        image.imageIsDisplayed(image.iconBase);
    }

    @Step("All '{count}' images have proper text")
    public void checkImagesTexts(int count){
        multiText = "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…";
        imageText.checkImagesTextAmount(count);
        imageText.checkImagesText(imageText.iconPractiseText, hw4.data.GetProperties.getProperty("iconPractiseText"));
        imageText.checkImagesText(imageText.iconCustomText, hw4.data.GetProperties.getProperty("iconCustomText"));
        imageText.checkImagesText(imageText.iconMultiText, multiText);
        imageText.checkImagesText(imageText.iconBaseText, hw4.data.GetProperties.getProperty("iconBaseText"));
    }

    @Step("Left menu items on the page: '{count}'. All items have proper text")
    public void checkLeftMenuItems(int count){
        leftMenuItem.checkItemsAmount(count);
        leftMenuItem.checkItems(leftMenuItem.menuItemHome, hw4.data.GetProperties.getProperty("itemHome"));
        leftMenuItem.checkItems(leftMenuItem.menuItemContactForm, hw4.data.GetProperties.getProperty("itemContactForm"));
        leftMenuItem.checkItems(leftMenuItem.menuItemService, hw4.data.GetProperties.getProperty("itemService"));
        leftMenuItem.checkItems(leftMenuItem.menuItemMetalColors, hw4.data.GetProperties.getProperty("itemMetalColors"));
        leftMenuItem.checkItems(leftMenuItem.menuItemElementPacks, hw4.data.GetProperties.getProperty("itemElementPacks"));
    }

    @Step("All selected elements are present in the logs")
    public void checkLogsOnThePage(){
        log.checkLogPresence(log.logWater);
        log.checkLogPresence(log.logWind);
        log.checkLogPresence(log.logSelen);
        log.checkLogPresence(log.logYellow);

    }
}
