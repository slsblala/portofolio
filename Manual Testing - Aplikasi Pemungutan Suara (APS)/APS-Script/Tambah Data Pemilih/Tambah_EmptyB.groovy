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

//click tombol tambah
WebUI.scrollToPosition(30, 30)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/button_Tambah'))

//field KK
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_kk'), "1011121314151617")
//field NIK
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_nik'), "1716151413121110")
//field nama
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_nama'), "Salsabila")
//field alamat
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/textarea__pemilih_alamat'), "Rajasa Residence")
//field rt left empty
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_rt'), "")
//field rw
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_rw'), "3")
//field kelurahan
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Kelurahan -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Span-Select/Select_Pilih Kelurahan'), "Tasik Malaya", false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Kelurahan -'))
//field tempat lahir
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_tempat_lahir'), "Jakarta")
//field tgl lahir
WebUI.setText(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_tgl_lahir'), "12/07/2000")
WebUI.sendKeys(findTestObject('Object Repository/APS/Page_APS_Form Tambah/input__pemilih_tgl_lahir'), Keys.chord(Keys.TAB))
//radio jenis kelamin
WebUI.check(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Page_APS_RadioButton/span_laki'))
//field status kawin
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Status Kawin -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Span-Select/Select_Pilih Status Kawin'), "B - Belum Kawin", false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Status Kawin -'))
//field caleg
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Caleg -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Span-Select/Select_Pilih Caleg'), "Dummy", false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih Caleg -'))
//field tps
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih TPS -'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Span-Select/Select_Pilih TPS'), "Testing TPS", false)
WebUI.click(findTestObject('Object Repository/APS/Page_APS_Form Tambah/span_- Pilih TPS -'))
//radio status
WebUI.check(findTestObject('Object Repository/APS/Page_APS_Form Tambah/Page_APS_RadioButton/span_pemilih'))

//click simpan | tombol bisa diklik tapi data tidak tersimpan
WebUI.verifyElementClickable(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'))
WebUI.verifyElementPresent(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'),3)
WebUI.enhancedClick(findTestObject('Object Repository/APS/Page_APS_Edit Data Pemilih/button_Simpan'))

//close browser
WebUI.closeBrowser()