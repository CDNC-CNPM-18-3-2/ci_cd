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

WebUI.navigateToUrl(GlobalVariable.HOST_URL)

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 15/Page_Bored API/a_Bored API_icon-right'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 15/Page_Issues  drewthoennesBored-API  GitHub/a_accessibility range parameter names error'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 15/Page_accessibility range parameter names er_2db1ef/a_previous issue'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 15/Page_Accessibility and Price Questions  Iss_4260d7/span_Open'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 15/Page_Accessibility and Price Questions  Iss_4260d7/svg_Open_octicon octicon-issue-opened'))

WebUI.closeBrowser()

