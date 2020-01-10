package com.sailotech.assignment.tripadvisor;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trip{

	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void TripAdvisor() throws InterruptedException {
		ObjectRepository repo =new ObjectRepository(driver);
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		//Amazon
		driver.get(repo.tripAdvisor);
		repo.tripSearch.click();
		Thread.sleep(2000);
		repo.tripMainSearch.sendKeys("Club Mahindra"); //searching club Mahindra in TripAdvisory site
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		repo.selectTopinList.click(); //Selected top one in the list
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(4000);
		repo.clickWriteReview.click();
		Thread.sleep(3000);
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2)); //Shifting one tab to another
		action.moveToElement(repo.rating).moveByOffset(50, 0).click().build().perform();
		repo.title.sendKeys("Super location and View");
		String revDesc="Really clean! Stopped here over night on the way to Seattle. The hotel smells fresh and clean. The room was spotless and fresh also. The pool area is hot as a sauna. We are very pleased with our hotel choice and look forward to a nice night. We would stay here again if in the area.Great value We stayed here at the end of our 10-day trip through North Dakota, Wyoming, Montana and South Dakota during 4th of July week. It was one of the most comfortable and least expensive in our journey. It slept our family of four comfortably and the staff was extremely friendly! Would definitely stay again if we came back this way.";
		repo.reviewDescription.sendKeys(revDesc);
		repo.tripSort.click();
		repo.tripDate.click();
		repo.shoeShine.click();
		repo.clean.click();
		repo.modern.click();
		repo.theme.click();
		repo.wedding.click();
		repo.safe.click();
		action.moveToElement(repo.servicerating).moveByOffset(50, 0).click().build().perform(); //giving Five Star Rating
		Thread.sleep(1000);
		action.moveToElement(repo.cleanliness).moveByOffset(50, 0).click().build().perform(); //giving Five Star Rating
		Thread.sleep(1000);
		action.moveToElement(repo.value).moveByOffset(50, 0).click().build().perform(); //giving Five Star Rating
		repo.expensive.click();
		repo.roomTip.sendKeys("Rooms on the south side are quieter");
		Thread.sleep(1000);
		repo.terms.click(); //click on submit review
		Thread.sleep(1000);
		driver.quit();
	}

}
