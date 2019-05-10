package com.amazon.stepdefination;

import org.openqa.selenium.WebDriver;

import com.amazon.objectrepository.Steplogin;
import com.amazon.resources.Functionlibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinationss extends Functionlibrary{
@Given("I want to write launch webside")
public void i_want_to_write_launch_webside() {
	WebDriver driver=getDriver();
	loadurl("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgooginabkkenshoo-21%26ascsubtag%3D_k_Cj0KCQjwn8_mBRCLARIsAKxi0GLYDVlyPgmHb9pfiCUb5-mqmATYpOZ5d-DpYqwuJKnzvQokaaM_at8aAmH_EALw_wcB_k_%26gclid%3DCj0KCQjwn8_mBRCLARIsAKxi0GLYDVlyPgmHb9pfiCUb5-mqmATYpOZ5d-DpYqwuJKnzvQokaaM_at8aAmH_EALw_wcB%26ref_%3Dnav_signin&prevRID=6D48XMCEBNY9RSZV6N0W&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ubid=261-8450622-3347839");
	}


@When("to check and fill acount details")
public void to_check_and_fill_acount_details() {
	Steplogin step=new Steplogin();
    type(step.getUsername(),"manikandan");
    type(step.getAp_phone_number(),"9998765689");
    type(step.getAp_email(),"manismart1294@gmail.com");
    type(step.getAp_password(),"1294@maniss");
    clicks(step.getContinu());
    
}

@Then("I check acount  create a amazone")
public void i_check_acount_create_a_amazone() {
   
}

}
