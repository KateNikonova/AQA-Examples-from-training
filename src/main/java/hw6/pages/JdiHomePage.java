package hw6.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Icon;
import hw6.forms.LogInForm;
import hw6.entities.User;

public class JdiHomePage extends WebPage {

    @FindBy(id = "user-name")
    public Label userName;

    @FindBy(id = "user-icon")
    public Icon userIcon;

    @UI(".uui-navigation.nav.navbar-nav.m-l8")
    public Menu headerMenu;

    @Url("/metals-colors.html")
    public MetalAndColorsPage metalAndColorsPage;

    public LogInForm logInForm;

    public void login(User user) {
        userIcon.click();
        logInForm.login(user);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void checkUserLoggedIn(User user) {
        userName.is()
                .text(user.getFullName());
    }

    public void openMetalAndColorsPage() {
        headerMenu.select("Metals & Colors");
        metalAndColorsPage.checkOpened();
    }

}
