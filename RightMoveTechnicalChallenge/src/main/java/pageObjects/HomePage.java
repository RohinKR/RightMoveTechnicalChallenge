package pageObjects;

import commonFunctions.FunctionLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends FunctionLibrary{

    @FindBy(id="searchLocation")
    public static WebElement SearchPostcodeTxtFld;

    @FindBy(id="buy")
    public static WebElement ForSaleBtn;

    @FindBy(id="rent")
    public static WebElement ToRentBtn;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
