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

WebUI.disableSmartWait()

/*
  This section does the following:
  1. Put the entire order summary into a String variable --> str = WebUI.getText()
  2. Read the string into array parsed/split by "$"
  3. Assign each element to a variable
  4. Print the variables
 */

/*
// Load Unit prices from datasheet (See Data Files)
def RazKidsUnit = findTestData('Prices_2021').getValue('UnitPrice', 1)
def RazPlusUnit = findTestData('Prices_2021').getValue('UnitPrice', 2)
def ReadingAZUnit = findTestData('Prices_2021').getValue('UnitPrice', 3)
def HeadsproutUnit = findTestData('Prices_2021').getValue('UnitPrice', 4)
def ScienceAZUnit = findTestData('Prices_2021').getValue('UnitPrice', 5)
def WritingAZUnit = findTestData('Prices_2021').getValue('UnitPrice', 6)
def VocabularyAZUnit = findTestData('Prices_2021').getValue('UnitPrice', 7)
def ELLEditionUnit = findTestData('Prices_2021').getValue('UnitPrice', 8)
def ConnectedClassroomUnit = findTestData('Prices_2021').getValue('UnitPrice', 9)
*/

// Call method from Keywords/reusables/data.groovy to load Unit prices (Prices_2021) from datasheet (See Data Files)
CustomKeywords.'global.data.loadRazPlusPrices'()

//WebUI.openBrowser('')

//WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://pre.raz-kids.com/')

// Call method from Keywords/reusables/utils.groovy
CustomKeywords.'global.utils.loginRazPlus'()

// Click Order Now
WebUI.click(findTestObject('Object Repository/Page_Raz-Kids/btn_OrderNow'))

// Click Continue to cart
WebUI.click(findTestObject('Page_Learning A-Z Ordering - Welcome/btn_ContinueToCart'))

/*
1. add a course
2. get order summary
3. compare price to sheet
4. remove course
5. get next course
*/

// Load Unit prices from datasheet (See KEYWORDS > global > data.groovy file)
// Started at i=2 because Raz-Kids is row 1 in the data file and is the default on the shopping cart page, so no need to add it
def i = 2
for (i; i<=9; i++) {
	
	System.out.println('ProdID: ' +findTestData('Prices_2021').getValue('ProdID', i))
	System.out.println('Unit Price: ' +findTestData('Prices_2021').getValue('UnitPrice', i))
	
	prodID = findTestData('Prices_2021').getValue('ProdID', i)
	ExpectedUnit = findTestData('Prices_2021').getValue('UnitPrice', i)
	
	Thread.sleep(2000)
	
	// 1. add a product to the cart
	AddProducttoCart(prodID, ExpectedUnit)
}



def AddProducttoCart(String suffix, def ExpectedVal) {
	
	// Concat the button name prefix w/ suffix
	def btn_AddToCart = findTestObject('Page_Learning A-Z Ordering - Cart/button_Add to Cart_' +suffix)
	def txt_AddClassrooms = findTestObject('Page_Learning A-Z Ordering - Cart/txt_NumberOfClassrooms_' +suffix)

	// Add product
	WebUI.click(btn_AddToCart)
	
	// Increase # of Classrooms to 2
	WebUI.clearText(txt_AddClassrooms)
	WebUI.sendKeys(txt_AddClassrooms, "2")
	Thread.sleep(2000)
		
	
		
	// 2. Put the entire Order Summary into a variable
	def String str = WebUI.getText(findTestObject('Page_Learning A-Z Ordering - Cart/OrderSummary'))
	
	
	// Put string into array and parse it
	def String[] s = str.split("\\\$")
	
	// Print str
	System.out.println('  STR: ' +str)
	
		//Raz-Plus is required for each add-on license. We have increased the number of Raz-Plus licenses required for your desired quantity of add-on licenses.
		
		// *** When RazPlus is added to the Order (in this case Raz-Kids) it will always be on the 1st row, so the indexes will be (s.size() - 5) and (s.size()-6)
		// *** Counting backwards from the last index value because we know for sure that the last 2 indexes are sub-total and grand-total
		// **  
		// *** When a products classrooms are updated, the product will move to row 1.  for EE and CC the product will move to row 2 but it is 
		// *** still indexes (s.size() - 5) and (s.size()-6) because we are counting down from the maximum.
		// **
		def actual_product_unitprice = Double.parseDouble(s[s.size()-6].substring(0, 6))
		def actual_product_total = Double.parseDouble(s[s.size()-5].substring(0, 6))
		
		// RazKids total will always be s.size()-3 when a product is added
		def actual_RazKids_total = Double.parseDouble(s[s.size()-3].substring(0, 6))
		// Last 2 elements of the array will always be sub-total and grand-total
		def subtotal = Double.parseDouble(s[s.size()-2].substring(0, 6))
		def grandtotal = Double.parseDouble(s[s.size()-1].substring(0, 6))
		
		// Convert Expected value to a double for comparison purposes
		ExpectedVal = Double.parseDouble(ExpectedVal)
		
		
		// 3. Compare the unit price vs the datasheet
		// Put an If statement here to report that the "ACTUAL" unit price is/isNot equal to the "EXPECTED" unit price
		if (WebUI.verifyEqual(actual_product_unitprice, ExpectedVal, FailureHandling.CONTINUE_ON_FAILURE)) {
			System.out.println('  UNIT PRICE TRUE: ' +suffix)
		} else {
			System.out.println('  UNIT PRICE FALSE: ' +suffix)
		}
		
		// Visual cue: print the variables
		System.out.println('product_unitprice: ' +suffix +'  ' +actual_product_unitprice)
		System.out.println('product_total: ' +suffix +'  '  +actual_product_total)
		System.out.println('subtotal: ' +suffix +'  '  +subtotal)
		System.out.println('grandtotal: ' +suffix +'  '  +grandtotal)
		
		// Compare that the (unit TOTAL) == (product total price)
		if (WebUI.verifyEqual(actual_product_total, (ExpectedVal * 2), FailureHandling.CONTINUE_ON_FAILURE)) {
			System.out.println('  TOTAL PRICE TRUE: ' +suffix)
		} else {
			System.out.println('  TOTAL PRICE FALSE: ' +suffix)
		}
		
	
		// Add all of the product total prices to get subtotal and grand total != CC and EE
		// Suffix RpIncluded and RpNotIncluded is to differentiate when Raz-Plus is added to the order (mandatory).  
		// I had to move the indexes to capture the correct totals and wanted to distinguish between the two variable names
		//
		if (suffix == 'RP' || suffix == 'RP' || suffix == 'RAZ' || suffix == 'HS' || suffix == 'SAZ' || suffix == 'WAZ' || suffix == 'VAZ') {
			
			def calculated_subtotal_RpNotIncluded = actual_RazKids_total + actual_product_total 
			System.out.println('  calculated_subtotal(7): ' +calculated_subtotal_RpNotIncluded)
			WebUI.verifyEqual(calculated_subtotal_RpNotIncluded, subtotal, FailureHandling.CONTINUE_ON_FAILURE)
			
		}else if (suffix == 'CC' || suffix == 'EE') {
			
			// Had to include RazPlus, RazKids and the product in this calculation 
			def actual_RazPlus_total = Double.parseDouble(s[s.size()-7].substring(0, 6))
			
			def actual_product_total_RpIncluded = Double.parseDouble(s[s.size()-5].substring(0, 6))
			def calculated_subtotal_RpIncluded = actual_RazKids_total + actual_product_total_RpIncluded + actual_RazPlus_total
			System.out.println('  calculated_subtotal(2): ' +calculated_subtotal_RpIncluded)
			
			WebUI.verifyEqual(calculated_subtotal_RpIncluded, subtotal, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		// Add a combination of products to the cart -- Maybe another script can handle this test

	// 4. Remove course(s) from cart
	WebUI.click(btn_AddToCart)

	// Raz-Plus is always added to the Order when ordering Connected Classroom and Ell Edition, so we needed to close Raz-Plus here
	if (suffix == 'CC' || suffix == 'EE') {

		//WebUI.click(findTestObject('Object Repository/tc05/Page_Learning A-Z Ordering - Cart/button_Add to Cart_RP'))
		WebUI.click(findTestObject('Object Repository/Page_Learning A-Z Ordering - Cart/button_Add to Cart_RP'))
		
		
	}

	
}

// added this line to trigger in jenkins
// added this line to trigger in jenkins
// added this line to trigger in jenkins 12/13/21 2:03pm
// added this line to trigger in jenkins 12/13/21 2:56pm
// added this line to trigger in jenkins 12/15/21 10:10am
// added this line to trigger in jenkins 12/15/21 12:45pm

WebUI.closeBrowser()

