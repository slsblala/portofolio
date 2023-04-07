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
WebUI.openBrowser('https://aps-rejanglebong.skwn.dev/dev/index.php/login')

//input username
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_LOGIN/input_Username_username'), 'candidat')

//input password
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_LOGIN/input_Password_password'), 'password123')

//click login
WebUI.click(findTestObject('Object Repository/APS/Page_APS_LOGIN/button_Masuk'))

//click pemilih tetap
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Pemilih Tetap/span_Pemilih Tetap'))

//click tombol filter data
WebUI.scrollToPosition(30, 60)

WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/button_Data Pemilih_btn btn-sm btn-light-aps d-flex justify-content-center'))

//field provinsi
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/Page_APS  Aplikasi Pemungutan Suara/span_- Pilih Provinsi -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Filter Positive/Page_APS  Aplikasi Pemungutan Suara/Select_x'), 'Bengkulu', false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/Page_APS  Aplikasi Pemungutan Suara/span_- Pilih Provinsi -'))

//field kota/kab
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih KotaKabupaten -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Filter Positive/select_KotaKabupaten_filter_kota_id'), 'Rejang Lebong', false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih KotaKabupaten -'))

//field kecamatan
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih Kecamatan -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Filter Positive/select_Kecamatan_filter_kecamatan_id'), 'Curup', false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih Kecamatan -'))

//field kelurahan
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih Kelurahan -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Filter Positive/select_Kelurahan_filter_kelurahan_id'), 'Jalan Baru', false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih Kelurahan -'))

//field TPS
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih TPS -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Filter Positive/select_TPS_filter_tps_id'), 'Baru', false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/span_- Pilih TPS -'))

//clear field provinsi & kota/kab
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Negative/Page_APS_Del1/span_delprov'))

//click apply filter
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Filter Positive/button_Apply'))

//close browser
WebUI.closeBrowser()