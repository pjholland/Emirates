import com.emirates.resources.WebDriverSingleton;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test"},
           // glue = {"src/main/java"},
          //  plugin = {"pretty", "html:target/reports/cucumber/html", "json:target/cucumber.json", "usage:target/usage.jsonx", "junit:target/junit.xml"},
         // Run every thing but ignore @wip and @fail
        // tags = {"~@wip","~@fail"}, strict = true)
        tags = {"@current"}, strict = true, monochrome = true)

public class RunCucumber {

    @AfterClass
    public static void tearDown(){
        WebDriverSingleton.getInstance(WebDriverSingleton.Browsers.chrome).quit();
    }
}
