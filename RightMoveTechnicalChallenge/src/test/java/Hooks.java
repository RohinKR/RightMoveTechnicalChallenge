import commonFunctions.FunctionLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ExcelUtilsRead;
import utilities.FilePaths;

public class Hooks {

    FunctionLibrary functionLibrary = new FunctionLibrary();

    @Before
    public void beforeTest() throws Exception
    {
        functionLibrary.openBrowser();
        ExcelUtilsRead.setExcelFile(FilePaths.readtestData, "Sheet1");
    }

    @After
    public void afterTest()
    {
        functionLibrary.closeBrowser();
    }
}
