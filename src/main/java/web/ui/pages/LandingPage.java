package web.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(id = "postcode")
    protected WebElement inputPostCode;

    @FindBy(xpath = "//button[@type='submit']/span[text()='Find restaurants']")
    protected WebElement buttonFindRestaurants;

    @FindBy(xpath = "//div[@class='errorMessage']")
    protected WebElement errorMessage;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInputPostCode() {
        return inputPostCode;
    }

    public WebElement getButtonFindRestaurants() {
        return buttonFindRestaurants;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public boolean pageLoaded() {
        return isPageLoaded(inputPostCode,buttonFindRestaurants);
    }

    public SearchResultsPage findRestaurant(String postcode) {
        getInputPostCode().sendKeys(postcode);
        getButtonFindRestaurants().click();
        return new SearchResultsPage(driver);
    }

    public LandingPage enterPostcode(String postcode) {
        getInputPostCode().sendKeys(postcode);
        return this;
    }

    public SearchResultsPage findRestaurants(){
        getButtonFindRestaurants().click();
        return new SearchResultsPage(driver);
    }
}
