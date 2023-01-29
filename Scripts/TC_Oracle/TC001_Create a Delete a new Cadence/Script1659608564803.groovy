import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OR Salesloft/input_Next_useremail'), GlobalVariable.USERNAME)

WebUI.click(findTestObject('Object Repository/OR Salesloft/button_Next'))

WebUI.setText(findTestObject('Object Repository/OR Salesloft/input_Forgot Password_userpassword'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/OR Salesloft/button_Sign In'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Close CRM Disconnected'))

WebUI.navigateToUrl('https://accounts.salesloft.com/sign_in')

WebUI.click(findTestObject('Object Repository/OR Salesloft/Close Email Connection Lost'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Click_Cadence'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Close CRM Disconnected 1'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Close Email Connection Lost 1'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/span_Create Cadence 1'))

WebUI.setText(findTestObject('Object Repository/OR Salesloft/input_Cadence Name_name'), 'Test Cadence')

WebUI.click(findTestObject('Object Repository/OR Salesloft/input_Daily People Target'))

WebUI.setText(findTestObject('Object Repository/OR Salesloft/input_Daily People Target'), Keys.chord(Keys.BACK_SPACE, '100'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Include an opt-out'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Click cadence fun'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/div_Inbound'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Click Preopirt'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/div_Medium'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Person Bounce'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/div_Working'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Person Working'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/div_Working'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/Person Working'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/div_Working'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/CheckBox1'))

WebUI.setText(findTestObject('Object Repository/OR Salesloft/input_External Identifier_external_identifier'), 'Test Katalon')

WebUI.click(findTestObject('Object Repository/OR Salesloft/span_Create Cadence 2'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Salesloft/div_Cadence Created'), 'Cadence Created')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('OR Salesloft/Navigate to Cadence'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/OR Salesloft/svg'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/li_Delete Cadence'))

WebUI.click(findTestObject('Object Repository/OR Salesloft/span_Delete Cadence'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Salesloft/div_Cadence Deleted'), 'Cadence Deleted')

WebUI.closeBrowser()

