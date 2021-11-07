package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(

	features="C:\\Users\\Hp\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Features\\Login.feature" ,
	glue="stepDefinitions",
	dryRun=false,
	monochrome=true
)


public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	

}
