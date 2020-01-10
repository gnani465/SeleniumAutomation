package com.sailotech.assignment.iphonexr64gb;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPrice{

	public int Flipkart(WebDriver driver) throws InterruptedException {
		ObjectRepository repo =new ObjectRepository(driver);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//Flipkart 
		driver.get(repo.flipkart);
		
		action.sendKeys(Keys.ESCAPE).perform();	//closing the login pop-up in home page
		repo.FlipkartSearch.sendKeys("iPhone XR 64GB yellow"); //Searching mobile
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		String costInFlipkart= repo.flipkartPrice.getText(); //Fetching the price of mobile
		System.out.println("iPhone XR 64GB Price in Flipkart - "+ costInFlipkart);
		String[] splitF = costInFlipkart.split(",|\\₹");
		String iPhonePrice = splitF[1] + "" + splitF[2]; //Removing unnecessary , and ₹ symbols 
		int iphoneXRCostFlipkart = Integer.parseInt(iPhonePrice);
		System.out.println("iPhone XR 64GB Price in Flipkart - "+ iphoneXRCostFlipkart);
		return iphoneXRCostFlipkart;
	}
}
