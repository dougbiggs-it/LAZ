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

  Assumptions: User is ready to checkout.
  Dependencies:
  Reusables: tc02_AddTeacherCheckOut
  Author:	Doug Biggs
  Date Created:	01-13-2022
  Date Updated: 
  
 This script does the following:
 
 1. Calls loginRazPlus()
 2. Loads data: loadRazPlusPrices'()
 3. Navigates to cart
 4. Adds 2 of each classroom
 5. Call checkout: razplus/tc02_AddTeacherCheckOut  (this will generate an email)
 
  Notes:
   
*/

WebUI.disableSmartWait()

// Call method from Keywords/reusables/data.groovy to load Unit prices (Prices_2021) from datasheet (See Data Files)
CustomKeywords.'com.laz.utilities.data.loadRazPlusPrices'()

// Call method from Keywords/reusables/utils.groovy
CustomKeywords.'com.laz.utilities.utils.loginRazPlus'()

// Click Order Now
WebUI.click(findTestObject('Object Repository/Page_Raz-Kids/btn_OrderNow'))

// Click Continue to cart
WebUI.click(findTestObject('Page_Learning A-Z Ordering - Welcome/btn_ContinueToCart'))

// Load Unit prices from datasheet (See KEYWORDS > global > data.groovy file)
// Started at i=2 because Raz-Kids is row 1 in the data file and is the default on the shopping cart page, so no need to add it
def i = 2
for (i; i<=9; i++) {
	
	//System.out.println('ProdID: ' +findTestData('Prices_2021').getValue('ProdID', i))
	prodID = findTestData('Prices_2021').getValue('ProdID', i)
			
	// 1. add all products to the cart
	// Note:  This is *NOT* the same call as: "global.data.loadRazPlusPrices()"
	CustomKeywords.'com.laz.utilities.utils.AddProductstoCart'(prodID)

}

// Increase # of Classrooms to 2
def counter = 1
for (counter; counter<=9; counter++) {
	
	// Reload ProdID from datasheet
	prodID = findTestData('Prices_2021').getValue('ProdID', counter)
	
	def txt_AddClassroomCount = findTestObject('Object Repository/Page_Learning A-Z Ordering - Cart/input_ClassroomCount_' +prodID)
	
	WebUI.clearText(txt_AddClassroomCount)
	WebUI.sendKeys(txt_AddClassroomCount, "2")
	Thread.sleep(1000)
	
}

// Call Checkout script
WebUI.callTestCase(findTestCase('razplus/tc02_AddTeacherCheckOut'), [:], FailureHandling.STOP_ON_FAILURE)



