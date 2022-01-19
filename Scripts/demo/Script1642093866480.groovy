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

// SSO
//WebUI.navigateToUrl('https://sso.cambiumlearning.com/adfs/ls/wia?SAMLRequest=hVLLbtswEPwVgXeJkiw7NmEbcGMUNZC2Ruz2kEuxIlc1AT5ULlm3%2FfrKcoKkhyYngsOZ2eFglwTW9GKT4snd44+EFLNf1jgS48OKpeCEB9IkHFgkEaU4bD7eibooRR989NIb9kLyugKIMETtHct22xX7Vk8mzc1krtRCTifzBXTQdItWzcpGdbKpQc7baTtrZlNg2VcMNChXbDAa5EQJd44iuDhAZV3nZZVX82NdiqoU9c0Dy7bDb7SDOKpOMfYkOCfyhQTb6mQNQnDafS+ktxxUR9wQZ9nmKeStd5QshgOGn1ril%2Fu7Z5s+YCFJF08ekP8ZbUjb3uBY3qnn5%2FOZW6+SweJyvcCcrmedg6QRfUyTU8+y%2FWOl77RTg+vrbbZXEokPx+M+338+HNl6efEWYzth%2FUbYJX9JXl5X4dMwZrfde6Pl7+y9Dxbi%2F1NURTUiWuXdSBXJUY9SdxrV0KQx%2FnwbECKuWAwJGV9fh%2F67cuu%2F&RelayState=https%3A%2F%2Fpre.csi.learninga-z.com%2Findex.php%3Fmodule%3DCSILogin%26sso%3Dauto&SigAlg=http%3A%2F%2Fwww.w3.org%2F2001%2F04%2Fxmldsig-more%23rsa-sha256&Signature=hDcPbMOtMpbtolsbbN5FrpzdBIH76PMzOKnuAZ3yAD9sfn7apFazRfS0uvQpm6ioy1UqyaMeGQXDtbAla5RRKmqWt7b4jAPik+i1xKDChfdQllIWzleNOWRh45KyXVE1BgI0K0cFwJCc96Hohrhyluo8MYuTzyb3oHetm7gI%2Ft0hfdwMqeT7r63tou001Js+69V+SLV%2FeXIvbunI6axgCU5tQGVIHuhul4DP6OtBiXQm%2FReeN+jxQR9A1uEdnhGGGRrs1Z3A7qkk5m6SQFfd6gVx43KIGk4qNHnO6YQ5shRN8QuSLFJzRTOmUGlMnSP599dGUXpLzoiBAUuKNPPvBw%3D%3D&client-request-id=34d8a8c3-c431-4778-c818-0180010000d4&pullStatus=0&deviceAuthenticationMethod=TlsHandler')
//WebUI.navigateToUrl('pre.csi.learninga-z.com')
WebUI.navigateToUrl('https://pre.raz-kids.com/')


String var1 = "TEST3"

//CustomKeywords.'com.laz.utilities.utils.AddProductstoCart'(var1)

//CustomKeywords.'com.laz.utilities.WriteExcel.updateUsername'(var1)
CustomKeywords.'com.laz.utilities.WriteExcel.updateUsername'(var1)