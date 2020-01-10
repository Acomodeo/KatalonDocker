import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://roche.acomodeo.com/en/')
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/button_Log in'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/input_Register_email'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/input_Register_password'), 
    password)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/span_Log in'))
WebUI.delay(8)
WebUI.click(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/button_Profile'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/h4_Hello Katalon Acomodeo'))
String hello = WebUI.getText(findTestObject('Object Repository/katalonIBE/Page_Home  Audi Long Stay/h4_Hello Katalon Acomodeo'))
WebUI.verifyEqual('Hello, Katalon Acomodeo',hello)
WebUI.closeBrowser()

