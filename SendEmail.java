package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendEmail  {
	public static void run(WebDriver driver) throws InterruptedException{
		String icon = "email-icon";
		String emailTo = "edit-email-to";
		String nameField = "edit-senders-name";
		String sendButton = "edit-send";
		String returnButton = "//*[@id=\"validate\"]/a";
		
		driver.findElement(By.id(icon)).click();
		driver.findElement(By.id(emailTo)).sendKeys("da.test.email02@gmail.com");
		driver.findElement(By.id(nameField)).sendKeys("Test");
		driver.findElement(By.id(sendButton)).click();
		
		driver.findElement(By.xpath(returnButton)).click();
	}	
}