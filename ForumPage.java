package osa.com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.tetes.ForumLogin;
import com.osa.utility.Utilities;

public class ForumPage {
	WebDriver dr;
	public ForumPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	private static Logger log=Utilities.getLog(ForumPage.class);
	

	@FindBy(id="username") 
	WebElement usernameBox;
	
	@FindBy(id="password") 
	WebElement passwordBox;
	
	@FindBy(id="login_button") 
	WebElement loginBtn;
	
	
	public void typeUsername(String username) {
		log.info("Entering the username " +username);
		usernameBox.sendKeys(username);
	}	
	public void typePassword(String password) {
		log.info("Entering the username " +password);
		passwordBox.sendKeys("7416Mitul");
	}
	public void clickOnLoginButton() {
		loginBtn.click();
		
	}
	

}
