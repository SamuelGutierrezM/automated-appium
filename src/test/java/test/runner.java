package test;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "json:target/destination/cucumber.json", "rerun:target/destination/failedrerun.txt", "html:target/destination/cucumber.html", "timeline:target/test-results/timeline"},
        tags = "@Regresion",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runner {

}
