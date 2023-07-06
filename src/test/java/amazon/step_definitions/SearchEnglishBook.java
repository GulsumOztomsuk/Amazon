package amazon.step_definitions;

import amazon.pages.SearchPage;
import amazon.utilities.BrowserUtils;
import amazon.utilities.ConfigurationReader;
import amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

public class SearchEnglishBook {

    SearchPage searchPage=new SearchPage();
    @When("User should navigate to amazon page")
    public void user_should_navigate_to_amazon_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        BrowserUtils.sleep(2);
    }
    @When("User should click to search box")
    public void user_should_click_to_search_box() {

       searchPage.searchBox.click();

        BrowserUtils.sleep(2);
    }
    @When("User should write {string} in search box")
    public void user_should_write_in_search_box(String string) {

        searchPage.searchBox.sendKeys(string);
        BrowserUtils.sleep(2);
    }
    @When("User should click to search button")
    public void user_should_click_to_search_button() {

        searchPage.searchButton.click();
        BrowserUtils.sleep(4);
    }
    @Then("User should click to any book")
    public void user_should_click_to_any_book(){
        Random random = new Random();
        int a=random.nextInt(25);
        searchPage.clickToBook(a);
    }

}
