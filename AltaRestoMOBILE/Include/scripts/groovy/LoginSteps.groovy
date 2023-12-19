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
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user on the login page")
	def userOnTheLoginPage() {
	}

	@When("i input valid email")
	def iInputvalidemail() {
	}
	@When("i input unregistered email")
	def Iinputunregisteredemail() {
	}
	@When("I click login with google button")
	def Iclickloginwithgooglebutton() {
	}
	@And("i input correct password")
	def Iinputcorrectpassword() {
	}
	@And("i input unregistered password")
	def Iinputunregisteredpassword() {
	}
	@And("i click enter button")
	def Iclickenterbutton() {
	}
	@And("i input wrong password")
	def Iinputwrongpassword() {
	}
	@And("I verify google account")
	def Iverifygoogleaccount() {
	}
	@And("I input password google account")
	def Iinputpasswordgoogleaccount() {
	}
	@Then("i directed to homepage")
	def Idirectedtohomepage() {
	}
	@Then("error message unregistered is displayed")
	def errormessageunregisteredisdisplayed() {
	}
	@Then("error message wrong password is displayed")
	def errormessagewrongpasswordisdisplayed() {
	}
}