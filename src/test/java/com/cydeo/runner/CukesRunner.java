package com.cydeo.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        }, //type of report (html), then location (target), cucumber-report -> name, extension -> html
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@B26G23-49 and @B26G23-40 and @VyTrack"
)

public class CukesRunner {



}
