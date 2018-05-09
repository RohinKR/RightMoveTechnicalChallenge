package pageObjects;

import commonFunctions.FunctionLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PropertyPage extends FunctionLibrary {

    @FindBy(id="sortType")
    public static WebElement SortTypeSlct;

    @FindBy(id="l-searchResults")
    public static List<WebElement> SearchResults;

    public PropertyPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
