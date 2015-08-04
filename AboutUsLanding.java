package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class AboutUsLanding {
	static String page = "About Us::Landing";
	public AboutUsLanding(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for the About Us Landing Page");
		driver.get("http://www.disasterassistance.gov/about-us");
		//Header.run(driver);
		aboutUs(driver, page);
		SendEmail.run(driver);
		//Footer.run(driver);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		//Header.run(driver, spanishPage);
		aboutUs(driver, spanishPage);
		SendEmail.run(driver);
		//Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void aboutUs(WebDriver driver, String page) throws InterruptedException{
		String section = "Buttons";
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		String[] buttonOverview = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[1]/article",
				"Overview Button"};
		String[] buttonPartners = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[2]/article",
				"Partners Button"};
				
		String[][] myArray = {
				backgroundImage,buttonOverview,buttonPartners};
		//System.out.println("---Running test for About Us landing page");
		RunTest.runTest(myArray,driver,page, section);
		
	}
}
