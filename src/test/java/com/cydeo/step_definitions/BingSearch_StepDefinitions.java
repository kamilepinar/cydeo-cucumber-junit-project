package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import javax.swing.*;

public class BingSearch_StepDefinitions {
    BingSearchPage bingSearchPage = new BingSearchPage();// object in class level
    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");

    }
    @When("user enters orange in Bing search box")
    public void user_enters_orange_in_bing_search_box() {
        BrowserUtils.sleep(10);
        bingSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
        BrowserUtils.sleep(10);

    }
    @When("user should see orange in title")
    public void user_should_see_orange_in_title() {
        BrowserUtils.sleep(10);
        BrowserUtils.verifyTitle("orange - Search");

    }

    @When("user enters {string} in Bing search box")
    public void userEntersInBingSearchBox(String SearchKey) {
        BrowserUtils.sleep(7);
        bingSearchPage.searchBox.sendKeys(SearchKey + Keys.ENTER);

    }

    @Then("user should see {string} in title")
    public void userShouldSeeInTitle(String expectedTitle) {
        BrowserUtils.sleep(8);
        BrowserUtils.verifyTitle(expectedTitle);
        //BrowserUtils.verifyTitleContains(expectedTitle) sadece bir kelime icinde varsa bakabilmesi icin yoksa feature file a aynisini koyman gerek
    }
}
