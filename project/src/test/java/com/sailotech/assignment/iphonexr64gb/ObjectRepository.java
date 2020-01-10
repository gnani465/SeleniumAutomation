package com.sailotech.assignment.iphonexr64gb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository {

	WebDriver driver;

	ObjectRepository(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(d, this);
	}

	String amazon="https://www.amazon.in/";
	String flipkart="https://www.flipkart.com/";
	
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement AmazonSearch;
	
	@FindBy(className="a-price-whole")
	WebElement amazonPrice;

	@FindBy(className = "LM6RPg")
	WebElement FlipkartSearch;
	
	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div")
	WebElement flipkartPrice;

}
