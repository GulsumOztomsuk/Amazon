package amazon.step_definitions;

import amazon.pages.PricePage;
import amazon.pages.SearchPage;
import amazon.utilities.BrowserUtils;
import amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class CompareBookPrice {

    PricePage pricePage=new PricePage();
    SearchPage searchPage=new SearchPage();
    @When("User should click to search box1")
    public void user_should_click_to_search_box1() {
        searchPage.searchBox.click();
        BrowserUtils.sleep(2);

    }
    @When("User should write {string} in search box1")
    public void user_should_write_in_search_box1(String book) {

        searchPage.searchBox.sendKeys(book);
        BrowserUtils.sleep(2);
    }
    @When("User should click to search button1")
    public void user_should_click_to_search_button1() {

        searchPage.searchButton.click();
        BrowserUtils.sleep(2);
    }
    @When("User should click to a book")
    public void user_should_click_to_a_book() {

        Random random = new Random();
        int a=random.nextInt(25);
        searchPage.clickToBook(a);
    }
    @When("User should add the book in the basket")
    public void user_should_add_the_book_in_the_basket() {

        pricePage.goToCard.click();
        BrowserUtils.sleep(2);
    }
    @Then("User should compare the prices of the book with the price in the basket")
    public void user_should_compare_the_prices_of_the_book_with_the_price_in_the_basket() {

        String actualPrice=pricePage.basketPrice.getText()+","+ pricePage.basketPrice1.getText();

        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(2);
        String expectedPrice=pricePage.bookPrice.getText();

        Assert.assertEquals(expectedPrice, actualPrice);

    }

}
