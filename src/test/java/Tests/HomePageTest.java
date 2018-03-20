package Tests;

import PageObject.SetUp;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static PageObject.HomePage.chainHomePageMethods;
import static TemporaryDataProvider.TemporaryDataProvider.headerText;
import static com.codeborne.selenide.Selenide.close;


public class HomePageTest extends SetUp {

    @BeforeClass
    private void setUp() {
        openHomePage();
    }

    @Test
    private void shouldOpenHomePage() {
        chainHomePageMethods().checkHeader(headerText).isResetButtonDisplayed().isSubmitButtonDisplayed().isActionFieldDisplayed().isTargetFieldDisplayed().isOptionFieldDisplayed();
    }


    @AfterClass
    private void tearDown() {
        close();
    }
}

