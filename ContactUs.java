package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class ContactUs {
	static String page = "Help::Contact Us";
	public ContactUs(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Contact Us");
		driver.get("http://www.disasterassistance.gov/help/contact-us");
		Header.run(driver,page);
		contactUs(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		contactUs(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void contactUs(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] contactHeader = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[1]/div/div[1]/div/div/p",
				"Contact Us Header"};
		String[] femaHelpline = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[1]/div/div[3]/div/div",
				"FEMA Helpline"};
		String[] femaHelpDesk = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[2]/div/div[2]/div/div",
				"FEMA Internet Help Desk"};
		String[] femaDisasterRecovery = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[3]/div/div[2]/div/div",
				"FEMA Disaster Recovery Center"};
		String[] assistanceFromPartners = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[4]/div/div[2]/div/div",
				"Assistance From Our Partners"};
		String[] daNewsletter = {
				"xpath",
				"//*[@id=\"e-gov-delivery\"]/fieldset",
				"DisasterAssistance.gov e-Newsletter"};
		String[] mediaContacts = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[6]/div/div[2]/div/div",
				"Media Contacts"};
		String[] disasterFraud = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[7]/div/div[2]/div/div",
				"Disaster Fraud"};
		String[] suggestionsFeedback = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-3\"]/div/div/div/ul/li[8]/div/div[2]/div/div",
				"Suggestions or Feedback"};
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray = {
				contactHeader,femaHelpline,femaHelpDesk,femaDisasterRecovery,assistanceFromPartners,
				daNewsletter,mediaContacts,disasterFraud,suggestionsFeedback,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}
