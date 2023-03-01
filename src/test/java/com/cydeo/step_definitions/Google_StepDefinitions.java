package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("Https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("users searches for {word}")
    public void users_searches_for_apple(String word) {
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);


    }
    @Then("user should see {word} in the title")
    public void user_should_see_apple_in_the_title(String word) {//if you have 2 different you will have 2 argument if 3=3 4=4
        BrowserUtils.verifyTitle(word+" - Google Search");
        BrowserUtils.verifyTitleContains("apple");

    }

}
//order in step def does not matter it will go read from features order
// Write code here that turns the phrase above into concrete actions
// throw new io.cucumber.java.PendingException();