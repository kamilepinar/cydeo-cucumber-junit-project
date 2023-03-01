package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports.html","rerun:target/rerun.txt",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",//from content root(copy path)
        glue = "com/cydeo/step_definitions", //copy from source root
        dryRun = false,
        tags = "@librarian",
        publish = true

)
public class CukesRunner { }
