package amazon.pages;

import amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricePage extends SearchPage{
    public PricePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//span[@class='a-size-base a-color-price a-color-price']")
    public WebElement bookPrice;

    @FindBy(xpath="//input[@id='add-to-cart-button']")
    public WebElement basketButton;

    @FindBy(xpath="//input[@id='add-to-cart-button']")
    public WebElement goToCard;

    @FindBy(xpath="(//span[@class='a-price-whole'])[1]")
    public WebElement basketPrice;

    @FindBy(xpath="(//span[@class='a-price-fraction'])[1]")
    public WebElement basketPrice1;
}
