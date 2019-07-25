import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TestEveryIBE')

suiteProperties.put('name', 'TestEveryIBE')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Antonio\\Katalon Studio\\TestingIBE\\Reports\\TestEveryIBE\\20190725_105322\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestEveryIBE', suiteProperties, [new TestCaseBinding('Test Cases/audi', 'Test Cases/audi',  null), new TestCaseBinding('Test Cases/baldaja', 'Test Cases/baldaja',  null), new TestCaseBinding('Test Cases/barmer', 'Test Cases/barmer',  null), new TestCaseBinding('Test Cases/bearingpoing', 'Test Cases/bearingpoing',  null), new TestCaseBinding('Test Cases/commerbank', 'Test Cases/commerbank',  null), new TestCaseBinding('Test Cases/covestro', 'Test Cases/covestro',  null), new TestCaseBinding('Test Cases/freshfields', 'Test Cases/freshfields',  null), new TestCaseBinding('Test Cases/goomo', 'Test Cases/goomo',  null), new TestCaseBinding('Test Cases/ibe', 'Test Cases/ibe',  null), new TestCaseBinding('Test Cases/microfuzzy', 'Test Cases/microfuzzy',  null), new TestCaseBinding('Test Cases/roche', 'Test Cases/roche',  null), new TestCaseBinding('Test Cases/roomit', 'Test Cases/roomit',  null), new TestCaseBinding('Test Cases/tmdfirction', 'Test Cases/tmdfirction',  null), new TestCaseBinding('Test Cases/zeb', 'Test Cases/zeb',  null)])
