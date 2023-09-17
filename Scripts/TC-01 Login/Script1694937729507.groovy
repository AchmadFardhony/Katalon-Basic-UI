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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Button_Appointment'))

WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByIndex(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Dropdown_Rumah_Sakit'), 2)

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Radio_Button_Confirm'))

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Button_Calendar'))

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/September_2023'))

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Bulan Juni'))

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/tanggal 2'))

WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Text_Saran'), 'Tolong Di Perbaiki')

WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/button_Book Appointment'))

