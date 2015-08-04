package basics;

import org.openqa.selenium.WebDriver;

public class CommunityResources {
	static String page = "Community Resources";
	public CommunityResources(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Community Resources");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/community-resources");
		Header.run(driver, page);
		communityResources(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		page = page + "-Spanish";
		
		Header.run(driver, page);
		communityResources(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void communityResources(WebDriver driver, String page) throws InterruptedException{
		String section = "Community Resources";
		String[] comResourcesContainer = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[1]/div/div/p",
				"Community Resources Information"};
		String[] areYouReady = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[1]/p",
				"Are You Ready? Guide"};
		String[] govServicesAndInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[2]/p",
				"U.S. Government Services and Information"};
		String[] americanHometowns = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[3]/p",
				"American Hometowns - Cities, Counties and Towns"};
		String[] stateGov = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[4]/p",
				"State Governments"};
		String[] postalService = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[5]",
				"US Postal Service Alerts"};
		String[] altFuelingStation = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[6]/p",
				"Alternative Fueling Station Locator"};
		String[] emergencyWatershed = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[7]/p",
				"Emergency Watershed Protection (EWP) Program"};
		String[] communityDevelopment = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-7\"]/div/div/div/ul/li/div/div[2]/div/div[8]/p",
				"Community Development Resources"};
		
		String[][] myArray = {
				comResourcesContainer,areYouReady,govServicesAndInfo,americanHometowns,stateGov,
				postalService,altFuelingStation,emergencyWatershed,communityDevelopment};
		RunTest.runTest(myArray,driver,section,page);
	}
}
