package utilities;

import java.io.File;

public class FilePaths {

    public static final String geckodriver = new File("src/main/resources/browserExes/geckodriver.exe").getAbsolutePath();
    public static final String chromedriver = new File("src/main/resources/browserExes/chromedriver.exe").getAbsolutePath();
    public static final String iedriver = new File("src/main/resources/browserExes/IEDriverServer.exe").getAbsolutePath();
    public static final String configfile = new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static final String writetestData = new File("src/main/resources/testData/recordTestData.xlsx").getAbsolutePath();
    public static final String readtestData = new File("src/main/resources/testData/prepareTestData.xlsx").getAbsolutePath();
    public static final String testResultScreens = new File("src/main/resources/testResultScreens/").getAbsolutePath();


}
