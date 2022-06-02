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

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/a_Contributing'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/div_Bored API About Documentation Contributing'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/b_Contributing'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/input'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/input'), 'Love your bed')

WebUI.selectOptionByValue(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/select_Education Recreational Social DIY Ch_7c5427'), 
    'relaxation', true)

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/input_1'), '2')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/p_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/p_Reset'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/p_Reset'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/input'), '1111')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 9/Page_Bored API/p_Reset'))

WebUI.closeBrowser()

