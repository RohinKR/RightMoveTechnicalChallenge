package commonFunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.FilePaths;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FunctionLibrary {

    public static WebDriver driver;


    public static String getproperty(String key) throws IOException {

        FileInputStream fis = new FileInputStream(new File(FilePaths.configfile));
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }

    public static void takeScreenshot(WebDriver driver, String screenName) throws Exception
    {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(FilePaths.testResultScreens + screenName);
        FileUtils.copyFile(srcFile,destFile);



    }

    public static void type(WebElement element, String value){
        element.sendKeys(value);
    }

    public static String gettitle(){
        return driver.getTitle();
    }

    // Implicit wait:
    public static  void implicitwait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Explicit wait:
    public static void waitUntilElementVisible(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void openBrowser() throws Exception{
        String browser = getproperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",FilePaths.chromedriver);
            driver=new ChromeDriver();
            implicitwait(30);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",FilePaths.iedriver);
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", FilePaths.geckodriver);
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }else{
            System.out.println("Plz enter correct browser name");
        }

    }

    public static void closeBrowser(){
        driver.quit();
    }



}
