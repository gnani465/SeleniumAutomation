package com.sailotech.assignment.iphonexr64gb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IPhoneXR64GB{

	public WebDriver driver;
	AmazonPrice amazonprice=new AmazonPrice();
	FlipkartPrice flipkartprice =new FlipkartPrice();
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe"); //Selecting chrome driver from local system
		driver = new ChromeDriver();
	}
	
	@Test
	public void comparePrice() throws InterruptedException {
		
		int amazonRate = amazonprice.Amazon(driver);
		int flipkartRate = flipkartprice.Flipkart(driver);

		//comparing price from both the websites
		if(flipkartRate < amazonRate){
			System.out.println("iPhone XR 64GB Price is less in Flipkart when compared to Amazon price. You can shop in Flipkart");
		}else{
			System.out.println("iPhone XR 64GB Price is less in Amazon when compared to Flipkart price. You can shop in Amazon");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
