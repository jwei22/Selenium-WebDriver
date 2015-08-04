package basics;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class DisasterTypes {
	static String page = "Information::Disaster Types";
	public DisasterTypes(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Disaster Types");
		driver.get("http://www.disasterassistance.gov/information/disaster-types");
		Header.run(driver, page);
		disasterTypes(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		disasterTypes(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void disasterTypes(WebDriver driver, String page) throws InterruptedException{
		String section = "Disaster Types";
		String[] disastersContainer = {
				"xpath",
				"//*[@id=\"content-container\"]",
				"Disasters Type Header"};
		String[] biologicalThreat = {
				"xpath",
				"//*[@id=\"content-container\"][1]",
				"Biological Threat"};
		String[] biologicalThreatPhoto = {
				"xpath",
				"img[alt=\"Emergency responders attending the Technical Emergency Response Training (TERT)" + 
				" worked with biological materials Ricin and Anthrax, and also nerve agents GB and VX," +      
				" during their course.\"]",
				"Biological Threat Photo"};
		String[] chemicalThreat = {
				"xpath",
				"//*[@id=\"content-container\"][2]",
				"Chemical Threat"};
		String[] chemicalThreatPhoto = {
				"xpath",
				"img[alt=\"Anniston, Ala., July 19, 2013 -- Emergency responders and soldiers from the " +
				"United States Army National Guard 140th Chemical Company pull a survivor to safety during" + 
				"a simulated exercise in FEMA's Center for Domestic Preparedness (CDP) mock subway train system.\"]",
				"Chemical Threat Photo"};
		String[] drought = {
				"xpath",
				"//*[@id=\"content-container\"][3]",
				"Drought"};
		String[] earthquake = {
				"xpath",
				"//*[@id=\"content-container\"][4]",
				"Earthquake"};
		String[] fire = {
				"xpath",
				"//*[@id=\"content-container\"][5]",
				"Fire"};
		String[] flood = {
				"xpath",
				"//*[@id=\"content-container\"][6]",
				"Flood"};
		String[] heat = {
				"xpath",
				"//*[@id=\"content-container\"][7]",
				"Heat"};
		String[] hurricane = {
				"xpath",
				"//*[@id=\"content-container\"][8]",
				"Hurricane"};
		String[] landslide = {
				"xpath",
				"//*[@id=\"content-container\"][9]",
				"Landslide"};
		String[] radiationNuclear = {
				"xpath",
				"//*[@id=\"content-container\"][10]",
				"Radiation and Nuclear"};
		String[] tornado = {
				"xpath",
				"//*[@id=\"content-container\"][11]",
				"Tornado"};
		String[] tsunami = {
				"xpath",
				"//*[@id=\"content-container\"][12]",
				"Tsunami"};
		String[] volcano = {
				"xpath",
				"//*[@id=\"content-container\"][13]",
				"Volcano"};
		String[] wildfire = {
				"xpath",
				"//*[@id=\"content-container\"][14]",
				"Wildfire"};
		String[] winterStorm = {
				"xpath",
				"//*[@id=\"content-container\"][15]",
				"Winter Storm"};
		
		String[][] myArray = {
				disastersContainer,biologicalThreat,chemicalThreat,drought,earthquake,fire,flood,
				heat,hurricane,landslide,radiationNuclear,tornado,tsunami,volcano,wildfire,winterStorm,
				biologicalThreatPhoto,chemicalThreatPhoto};
		RunTest.runTest(myArray,driver,section,page);
	}
}
