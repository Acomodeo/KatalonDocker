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

WebUI.navigateToUrl('https://ibe.acomodeo.com')
WebUI.delay(11)

WebUI.setText(findTestObject('Object Repository/Page_Account Login IBE/input_Register_email'), username)
WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Login IBE/input_Register_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Account Login IBE/button_Log in'))
WebUI.delay(11)

WebUI.click(findTestObject('Object Repository/Page_Booking engine for serviced apartments/button_Profile'))
WebUI.delay(2)

String hello = WebUI.getText(findTestObject('Object Repository/Page_Booking engine for serviced apartments/h4_Hello Katalon Acomodeo'))
WebUI.verifyEqual('Hello, Katalon Acomodeo',hello)
WebUI.closeBrowser()