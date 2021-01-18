package hw4.ex1;

import hw4.data.AbstractPageTest;
import hw4.data.GetProperties;
import hw4.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class DefaultPageAllureTest extends AbstractPageTest {


    @Test(description = "Verify items on Default page after login")
    public void defaultPageAllureTest() {
        //1. Open test site by URL
        //2. Assert Browser title
        actionStep.openDefaultPage();
        assertionStep.checkDefaultPageTitle();

        //3. Perform login
        //4. Assert Username is logged
        actionStep.performLogin(GetProperties.getProperty("login"),GetProperties.getProperty("password"),GetProperties.getProperty("username"));

        //5. Assert that there are 4 items on the header section are displayed and they have proper texts
        assertionStep.checkHeaders(4);

        //6. Assert that there are 4 images on the Index Page and they are displayed
        assertionStep.checkImages(4);

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertionStep.checkImagesTexts(4);

        //8. Assert that there is the iframe with “Frame Button” exist
        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        //10.Switch to original window back
        String window_hendler = driver.getWindowHandle();
        driver.switchTo().frame("frame");
        actionStep.checkIframeButton();
        driver.switchTo().window(window_hendler);

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
        assertionStep.checkLeftMenuItems(5);

    }
}
