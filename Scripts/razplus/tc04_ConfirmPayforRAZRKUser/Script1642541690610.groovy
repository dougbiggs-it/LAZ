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
 
   Assumptions: User has checked out.
   Dependencies: tc03_TeacherClassroomSetup
   Author:	Doug Biggs
   Date Created:	01-18-2022
   Date Updated:
   
  This script does the following:
  
  1. Logs into: pre.csi.learninga-z.com
  2. Gets AutoUser from datasheet: Usernames
  2. Searches for user from datafile
  3. Changes the "Is Test" field to "YES"
  4. Views the bills
  5. Pays the outstanding P.O. for the new user
  
   Notes:
	
 */




WebUI.openBrowser('')
WebUI.maximizeWindow()




// DUO Authentication
//WebUI.navigateToUrl('https://sso.cambiumlearning.com/adfs/ls/wia?SAMLRequest=hVLbTgIxFPyVTd93y1aXSwMkCDGSeCGAPvhiSvesNOll7WlF%2FXqXRSI+qE9NpzNzppMzRGF0zScxbO0SXiJgSN6MtsjbhxGJ3nInUCG3wgDyIPlqcnPNWdbhtXfBSafJieRvhUAEH5SzJJnPRuRJ5P1e0T+rqp4c9Mqy2uSsJ4sBOx90C5n3WReg2pSSyTOSPIDHRjkijVEjR4wwtxiEDQ3UYSzt5GneX7OcF+e86DySZNb8RlkRWtU2hBo5pYguk8JsVDQahLfKPmfSGSrKCqlGSpLJMeTUWYwG%2FAr8q5Jwv7z+tqk9ZBJVdvQQ6Udrg8rUGtrytjXd7XbUuDJqyPbXPUzxcLJUSGzRrzQp1iRZfFV6oWzZuP7d5uZAQn61Xi%2FSxd1qTcbDvTdv2%2FHjf8IO6Sl5eFiF22bMfLZwWsn35NJ5I8LvKfIsbxFVplVL5dFiDVJVCsqmSa3dbupBBBiR4CMQOj4M%2Fbly408%3D&RelayState=https%3A%2F%2Fpre.csi.learninga-z.com%2Findex.php%3Fmodule%3DCSILogin%26sso%3Dauto&SigAlg=http%3A%2F%2Fwww.w3.org%2F2001%2F04%2Fxmldsig-more%23rsa-sha256&Signature=Q7ff2SUpcw6Jww79Kxs5Id+%2FDBmqXnw8ebRTbfrgtrS+Tr%2FXfsEtvQRh1C%2FSM+Xss0Wyfha0eDvL6fn6tIEQdEy5qQEK%2FROyJbOZhjnM%2FdaYi2YwYyYNhyrxIBMGkHiOiNF+WNeM28wDUxnAioz3MB7sHYWBW6oJxxXHf7O0TkrbK5czmwRR1cDJ3UIsY8FZOuXjattBtvc6MSxwEtdZwX4KntP7w7bcf4xQdt9w+MNc58BvN4bb3p6eHjlfPrlQmhyH1Ah5+DyLP%2Fz5%2FLEinbTFwPRVQe44CePl05myiT18uvzhGJDLAjVj3iHvJVopXm+s5lTZQkOU43KG6urlJg%3D%3D&client-request-id=5ece24b2-7e62-4985-2235-0080010000bd&pullStatus=0&deviceAuthenticationMethod=TlsHandler')
WebUI.navigateToUrl('pre.csi.learninga-z.com')

Thread.sleep(15000)

// #24 Search for user -- Get AutoUser from datasheet: Usernames
WebUI.setText(findTestObject('Object Repository/Page_preprod CSI Welcome to the Administrat_27435e/input_Username or Bill ID_globaltextfield'), findTestData('Usernames').getValue('user', 1))
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Welcome to the Administrat_27435e/button_Search'))

Thread.sleep(20000)




// *** NOT SURE IF WE NEED THESE ***
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/img'))
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/img'))
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/input_Member Information_btn btn-default ng-scope'))



// #26 Change the "Is Test" field to "YES"
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/select_YesNo'), 'boolean:true', true)

// #26 Save Changes
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/button_Save Changes'))

// #27 Click View Bills
WebUI.click(findTestObject('Object Repository/Page_preprod CSI Learning A-Z Admin/a_View Bills'))

WebUI.click(findTestObject('Object Repository/Page_preprod CSI Viewing Bills/img'))

WebUI.setText(findTestObject('Object Repository/Page_preprod CSI Pay Bill/input_P.O. Number_po_number'), 'PO_autouser')

WebUI.setText(findTestObject('Object Repository/Page_preprod CSI Pay Bill/input_P.O. Amount_po_amount'), '2182.00')

WebUI.rightClick(findTestObject('Object Repository/Page_preprod CSI Pay Bill/input_Email_action'))

