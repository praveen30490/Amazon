package com.amazon.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue={"com.amazon.stepdefination"},plugin= {"html:target","json:target/report.json"},monochrome=true)
public class Runner {

}