package basics;

import org.openqa.selenium.WebDriver;

public class Forms {
	static String page = "Get Assistance::Forms";
	public Forms(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Forms");
		driver.get("http://www.disasterassistance.gov/get-assistance/forms");
		Header.run(driver, page);
		assistanceForms(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver,  spanishPage);
		assistanceForms(driver,spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
		Footer.run(driver, spanishPage);
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void assistanceForms(WebDriver driver, String page) throws InterruptedException{
		String section = "Forms";
		String[] instructionsField = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-6\"]/div/div/div",
				"Form Instruction Field"};
		String[] buttonApplyOnline = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-6\"]/div/div/div/ul/li/div/div/div/div[1]/p/b/a",
				"Apply Online Button"};
		String[] buttonDownloadPDF = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-6\"]/div/div/div/ul/li/div/div/div/div[2]/p[1]/b/a",
				"Download Form Button"};
		
		
		String[][] myArray = {
				instructionsField,buttonApplyOnline,buttonDownloadPDF};
		RunTest.runTest(myArray,driver,section,page);
		
	}
}
