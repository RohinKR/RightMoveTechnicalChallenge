package pageObjects;

import commonFunctions.FunctionLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PropertyDetailsPage extends FunctionLibrary {

    @FindBy(xpath="//*[@id=\"primaryContent\"]/div[1]/div/div/div[2]/div/h1")
    public static WebElement PropertyTitle;

    public PropertyDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
