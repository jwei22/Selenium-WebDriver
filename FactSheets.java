package basics;

import org.openqa.selenium.WebDriver;

public class FactSheets {
	static String page = "Information::Fact Sheets";
	public FactSheets(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Fact Sheets");
		driver.get("http://www.disasterassistance.gov/information/fact-sheets");
		Header.run(driver, page);
		factSheets(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		factSheets(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void factSheets(WebDriver driver, String page) throws InterruptedException{
		String section = "Fact Sheets";
		String[] factSheetsContainer = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-9\"]/div/div/div/ul/li/div/div[1]/div/div/p",
				"Fact Sheets Information"};
		String[] disasterAssistance = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-9\"]/div/div/div/ul/li/div/div[2]/div/div[1]/p",
				"Disaster Assistance Fact Sheet"};
		String[] survivorAppChecklist = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-9\"]/div/div/div/ul/li/div/div[2]/div/div[2]/p",
				"Disaster Survivor Application Checklist "};
		String[] youthMaterials = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-9\"]/div/div/div/ul/li/div/div[2]/div/div[3]/p",
				"Youth Materials"};
		
		String[][] myArray = {
				factSheetsContainer,disasterAssistance,survivorAppChecklist,youthMaterials};
		RunTest.runTest(myArray,driver,section,page);
	}
}
