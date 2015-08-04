package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class OlderAmericans {
	static String page = "Information::Older Americans";
	public OlderAmericans(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Older Americans");
		driver.get("http://www.disasterassistance.gov/information/older-americans");
		Header.run(driver, page);
		olderAmericans(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		olderAmericans(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void olderAmericans(WebDriver driver, String page) throws InterruptedException{
		String section = "Older Americans";
		String[] onlineResourcesContent = {
				"xpath",
				"//*[@id=\"content-container\"]/div[2]/div",
				"Online Resources"};
		String[] dlGuidesContent = {
				"xpath",
				"//*[@id=\"content-container\"]/div[2]/div",
				"Downloadable Guides and Resources"};
		String[] videosContent = {
				"xpath",
				"//*[@id=\"content-container\"]/div[2]/div",
				"Videos"};
		
		String[][] myArray = {
				onlineResourcesContent,dlGuidesContent,videosContent};
		RunTest.runTest(myArray,driver,section,page);
	}
}
