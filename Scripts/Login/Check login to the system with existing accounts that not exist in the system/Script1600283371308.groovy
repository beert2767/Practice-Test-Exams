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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('login/Check login to the system with existing accounts that not exist in the system/Page_Facebook -/input_Facebook _email'), 
    'funfunfuntest2@gmail.com')

WebUI.setEncryptedText(findTestObject('login/Check login to the system with existing accounts that not exist in the system/Page_Facebook -/input_Facebook _pass'), 
    'cl5oP62TD1/NFdczz5EK+w==')

WebUI.click(findTestObject('login/Check login to the system with existing accounts that not exist in the system/Page_Facebook -/button_'))

WebUI.setText(findTestObject('login/Check login to the system with existing accounts that not exist in the system/Page_ Facebook  Facebook/input__email'), 
    'funfunfunrun2@gmail.com')

WebUI.click(findTestObject('login/Check login to the system with existing accounts that not exist in the system/Page_ Facebook  Facebook/button_'))

WebUI.closeBrowser()

