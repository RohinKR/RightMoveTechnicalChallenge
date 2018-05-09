$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/userJourney.feature");
formatter.feature({
  "line": 1,
  "name": "As a user",
  "description": "       I should get appropriate properties for buy or rent",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10735400043,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "validate property deatils of newest listed non-featured property for sale",
  "description": "",
  "id": "as-a-user;validate-property-deatils-of-newest-listed-non-featured-property-for-sale",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@userJourney"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I\u0027m on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I provide postcode",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click for sale button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select search radius",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select price range for sale",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select min and max number of bedrooms",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select property type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select property timeline",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click find properties",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I sort the property list newest listed option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the first non - featured property",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the appropriate details",
  "keyword": "Then "
});
formatter.match({
  "location": "UserJourneyStepDefs.i_m_on_home_page()"
});
formatter.result({
  "duration": 23376902135,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_provide_postcode()"
});
formatter.result({
  "duration": 166991550,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_for_sale_button()"
});
formatter.result({
  "duration": 2975651746,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_search_radius()"
});
formatter.result({
  "duration": 715470099,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_price_range_for_sale()"
});
formatter.result({
  "duration": 284866094,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_min_and_max_number_of_bedrooms()"
});
formatter.result({
  "duration": 337475081,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_property_type()"
});
formatter.result({
  "duration": 202284053,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_property_timeline()"
});
formatter.result({
  "duration": 140248310,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_find_properties()"
});
formatter.result({
  "duration": 7056121017,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_sort_the_property_list_newest_listed_option()"
});
formatter.result({
  "duration": 1330123568,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_the_first_non_featured_property()"
});
formatter.result({
  "duration": 20556579,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_should_see_the_appropriate_details()"
});
formatter.result({
  "duration": 9006754180,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"primaryContent\"]/div[1]/div/div/div[2]/div/h1\"}\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-UE64V3T\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\rohin\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.139, webStorageEnabled: true}\nSession ID: d5735b8103d652e3df1f934eeac8f739\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"primaryContent\"]/div[1]/div/div/div[2]/div/h1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\r\n\tat propertySearchStepImplmns.UserJourneyStepImplmns.i_should_see_the_appropriate_details(UserJourneyStepImplmns.java:124)\r\n\tat propertySearchStepDefs.UserJourneyStepDefs.i_should_see_the_appropriate_details(UserJourneyStepDefs.java:70)\r\n\tat ✽.Then I should see the appropriate details(src/test/features/userJourney.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 5239395285,
  "status": "passed"
});
formatter.before({
  "duration": 7935808306,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "validate property deatils of newest listed non-featured property to rent",
  "description": "",
  "id": "as-a-user;validate-property-deatils-of-newest-listed-non-featured-property-to-rent",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@userJourney"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I\u0027m on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I provide postcode",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I click to rent button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select search radius",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select price range to rent",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select min and max number of bedrooms",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select property type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select property timeline",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click find properties",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I sort the property list newest listed option",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click the first non - featured property",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see the appropriate details",
  "keyword": "Then "
});
formatter.match({
  "location": "UserJourneyStepDefs.i_m_on_home_page()"
});
formatter.result({
  "duration": 4529179351,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_provide_postcode()"
});
formatter.result({
  "duration": 155374917,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_to_rent_button()"
});
formatter.result({
  "duration": 1780873936,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_search_radius()"
});
formatter.result({
  "duration": 636419107,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_price_range_to_rent()"
});
formatter.result({
  "duration": 285335427,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_min_and_max_number_of_bedrooms()"
});
formatter.result({
  "duration": 339693233,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_property_type()"
});
formatter.result({
  "duration": 159412311,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_select_property_timeline()"
});
formatter.result({
  "duration": 130731594,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_find_properties()"
});
formatter.result({
  "duration": 6389553563,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_sort_the_property_list_newest_listed_option()"
});
formatter.result({
  "duration": 786963956,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_click_the_first_non_featured_property()"
});
formatter.result({
  "duration": 23746295,
  "status": "passed"
});
formatter.match({
  "location": "UserJourneyStepDefs.i_should_see_the_appropriate_details()"
});
formatter.result({
  "duration": 5081815584,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"primaryContent\"]/div[1]/div/div/div[2]/div/h1\"}\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-UE64V3T\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\rohin\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.139, webStorageEnabled: true}\nSession ID: ec0a0679e35d09c05584a5a803ef1a6a\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"primaryContent\"]/div[1]/div/div/div[2]/div/h1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\r\n\tat propertySearchStepImplmns.UserJourneyStepImplmns.i_should_see_the_appropriate_details(UserJourneyStepImplmns.java:124)\r\n\tat propertySearchStepDefs.UserJourneyStepDefs.i_should_see_the_appropriate_details(UserJourneyStepDefs.java:70)\r\n\tat ✽.Then I should see the appropriate details(src/test/features/userJourney.feature:34)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1009314692,
  "status": "passed"
});
});