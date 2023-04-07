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

//click dropdown tambah
WebUI.scrollToPosition(30, 30)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Import Excel/button_Toggle Dropdown'))

//click import excel
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Import Excel/a_Import Excel'))

//upload file xslx
WebUI.uploadFile(findTestObject('Object Repository/APS/Page_APS_Import Excel/input_Pilih File_excel_file'), 'D:\\Data Pemilih 2023-02-23 16_16_54.xlsx')

//click upload, yes, ok
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Import Excel/button_Upload'))
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Import Excel/Page_APS_Validasi YES Upload/button_Yes'))
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Import Excel/Page_APS_Validasi YES Upload/button_OK'))

//close browser
WebUI.closeBrowser()