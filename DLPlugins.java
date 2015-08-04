package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class DLPlugins {
	static String page = "Help::Download Plug-ins";
	public DLPlugins(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Download Plug-ins");
		driver.get("http://www.disasterassistance.gov/help/download-plug-ins");
		Header.run(driver,page);
		plugIns(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		plugIns(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	 
	public static void plugIns(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] plugInsHeader = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[1]/div/div[1]/div/div/p",
				"Download Plug-ins Header"};
		String[] xlsHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[1]",
				"Excel"};
		String[] xlsInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[3]",
				"Excel Information"};
		String[] swfHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[2]",
				"Flash Player"};
		String[] swfInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[4]",
				"Flash Player Information"};
		String[] pdfHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[3]",
				"Portable Document Format"};
		String[] pdfInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[5]",
				"Portable Document Format Information"};
		String[] pptHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[4]",
				"PowerPoint"};
		String[] pptInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[6]",
				"PowerPoint Information"};
		String[] wmvasxHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[5]",
				"Windows Media Player"};
		String[] wmvasxInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[7]",
				"Windows Media Player Information"};
		String[] zipHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[6]",
				"WinZip"};
		String[] zipInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[8]",
				"WinZip Information"};
		String[] docHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/h2[7]",
				"Word"};
		String[] docInfo = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[2]/div/div/p[9]",
				"Word Information"};
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray = {
				plugInsHeader,xlsHeader,xlsInfo,swfHeader,swfInfo,pdfHeader,pdfInfo,pptHeader,pptInfo,
				wmvasxHeader,wmvasxInfo,zipHeader,zipInfo,docHeader,docInfo,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}
