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

/*
WebUI.disableSmartWait()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pre.raz-kids.com/')
*/

CustomKeywords.'global.utils.loginRazPlus'()


// Objects
btn_ordernow = findTestObject('Object Repository/Page_Raz-Kids/btn_OrderNow')
btn_ContinueToCart = findTestObject('Object Repository/Page_Learning A-Z Ordering - Welcome/btn_ContinueToCart')
btn_checkout = findTestObject('Object Repository/Page_Learning A-Z Ordering - Cart/btn_Checkout')
btn_userdetails = findTestObject('Page_Learning A-Z Ordering -/btn_UserDetails')
btn_paymentinfo = findTestObject('Page_Learning A-Z Ordering -/btn_PaymentInfo')
btn_generateQuote = findTestObject('Object Repository/Page_Learning A-Z Ordering -/btn_generateQuote')


dd_occupation = findTestObject('Page_Learning A-Z Ordering -/sel_occupation')
dd_state = findTestObject('Page_Learning A-Z Ordering -/sel_state')
dd_district = findTestObject('Page_Learning A-Z Ordering -/sel_district')
dd_school = findTestObject('Page_Learning A-Z Ordering -/sel_school')
input_email = findTestObject('Page_Learning A-Z Ordering -/txt_email')
input_firstname = findTestObject('Page_Learning A-Z Ordering -/txt_firstname')
input_lastname = findTestObject('Page_Learning A-Z Ordering -/txt_lastname')
input_addr1 = findTestObject('Page_Learning A-Z Ordering -/txt_addr1')
input_addr2 = findTestObject('Page_Learning A-Z Ordering -/txt_addr2')
input_city = findTestObject('Page_Learning A-Z Ordering -/txt_city')
input_zipcode = findTestObject('Page_Learning A-Z Ordering -/txt_zipcode')
input_phone = findTestObject('Page_Learning A-Z Ordering -/txt_phone')
input_username = findTestObject('Page_Learning A-Z Ordering -/txt_username')
input_password = findTestObject('Page_Learning A-Z Ordering -/input_password')
input_retypepassword = findTestObject('Page_Learning A-Z Ordering -/input_retypePassword')
input_confirmation = findTestObject('Page_Learning A-Z Ordering -/chkbx_iUnderstand')
radio_orgtype = findTestObject('Page_Learning A-Z Ordering -/radio_OrgTypePrivate')
radio_checkmoneyorder = findTestObject('Page_Learning A-Z Ordering -/radio_CheckMoneyOrderMail-in')


// contact details
def str_email = 'douglas.biggs@learninga-z.com'
def str_fn = 'AutomationFN'
def str_ln = 'AutomationLN'
def str_addr1 = '6300 NE 1st Ave.'
def str_addr2 = 'Suite 203'
def str_city = 'Fort Lauderdale'
def str_zipcode = '33334'
def str_phone = '9545551212'
// Additional User Details
def str_occupation = '39'
def str_username = 'Automation_User'
def str_state = '31'
def str_district = '00679974'
def str_school = '00681599'
def encryptedpassword = 'AHzSUGJgRo0dvnkyA0znMQ=='

// Order now button
WebUI.click(btn_ordernow)
// Continue to Cart button
WebUI.click(btn_ContinueToCart)
// Checkout button
WebUI.click(btn_checkout)
// Email
WebUI.setText(input_email, str_email)
// First name
WebUI.setText(input_firstname, str_fn)
// Last name
WebUI.setText(input_lastname, str_ln)
// Address 1
WebUI.setText(input_addr1, str_addr1)
// Address 2
WebUI.setText(input_addr2, str_addr2)
// City
WebUI.setText(input_city, str_city)
// Zip code
WebUI.setText(input_zipcode, str_zipcode)
// Phone
WebUI.setText(input_phone, str_phone)

//
// Additional User Details button
//
WebUI.click(btn_userdetails)
// Occupation
WebUI.selectOptionByValue(dd_occupation, str_occupation, true)

// Organization type (public/private)
WebUI.click(radio_orgtype)
// State
WebUI.selectOptionByValue(dd_state, str_state, true)
// District
WebUI.selectOptionByValue(dd_district, str_district, true)
// School
WebUI.selectOptionByValue(dd_school, str_school, true)

// Create User Login
// Username
WebUI.setText(input_username, str_username)
// Password == Welcome1!
WebUI.setEncryptedText(input_password, encryptedpassword)
// Re-enter Password == Welcome1!
WebUI.setEncryptedText(input_retypepassword, encryptedpassword)
// Payment Info
WebUI.click(btn_paymentinfo)

//
// Payment method
//
WebUI.click(radio_checkmoneyorder)

// Confirm I understand
WebUI.click(input_confirmation)


// Generate Quote
//WebUI.click(btn_generateQuote)


