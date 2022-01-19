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

public class data {

	@Keyword (keywordObject = "datafile")
	def loadRazPlusPrices() {

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


	}
}
