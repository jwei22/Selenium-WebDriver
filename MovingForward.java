package basics;

import org.openqa.selenium.WebDriver;

public class MovingForward {
	static String page = "Information::Moving Foward";
	public MovingForward(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/moving-forward");
		Header.run(driver, page);
		movingForward(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver, spanishPage);
		movingForward(driver, spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void movingForward(WebDriver driver, String page) throws InterruptedException{
		String section = "Moving Foward";
		String[] moveFowardIntro = {
				"xpath",
				"//*[@id=\"content-container\"][1]",
				"Moving Foward Information"};
		String[] yourHome = {
				"xpath",
				"//*[@id=\"content-container\"][2]",
				"Your Home Info"};
		String[] yourBusiness = {
				"xpath",
				"//*[@id=\"content-container\"][3]",
				"Your Business or Farm"};
		String[] yourFinances = {
				"xpath",
				"//*[@id=\"content-container\"][4]",
				"Your finances job and insurance"};
		String[] yourHealth = {
				"xpath",
				"//*[@id=\"content-container\"][5]",
				"Your Health"};
		String[] yourOfficialDocuments = {
				"xpath",
				"//*[@id=\"content-container\"][6]",
				"Your Official Documents"};
		
		String[][] myArray = {
				moveFowardIntro,yourHome,yourBusiness,yourFinances,yourHealth,yourOfficialDocuments
				};
		RunTest.runTest(myArray,driver,section,page);
	}
}
