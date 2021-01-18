package hw4.ex1;

import hw4.data.AbstractPageTest;
import hw4.data.GetProperties;
import hw4.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class DifferentElementsAllureTest extends AbstractPageTest {


    @Test (description = "Verify selection of elements and logging on Different Elements page")
    public void differentPageAllureTest() {

        //1. Open test site by URL
        //2. Assert Browser title
        actionStep.openDefaultPage();
        assertionStep.checkDefaultPageTitle();

        //3. Perform login
        // 4. Assert Username is logged
        actionStep.performLogin(GetProperties.getProperty("login"),GetProperties.getProperty("password"),GetProperties.getProperty("username"));


        //5. Open through the header menu Service -> Different Elements Page
        actionStep.openDifferentElementsPage();

        //6. Select checkboxes
        //7. Select radio
        //8. Select in dropdown
        actionStep.selectElements();

        //9.1 Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //•	for radio button there is a log row and value is corresponded to the status of radio button
        //•	for dropdown there is a log row and value is corresponded to the selected value
        assertionStep.checkLogsOnThePage();

    }
}
