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

query_key = key

response = WS.sendRequest(findTestObject('API/V2/Activity/Get by option activity', ["key": query_key]))

WS.verifyResponseStatusCode(response, 200)

verify_activity = activity

verify_accessibility = accessibility

verify_type = type

verify_participants = participants

verify_price = price

verify_link = link

verify_key = key

WS.verifyElementPropertyValue(response, 'activity', verify_activity)

WS.verifyElementPropertyValue(response, 'accessibility', verify_accessibility)

WS.verifyElementPropertyValue(response, 'type', verify_type)

WS.verifyElementPropertyValue(response, 'participants', verify_participants)

WS.verifyElementPropertyValue(response, 'price', verify_price)

WS.verifyElementPropertyValue(response, 'link', verify_link)

WS.verifyElementPropertyValue(response, 'key', verify_key)

