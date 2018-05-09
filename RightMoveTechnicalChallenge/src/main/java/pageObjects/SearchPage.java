package pageObjects;

import commonFunctions.FunctionLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends FunctionLibrary {

    @FindBy(id="radius")
    public static WebElement SearchRadiusSlct;

    @FindBy(id="displayPropertyType")
    public static  WebElement PropertyTypeSlct;

    @FindBy(id="minPrice")
    public static WebElement MinPriceRangeSlct;

    @FindBy(id="maxPrice")
    public static WebElement MaxPriceRangeSlct;

    @FindBy(id="minBedrooms")
    public static WebElement MinumumBedroomsSlct;

    @FindBy(id="maxBedrooms")
    public static WebElement MaximumBedroomSlct;

    @FindBy(id="maxDaysSinceAdded")
    public static WebElement AddedToSiteSlct;

    @FindBy(id="submit")
    public static WebElement FindPropertiesBtn;


    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
