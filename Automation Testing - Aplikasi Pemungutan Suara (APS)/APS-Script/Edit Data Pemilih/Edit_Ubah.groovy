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

//click edit di data Test Dung
WebUI.scrollToPosition(60, 30)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/i_PEMILIH_icon far fa-edit'))

//edit data NIK
WebUI.clearText(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/Edit Data_Form/APS_Edit Kosong/input__pemilih_nik'))
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/Edit Data_Form/APS_Edit Kosong/input__pemilih_nik'), '0101010101010101')


//click simpan tanpa mengubah data | tombol bisa diklik tapi data tidak tersimpan
WebUI.verifyElementClickable(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'))
WebUI.verifyElementPresent(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'),3)
WebUI.enhancedClick(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'))

//close browser
WebUI.closeBrowser()