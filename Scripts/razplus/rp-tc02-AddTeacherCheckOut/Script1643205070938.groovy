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


//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Date;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.lang.String
/*
  
  Assumptions: User is ready to checkout.
  Dependencies:
  Author:	Doug Biggs
  Date Created:	01-13-2022
  Date Updated: 
   
  This reusable script does the following:
  
  1. Assigns the Objects to variables for clarity
  2. Defines contact details.   *Hard-coded, should probably be in a data file that gets read in*
  3. Provides user (Teacher) information and payment method
  4. Generate a quote.	**Method to call to turn on/off the "Generate Quote" steps**
  5. --> WRITE USERNAME TO DATAFILE (Usernames)
  
  Notes:  Email address should be changed to generic service account that can be monitored
  
 */

// Create a timestamp id for a unique username
id = CustomKeywords.'com.laz.utilities.utils.ts'()

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
def str_username = 'AutoUser' +id
def str_state = '31'
def str_district = '00679974'
def str_school = '00681599'
def encryptedpassword = 'AHzSUGJgRo0dvnkyA0znMQ=='

// Visual cue sent to the console
System.out.println('Username: ' +str_username)


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




// Get the amount owed as String
String strGrandTotalWithTwoOfEveryClassroom = WebUI.getText(findTestObject('Object Repository/Page_Learning A-Z Ordering - Cart/val_GrandTotalWithTwoOfEveryClassroom'))
System.out.println('  strGrandTotalWithTwoOfEveryClassroom (double): ' +strGrandTotalWithTwoOfEveryClassroom)

// Remove the "$"
def temp = strGrandTotalWithTwoOfEveryClassroom.substring(1, strGrandTotalWithTwoOfEveryClassroom.length() - 1)

// Convert to double
def dblGrandTotalWithTwoOfEveryClassroom = Double.parseDouble(temp)




// Display "Amount Owed" from *Pay Bill* screen as a double
System.out.println('  GrandTotalWithTwoOfEveryClassroom (double): ' +dblGrandTotalWithTwoOfEveryClassroom)


// Use this call to turn on/off the "Generate Quote" steps
GenerateQuote()


// *************************************************
// **  	 WRITE USERNAME AND TOTAL TO DATAFILE     **
// *************************************************

CustomKeywords.'com.laz.utilities.WriteExcel.updateUsername'(str_username)
CustomKeywords.'com.laz.utilities.WriteExcel.updateTotal'(dblGrandTotalWithTwoOfEveryClassroom)


def GenerateQuote() {

	def btn_generateQuote = findTestObject('Object Repository/Page_Learning A-Z Ordering -/btn_generateQuote')
	
	// Generate Quote
	WebUI.click(btn_generateQuote)
	
	Thread.sleep(3000)
	// Verify text after Generate Quote was clicked and email was sent
	WebUI.verifyElementText(findTestObject('Object Repository/Page_Learning A-Z Ordering -/h1_Almost Finished'), 'Almost Finished!')
	// verify if element exists
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Learning A-Z Ordering -/h1_Almost Finished'), 30)
	

	
}




