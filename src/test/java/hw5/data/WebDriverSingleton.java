package hw5.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;


public class WebDriverSingleton {


        private static WebDriver driver;

        private WebDriverSingleton() {
        }

        public static WebDriver getDriver() {
            if (Objects.isNull(driver)) {
//                System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
            return driver;
        }

        public static void closeDriver() {
            driver.close();
            driver = null;
        }
}
