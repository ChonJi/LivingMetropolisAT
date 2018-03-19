package PageObject;

import TemporaryDataProvider.TemporaryDataProvider;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by cm on 2017-12-11.
 */
public class SetUp {

    /**
     * Opens mBank Home Page
     * @return HomePage
     */
    public HomePage openHomePage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        baseUrl = TemporaryDataProvider.baseUrl;
        open(baseUrl);
        assertEquals(url(), baseUrl);
        return new HomePage();
    }
}
