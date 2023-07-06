package amazon.pages;

import amazon.utilities.BrowserUtils;
import amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   /*@FindBy(xpath = "//a[@id='sp-cc-rejectall-link']")
    public WebElement popUp;

    */
    @FindBy(xpath = "//input[@placeholder='Search Amazon']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(xpath="//img[@data-image-index='1']")
    public WebElement bookLocator;

    public void clickToBook(int bookindex) {
        String bookLocator = "//img[@data-image-index='" + bookindex + "']";
        Driver.getDriver().findElement(By.xpath(bookLocator)).click();
        BrowserUtils.sleep(2);
    }

    }
