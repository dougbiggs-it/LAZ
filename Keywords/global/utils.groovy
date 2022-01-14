package global

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class utils {

	@Keyword (keywordObject = "Browser")
	def loginRazPlus() {
		// enter your code here
		// you can use either Groovy or Java

		WebUI.disableSmartWait()

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://pre.raz-kids.com/')

	}

	// timestamp
	@Keyword (keywordObject = "Browser")
	def String ts() {

		def dt = new Date()
		String t = dt.format('MMddHHmmss')

		return t

	}

	//---------------------------------------------------------------------------------------
	@Keyword (keywordObject = "Browser")
	def AddProductstoCart(String suffix) {

				
		// Concat the button name prefix w/ suffix
		def btn_AddToCart = findTestObject('Page_Learning A-Z Ordering - Cart/button_Add to Cart_' +suffix)
		//def txt_AddClassrooms = findTestObject('Page_Learning A-Z Ordering - Cart/txt_NumberOfClassrooms_' +suffix)

		// Add product
		WebUI.click(btn_AddToCart)

		// Increase # of Classrooms to 2
		//WebUI.clearText(txt_AddClassrooms)
		//WebUI.sendKeys(txt_AddClassrooms, "5")
		Thread.sleep(1000)


	}

	//---------------------------------------------------------------------------------------
 



	}

	