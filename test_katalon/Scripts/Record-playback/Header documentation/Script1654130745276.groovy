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

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/div_Bored API About Documentation Contributing'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Documentation'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/p_GET'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/button_V1'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Random'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Key'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Type'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Participants'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Price'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Price Range'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Accessibility'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Accessibility Range'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 8/Page_Bored API/a_Accessibility Range'))

WebUI.closeBrowser()
