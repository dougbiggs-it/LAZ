package com.laz.utilities

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


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class utils {

	@Keyword (keywordObject = "util")
	def loginRazPlus() {

		// Open browser and navigate to URL

		WebUI.disableSmartWait()

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://pre.raz-kids.com/')

	}



	// Create timestamp to be used as a suffix for unique username
	@Keyword (keywordObject = "util")
	def String ts() {

		def dt = new Date()
		String t = dt.format('MMddHHmmss')

		return t

	}



	@Keyword (keywordObject = "util")
	def AddProductstoCart(String suffix) {

		// Concatenate the button name prefix w/ suffix
		def btn_AddToCart = findTestObject('Page_Learning A-Z Ordering - Cart/button_Add to Cart_' +suffix)

		// Add product
		WebUI.click(btn_AddToCart)

		Thread.sleep(1000)


	}


	//==================

	//==================
















}

