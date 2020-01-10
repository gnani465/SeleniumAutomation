package com.sailotech.assignment.iphonexr64gb;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrice{

	public int Amazon(WebDriver driver) throws InterruptedException {
		ObjectRepository repo =new ObjectRepository(driver);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//Amazon
		driver.get(repo.amazon);
		repo.AmazonSearch.sendKeys("iPhone XR 64GB yellow"); //Searching mobile
		
		action.sendKeys(Keys.ENTER).perform();
		
		String costInAmazon= repo.amazonPrice.getText(); //Fetching the price of mobile
		System.out.println("iPhone XR 64GB Price in Amazon - "+ costInAmazon);
		String[] splitA = costInAmazon.split(","); //Removing unnecessary , symbol
		String iPhonePrice = splitA[0] + "" + splitA[1];
		int iphoneXRCostAmazon = Integer.parseInt(iPhonePrice);
		System.out.println("iPhone XR 64GB Price in Amazon - "+ iphoneXRCostAmazon);
		return iphoneXRCostAmazon;
	}

}
