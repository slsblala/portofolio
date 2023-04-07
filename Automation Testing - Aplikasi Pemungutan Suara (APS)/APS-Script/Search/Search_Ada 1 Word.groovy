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

//open APS
WebUI.openBrowser("https://aps-rejanglebong.skwn.dev/dev/index.php/login")

//input username
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_LOGIN/input_Username_username'), "candidat")

//input password
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_LOGIN/input_Password_password'), "password123")

//click login
WebUI.click(findTestObject('Object Repository/APS/Page_APS_LOGIN/button_Masuk'))

//click pemilih tetap
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Pemilih Tetap/span_Pemilih Tetap'))

//click field search
WebUI.scrollToPosition(30, 30)
WebUI.click(findTestObject('Object Repository/APS/Page_APS _Search/input_Data Pemilih_table-inputpemilih_dtSearch'))

//ketik di field search
WebUI.setText(findTestObject('Object Repository/APS/Page_APS _Search/input_Data Pemilih_table-inputpemilih_dtSearch'), 'Elvia')