package hw6;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw6.entities.User;
import hw6.pages.JdiHomePage;
import hw6.pages.MetalAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    public static JdiHomePage homePage;

    public static void open() {
        homePage.open();
    }

    public static void login(User user) {
        homePage.login(user);
    }

    public static String getUserName() {
        return homePage.getUserName();
    }

    @Url("/metals-colors.html")
    public static MetalAndColorsPage metalAndColorsPage;

}
