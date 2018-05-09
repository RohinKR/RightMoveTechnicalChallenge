package propertySearchStepImplmns;

import commonFunctions.FunctionLibrary;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePage;
import pageObjects.PropertyDetailsPage;
import pageObjects.PropertyPage;
import pageObjects.SearchPage;
import utilities.ExcelUtilsRead;
import utilities.ExcelUtilsWrite;
import utilities.FilePaths;

import java.util.List;

public class UserJourneyStepImplmns extends FunctionLibrary {

    HomePage homePage = new HomePage(driver);
    PropertyDetailsPage propertyDetailsPage = new PropertyDetailsPage(driver);
    PropertyPage propertyPage = new PropertyPage(driver);
    SearchPage searchPage = new SearchPage(driver);
    ExcelUtilsWrite excelUtilsWrite = new ExcelUtilsWrite();

    static String UJ_01_ID = "UJ_001";
    static String UJ_02_ID = "UJ_002";
    static String postcode;
    static String searchRadius;
    static String propertyType;
    static String minPriceRange;
    static String maxPriceRange;
    static String minBedrooms;
    static String maxBedrooms;
    static String propertyAddedSince;
    static String sortBy;
    static String propertyText;

    public void i_m_on_home_page() throws Exception{
        driver.get(getproperty("url"));
        implicitwait(5);
        Assert.assertTrue(HomePage.SearchPostcodeTxtFld.isDisplayed());
        takeScreenshot(driver,"UJ_01");
    }

    public void i_provide_postcode()throws  Exception {
        postcode = ExcelUtilsRead.getCellData(1,1);
        type(HomePage.SearchPostcodeTxtFld, postcode);
    }

    public void i_click_for_sale_button()  {
        HomePage.ForSaleBtn.click();
    }

    public void i_select_search_radius() throws Exception {
        implicitwait(5);

        Assert.assertTrue(SearchPage.SearchRadiusSlct.isDisplayed());
        takeScreenshot(driver,"UJ_02");

        searchRadius = ExcelUtilsRead.getCellData(1,2);
        new Select(SearchPage.SearchRadiusSlct).selectByVisibleText(searchRadius);
    }

    public void i_select_price_range_for_sale() throws Exception {
        minPriceRange = ExcelUtilsRead.getCellData(1,4);
        new Select(SearchPage.MinPriceRangeSlct).selectByVisibleText(minPriceRange);

        maxPriceRange = ExcelUtilsRead.getCellData(1,5);
        new Select(SearchPage.MaxPriceRangeSlct).selectByVisibleText(maxPriceRange);
    }

    public void i_select_min_and_max_number_of_bedrooms() throws Exception {
        minBedrooms = ExcelUtilsRead.getCellData(1,6);
        new Select(SearchPage.MinumumBedroomsSlct).selectByVisibleText(minBedrooms);

        maxBedrooms = ExcelUtilsRead.getCellData(1,7);
        new Select(SearchPage.MaximumBedroomSlct).selectByVisibleText(maxBedrooms);
    }

    public void i_select_property_type() throws Exception{
        propertyType = ExcelUtilsRead.getCellData(1,3);
        new Select(SearchPage.PropertyTypeSlct).selectByVisibleText(propertyType);
    }

    public void i_select_property_timeline() throws Exception {
        propertyAddedSince = ExcelUtilsRead.getCellData(1,8);
        new Select(SearchPage.AddedToSiteSlct).selectByVisibleText(propertyAddedSince);
    }

    public void i_click_find_properties() {
        SearchPage.FindPropertiesBtn.click();
    }

    public void i_sort_the_property_list_newest_listed_option() throws Exception{
        implicitwait(10);
        Assert.assertTrue(PropertyPage.SortTypeSlct.isDisplayed());
        takeScreenshot(driver, "UJ_03");

        sortBy = ExcelUtilsRead.getCellData(1,9);
        new Select(PropertyPage.SortTypeSlct).selectByVisibleText(sortBy);
    }

    public void i_click_the_first_non_featured_property() {

        List<WebElement> searchResults = PropertyPage.SearchResults;
        if(searchResults!=null || searchResults.size()>1) {
            for (int i = 1; i < searchResults.size(); i++) {
                WebElement property = driver.findElement(By.xpath("//*[@id=\"l-searchResults\"]/div["+i+"]/div"));
                String className = property.getAttribute("class");
                if (!className.contains("propertyCard--featured")) {
                    WebElement propertyDetail = driver.findElement(By.xpath("//*[@id=\"l-searchResults\"]/div["+i+"]/div/div[1]/div[4]/div[1]/div[2]/a/h2"));
                    propertyText = propertyDetail.getText();
                    propertyDetail.click();
                    return;

                   }
            }
        }
        }

    public void i_should_see_the_appropriate_details() throws Exception{

        implicitwait(5);
        Assert.assertEquals(propertyText, PropertyDetailsPage.PropertyTitle.getText());
        takeScreenshot(driver, "UJ_04");

        String[] testData = {postcode, searchRadius, propertyType, minPriceRange, maxPriceRange
                             , minBedrooms, maxBedrooms, propertyAddedSince, sortBy};
        excelUtilsWrite.writeTestDataInExcel(FilePaths.writetestData, "Sheet1", testData);
    }


    public void i_click_to_rent_button()  {
        HomePage.ToRentBtn.click();
    }

    public void i_select_price_range_to_rent() throws Exception{
        minPriceRange = ExcelUtilsRead.getCellData(2,4);
        new Select(SearchPage.MinPriceRangeSlct).selectByVisibleText(minPriceRange);

        maxPriceRange = ExcelUtilsRead.getCellData(2,5);
        new Select(SearchPage.MaxPriceRangeSlct).selectByVisibleText(maxPriceRange);
    }
}
