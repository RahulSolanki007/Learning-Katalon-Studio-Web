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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'rahul_solanki11@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Mr_uniform-id_gender1'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Rahul')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Solanki')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'yZMD4ws8T568MaSTttenLA==')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Baner road')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Pune')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'danbary')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_State Connecticut-AlabamaAlaskaArizonaArk_e03acf'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__city'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '1234 5657')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '234667')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

