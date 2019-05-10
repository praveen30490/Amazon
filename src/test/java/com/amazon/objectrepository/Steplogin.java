package com.amazon.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.resources.Functionlibrary;

public class Steplogin extends Functionlibrary{
	 public Steplogin () {
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(id="ap_customer_name")
	 private WebElement username;
	 @FindBy(id="ap_phone_number")
	 private WebElement ap_phone_number;
	 @FindBy(id="ap_email")
	 private WebElement ap_email;
	 @FindBy(id="ap_password")
	 private WebElement ap_password;
	 @FindBy(id="continue")
	 private WebElement continu;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getAp_phone_number() {
		return ap_phone_number;
	}
	public WebElement getAp_email() {
		return ap_email;
	}
	public WebElement getAp_password() {
		return ap_password;
	}
	public WebElement getContinu() {
		return continu;
	}
	 
	 

}
