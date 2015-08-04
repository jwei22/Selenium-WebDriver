package basics;

import org.openqa.selenium.WebDriver;

public class Overview {
	static String page = "About Us::Overview";
	public Overview(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for News Feeds");
		driver.get("http://www.disasterassistance.gov/about-us/overview");
		Header.run(driver, page);
		overview(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		overview(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void overview(WebDriver driver, String page) throws InterruptedException{
		String section = "Overview";
		String[] missionContent = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block\"]/div/div/div/ul/li[1]/div/div[2]/div/div/p",
				"Mission"};
		String[] backgroundContent = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block\"]/div/div/div/ul/li[2]/div/div[2]/div/div",
				"Background"};
		String[] eGovernmentContent = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block\"]/div/div/div/ul/li[4]/div/div[2]/div/div",
				"E-Government"};
		
		String[][] myArray = {
				missionContent,backgroundContent,eGovernmentContent};
		RunTest.runTest(myArray,driver,section,page);
	}
}
