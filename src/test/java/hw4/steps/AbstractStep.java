package hw4.steps;

import hw4.page.*;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    public DefaultPage defaultPage;
    public LoginPage loginPage;
    public Headers header;
    public DefaultPageImages image;
    public DefaultPageImagesText imageText;
    public DefaultPageFrames frame;
    public LeftMenuItems leftMenuItem;
    public DropDownService dropDownService;
    public DifferentElementPageCheckboxes checkbox;
    public DifferentElementsPageRadioButtons radioButton;
    public DropDownColors dropDownColors;
    public DifferentElementsPageLogs log;

     protected AbstractStep(WebDriver driver){

         defaultPage = new DefaultPage(driver);
         loginPage = new LoginPage(driver);
         header = new Headers(driver);
         image = new DefaultPageImages(driver);
         imageText = new DefaultPageImagesText(driver);
         frame = new DefaultPageFrames(driver);
         leftMenuItem = new LeftMenuItems(driver);
         dropDownService = new DropDownService(driver);
         checkbox = new DifferentElementPageCheckboxes(driver);
         radioButton = new DifferentElementsPageRadioButtons(driver);
         dropDownColors = new DropDownColors(driver);
         log = new DifferentElementsPageLogs(driver);
    }


}
