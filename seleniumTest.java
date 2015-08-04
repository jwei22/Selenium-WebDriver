package basics;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;

import javax.mail.MessagingException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")

public class seleniumTest {
	public static String domain = "staging";
	public static void main(String[] args) throws InterruptedException, MessagingException, IOException {
		
		PrintStream out = new PrintStream(new FileOutputStream("output.html"));
		System.setOut(out);
		
		// Chrome set up 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\572190\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox
		WebDriver driver = new FirefoxDriver();
		Dimension d = new Dimension(1200,900);
		driver.manage().window().setSize(d);
		
		//IE
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\572190\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		if(domain.equals("staging")){
			driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/?mobile=unL9HuS");
		}
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");

		GenerateHTML.beginning();
		
		//----------HOMEPAGE--------------
		Homepage.Run(driver);
		
		//--------LANDING PAGES-----------
		GetAssistanceLanding.run(driver);
		InformationLanding.run(driver);
		AboutUsLanding.run(driver);
		HelpLanding.run(driver);
		
		//--------GET ASSISTANCE----------
		AddressLookUp.run(driver);
		ApplyOnline.run(driver);
		CheckStatus.run(driver);
		CategoryAssistance.run(driver);
		FederalAgencyAssistance.run(driver);
		ApplicationChecklist.run(driver);
		Forms.run(driver);
		
		//---------INFORMATION------------
		NewsFeeds.run(driver);
		ImmediateNeeds.run(driver);
		MovingForward.run(driver);
		CommunityResources.run(driver);
		//Disabilities.run(driver);
		OlderAmericans.run(driver);
		ChildrenFamilies.run(driver);
		DisasterTypes.run(driver);
		ForeignDisasters.run(driver);
		FactSheets.run(driver);
		
		//----------ABOUT US--------------
		Overview.run(driver);
		Partners.run(driver);
			
		//----------CONTACT US------------
		FAQ.run(driver);
		ContactUs.run(driver);
		PrivacyPolicy.run(driver);
		Accessibility.run(driver);
		DLPlugins.run(driver);
		
		RunTest.emailTest();
		
		GenerateHTML.end();
		
		driver.close();
		
		
		
				
	}
	
	
	
}