package com.sailotech.assignment.tripadvisor;

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

	String tripAdvisor="https://www.tripadvisor.in/";
	
	@FindBy(className = "brand-global-nav-action-search-Search__searchButton--b9-IK")
	WebElement tripSearch;
	
	@FindBy(id = "mainSearch")
	WebElement tripMainSearch;
	
	@FindBy(xpath = "//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]")
	WebElement selectTopinList;
	
	@FindBy(xpath= "//*[@id='component_12']/div/div[2]/div/div[2]/div/div[1]/a")
	WebElement clickWriteReview;
	
	@FindBy(id="bubble_rating")
	WebElement rating;
	
	@FindBy(id = "ReviewTitle")
	WebElement title;
	
	@FindBy(id = "ReviewText")
	WebElement reviewDescription;
	
	@FindBy(xpath = "//*[@id='trip_type_table']/div[1]")
	WebElement tripSort;
	
	@FindBy(xpath = "//*[@id='trip_date_month_year']/option[2]")
	WebElement tripDate;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[3]/div[1]/div[1]")
	WebElement shoeShine;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[4]/div[1]/div[1]")
	WebElement clean;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[5]/div[1]/div[1]")
	WebElement modern;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[6]/div[1]/div[1]")
	WebElement theme;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[7]/div[1]/div[1]")
	WebElement wedding;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[8]/div[1]/div[1]")
	WebElement safe;
	
	@FindBy(xpath = "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[1]/child::div[2]/child::div/span")
	WebElement servicerating;
	
	@FindBy(xpath = "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[2]/child::div[2]/child::div/span")
	WebElement cleanliness;
	
	@FindBy(xpath = "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[3]/child::div[2]/child::div/span")
	WebElement value;
	
	@FindBy(xpath = "//*[@id='DQ_TAGRADIO']/div[2]/div[1]")
	WebElement expensive;
	
	@FindBy(id = "ROOM_TIP")
	WebElement roomTip;
	
	@FindBy(id = "noFraud")
	WebElement terms;
	
}
