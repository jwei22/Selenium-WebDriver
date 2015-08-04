package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class PrivacyPolicy {
	static String page = "Help::Privacy Policy";
	public PrivacyPolicy(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Privacy Policy");
		driver.get("http://www.disasterassistance.gov/help/privacy-policy");
		Header.run(driver,page);
		privacyPolicy(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		privacyPolicy(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void privacyPolicy(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] policyHeader = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[1]/div/div[1]/div/div",
				"Privacy Policy Header"};
		String[] personalII = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[1]/div/div[3]/div/div",
				"Personally Identifiable Information"};
		String[] childrensPrivacy = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[2]/div/div[2]/div/div",
				"Children's Privacy"};
		String[] paperworkReduction = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[3]/div/div[2]/div/div",
				"Paperwork Reduction Act Notice"};
		String[] useCookies = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[4]/div/div[2]/div/div",
				"How We Use Cookies"};
		String[] googleAnalytics = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[5]/div/div[2]/div/div",
				"Google Analytics"};
		String[] addThis = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[6]/div/div[2]/div/div",
				"AddThis"};
		String[] surveyMonkey = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[7]/div/div[2]/div/div",
				"SurveyMonkey"};
		String[] siteMetrics = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[8]/div/div[2]/div/div",
				"Site Metrics"};
		String[] linkedWebsites = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-5\"]/div/div/div/ul/li[9]/div/div[2]/div/div",
				"Visiting Linked Websites"};
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray = {
				policyHeader,personalII,childrensPrivacy,paperworkReduction,useCookies,googleAnalytics,
				addThis,surveyMonkey,siteMetrics,linkedWebsites,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}