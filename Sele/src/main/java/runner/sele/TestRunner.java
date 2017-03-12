package runner.sele;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;;


@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",glue={"stepDefinetion"})
public class TestRunner {


	
}
	