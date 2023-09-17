import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {
	
	@Given("I open https://katalon-demo-cura.herokuapp.com/")
	def OpenWebsite () {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Button_Appointment'))
		
		}
		
	@When("I Fill in incorrect username (.*) and correct password (.*)")
	def IncorrectUsernameAndCorrectPassword (String username, String password) {
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Username_username'), username)
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Password_password'), password)
		}
		
	@And("I Click Button Login")
	def ClickButtonLogin () {
		WebUI.click(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/button_Login'))
		}
	
	@Then("I See Messages Error Login failed! Please ensure the username and password are valid.")
	def MessagesError () {
		WebUI.verifyElementPresent(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Messages Error'), 3)
		WebUI.closeBrowser()
		}
		
   @When("I Fill in correct username (.*) and incorrect password (.*)")
	def CorrectUsernameAndIncorrectPassword (String username, String password) {
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Username_username'), username)
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Password_password'), password)
		WebUI.closeBrowser()
		}
		
    @When("I Fill in incorrect username (.*) and incorrect password (.*)")
	def IncorrectUsernameAndIncorrectPassword (String username, String password) {
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Username_username'), username)
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Password_password'), password)
		WebUI.closeBrowser()
			}
		
    @And("I Fill in Correct username (.*) and Correct password (.*)")
	def CorrectUsernameAndCorrectPassword (String username, String password) {
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Username_username'), username)
		WebUI.setText(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/input_Password_password'), password)
		}
					
	@Then("Navigate To Apointment Page")
	def NavigateToApoinmentPage () {
		WebUI.selectOptionByIndex(findTestObject('Rumah_Sakit/Page_CURA Healthcare Service/Dropdown_Rumah_Sakit'), 2)
		}
	}