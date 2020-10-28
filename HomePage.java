package osa.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver dr;
	public HomePage(WebDriver dr){
	this.dr=dr;
	PageFactory.initElements(dr, this);
}


@FindBy(xpath="//a[text()='Forum']") 
WebElement forumBnt;

public void clickOnForumButton() {
	System.out.println("Clicked on Forum Button");
	forumBnt.click();
}



}


