package com.noorteck.homework1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {
	
	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/simple_context_menu.html";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lee_b\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		WebElement el = driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));

		Actions action = new Actions(driver);

		action.contextClick(el).build().perform();

		WebElement copy = driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));

		action.moveToElement(copy).click().build().perform();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);

		Thread.sleep(3000);
		alert.dismiss();

		Thread.sleep(3000);
		driver.quit();

	}
}



