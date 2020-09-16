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

WebUI.click(findTestObject('register/create_ duplicate_account/Page_Facebook -/a_'))

WebUI.setText(findTestObject('register/create_ duplicate_account/Page_Facebook -/input_ Facebook _firstname'), 
    'testymaster')

WebUI.setText(findTestObject('register/create_ duplicate_account/Page_Facebook -/input_ Facebook _lastname'), 'testytesty')

WebUI.setText(findTestObject('register/create_ duplicate_account/Page_Facebook -/input_ Facebook _reg_email__'), 
    'funfunfuntest123@gmail.com')

WebUI.setText(findTestObject('register/create_ duplicate_account/Page_Facebook -/input_ Facebook _reg_email_confirmation__'), 
    'funfunfuntest123@gmail.com')

WebUI.setEncryptedText(findTestObject('register/create_ duplicate_account/Page_Facebook -/input_ Facebook _reg_passwd__'), 
    'cl5oP62TD1/NFdczz5EK+w==')

WebUI.selectOptionByValue(findTestObject('register/create_ duplicate_account/Page_Facebook -/select_202020192018201720162015201420132012_85bfe4'), 
    '1996', true)

WebUI.click(findTestObject('register/create_ duplicate_account/Page_Facebook -/label_'))

WebUI.click(findTestObject('register/create_ duplicate_account/Page_Facebook -/button_'))

WebUI.closeBrowser()

