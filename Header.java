package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Header  {
	public static void run(WebDriver driver, String page) throws InterruptedException{
		headerGetAssistance(driver, page);
		headerInformation(driver, page);
		headerAboutUsHelp(driver, page);
		headerLogoButtons(driver, page);
					}
	public static void headerGetAssistance (WebDriver driver, String page) throws InterruptedException{
		
		/*
		 * Enter Xpath of the header category, xpath of the sub item, and a description. 
		 */
		String[] home = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[1]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[1]/a",
				"Home"};
		String[] getAssistance = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"Get assistance -> Landing page"};
		String[] getAssistance1 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[1]/a",
				"Get assistance -> Address lookup"};
		String[] getAssistance2 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[2]/a",
				"Get assistance -> Find Assistance"};
		String[] getAssistance3 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[3]/a",
				"Get assistance -> Apply online"};
		String[] getAssistance4 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[4]/a",
				"Get assistance -> Check your status"};
		String[] getAssistance5 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[5]/a",
				"Get assistance -> Assistance By Category"};
		String[] getAssistance6 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[6]/a",
				"Get assistance -> Assistance by Agency"};
		String[] getAssistance7 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[7]/a",
				"Get assistance -> Application Checklist"};
		String[] getAssistance8 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[2]/ul/li[8]/a",
				"Get assistance -> Forms"};		
		
		String[][] myArray = {
				home,getAssistance,
				getAssistance1, getAssistance2, getAssistance3, getAssistance4, 
				getAssistance5, getAssistance6, getAssistance7, getAssistance8};
		//System.out.println("---Running test for the Header(Home and Get Assistance)");
		runHeaderTest(myArray, driver, page);
		
	}
	
	public static void headerInformation (WebDriver driver, String page) throws InterruptedException{
		
		/*
		 * Enter Xpath of the header category, xpath of the sub item, and a description. 
		 */
		String[] information = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"Information"};
		String[] information1 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[1]/a",
				"Information -> News Feed"};
		String[] information2 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[2]/a",
				"Information -> Immediate needs"};
		String[] information3 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[3]/a",
				"Information -> Moving Forward"};
		String[] information4 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[4]/a",
				"Information -> Community Resources"};
		String[] information5 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[5]/a",
				"Information -> Disabilities or Acceses and Functional Needs"};
		String[] information6 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[6]/a",
				"Information -> Older Americans"};
		String[] information7 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[7]/a",
				"Information -> Children and Families"};
		String[] information8 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[8]/a",
				"Information -> Disaster Types"};
		String[] information9 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[9]/a",
				"Information -> Foreign Disasters"};
		String[] information10 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[3]/ul/li[10]/a",
				"Information -> Fact Sheets"};		
		
		String[][] myArray = {
				information, information1, information2, information3, information4, information5, information6,
				information7, information8, information9,information10};
		//System.out.println("---Running test for the Header(information)");
		runHeaderTest(myArray, driver, page);
		
	}
	
	public static void headerAboutUsHelp(WebDriver driver, String page) throws InterruptedException{
		String[] AboutUs = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/a",
				"About us -> Landing Page"};
		String[] AboutUs1 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/ul/li[1]/a",
				"About us -> Overview"};
		String[] AboutUs2 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[4]/ul/li[2]/a",
				"About us -> Partners"};
		String[] help = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"Help -> Landing Page"};
		String[] help1 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/ul/li[1]/a",
				"Help -> FAQs"};
		String[] help2 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/ul/li[2]/a",
				"Help -> Contact Us"};
		String[] help3 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/ul/li[3]/a",
				"Help -> Privacy Policy"};
		String[] help4 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/ul/li[4]/a",
				"Help -> Accessibility"};
		String[] help5 = {
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/a",
				"/html/body/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/nav/ul/li[5]/ul/li[5]/a",
				"Help -> Download Plug-Ins"};
	
		String[][] myArray = {
				AboutUs, AboutUs1, AboutUs2, help, help1, help2, help3, help4, help5};
		//System.out.println("---Running test for the Header(About Us and Help)");
		runHeaderTest(myArray, driver, page);
		}
	
	public static void headerLogoButtons(WebDriver driver, String page) throws InterruptedException{
		String section = "Header";
		String[] logo= {"id","logo","Logo in the header"};
		String[] button1= {"id","find_assistance_icon","Find Assistance Icon"};
		String[] button2= {"id","apply_online_icon","Apply Online Icon"};
		String[] button3= {"id","search-icon","Search Icon"};
		String[] button4= {"id","check_status_icon","Check Status Icon"};
		String[] button5= {"id","email-icon","Email Icon"};
		String[] button6= {"id","print-icon","Print Icon"};
		String[] langToggle= {
				"xpath",
				"//*[@id=\"language-switcher-container\"]/ul",
				"Language Toggle"};
		
		
		String[][] myArray = {logo, button1, button2, button3, button4, button5, button6, langToggle};	
		RunTest.runTest(myArray, driver, page, section);
				
		}
	
	
	public static void runHeaderTest(String [][] myArray, WebDriver driver, String page) throws InterruptedException	
	{
		
		String [][] currentArray = myArray;
		
		for(int i = 0; i < currentArray.length;i++)
		{
			try
			{
				//This will take the Xpath of Header item 1, header sub item, named like so: Information -> Immediate Needs
				Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath(currentArray[i][0]));
				//action.moveToElement(we).moveToElement(driver1.findElement(By.xpath(currentArray[i][1]))).click().build().perform();
				action.moveToElement(we).moveToElement(driver.findElement(By.xpath(currentArray[i][1]))).build().perform();
				//Thread.sleep(500);
				//driver1.navigate().back();
				System.out.println("<tr><td>"+page+"</td><td>Header</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
			}
			
			catch(Exception e)
			{
				System.out.println("<tr><td>"+page+"</td><td>Header</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
				
			}
			
		}
	}
	
}
