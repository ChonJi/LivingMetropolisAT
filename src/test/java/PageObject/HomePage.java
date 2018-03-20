package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage {

    private SelenideElement header = $("p");
    private SelenideElement resetButton = $("input[value='reset']");
    private SelenideElement submitButton = $("input[value='>>>']");
    private SelenideElement actionField = $("input[name='action']");
    private SelenideElement targetField = $("input[name='target']");
    private SelenideElement optionField = $("input[name='aux']");

    public static HomePage chainHomePageMethods() {
        return new HomePage();
    }

    /**
     * Checks header
     */
    public HomePage checkHeader(String headerText) {
        assertEquals(header.getText(), headerText);
        return this;
    }

    /**
     * Checks if Reset Button is displayed
     *
     * @return true if displayed
     */
    public HomePage isResetButtonDisplayed() {
        assertTrue(resetButton.isDisplayed());
        return this;
    }

    /**
     * Checks if Submit Button is displayed
     *
     * @return true if displayed
     */
    public HomePage isSubmitButtonDisplayed() {
        assertTrue(submitButton.isDisplayed());
        return this;
    }

    /**
     * Checks if Action Field is displayed
     *
     * @return true if displayed
     */
    public HomePage isActionFieldDisplayed() {
        assertTrue(actionField.isDisplayed());
        return this;
    }

    /**
     * Checks if Target Field is displayed
     *
     * @return true if displayed
     */
    public HomePage isTargetFieldDisplayed() {
        assertTrue(targetField.isDisplayed());
        return this;
    }

    /**
     * Checks if Option Field is displayed
     *
     * @return true if displayed
     */
    public HomePage isOptionFieldDisplayed() {
        assertTrue(optionField.isDisplayed());
        return this;
    }

}
