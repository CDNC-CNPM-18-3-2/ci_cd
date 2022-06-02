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

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=price')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.doubleClick(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'))

WebUI.doubleClick(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=5')

WebUI.sendKeys(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/div_Try a few others activitytyperecreation_74052c'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=1')

WebUI.sendKeys(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.doubleClick(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=0.0')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=9.0')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/input'), 'activity?price=5.0')

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.click(findTestObject('Object Repository/Record-playback/Test case 4/Page_Bored API/button_Submit'))

WebUI.closeBrowser()

