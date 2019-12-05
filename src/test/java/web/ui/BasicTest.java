package web.ui;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json"
},
        features = { "src/main/resources/features" }
)
public class BasicTest extends AbstractTestNGCucumberTests {

}
