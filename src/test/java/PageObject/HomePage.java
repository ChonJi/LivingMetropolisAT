package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.testng.AssertJUnit;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement header = $("p");
    private SelenideElement resetButton = $("input[value='reset']");
    private SelenideElement submitButton = $("input[value='>>>']");
    private SelenideElement actionField = $("input[name='action']");
    private SelenideElement targetField = $("input[name='target']");
    private SelenideElement optionField = $("input[name='aux']");

    /**
     * Checks header
     */
    public void checkHeader(String headerText) {
        AssertJUnit.assertEquals(header.getText(), headerText);
    }

    /**
     * Checks if Reset Button is displayed
     * @return true if displayed
     */
    public boolean isReserButtonDisplayed() {
        return resetButton.isDisplayed();
    }

    /**
     * Checks if Submit Button is displayed
     * @return true if displayed
     */
    public boolean isSubmitButtonDisplayed() {
        return submitButton.isDisplayed();
    }

    /**
     * Checks if Action Field is displayed
     * @return true if displayed
     */
    public boolean isActionFieldDisplayed() { return actionField.isDisplayed(); }

    /**
     * Checks if Target Field is displayed
     * @return true if displayed
     */
    public boolean isTargetFieldDisplayed() { return targetField.isDisplayed(); }

    /**
     * Checks if Option Field is displayed
     * @return true if displayed
     */
    public boolean isOptionFieldDisplayed() { return optionField.isDisplayed(); }

}
