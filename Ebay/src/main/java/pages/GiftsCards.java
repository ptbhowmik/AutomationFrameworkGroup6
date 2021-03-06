package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class GiftsCards extends CommonAPI {

    public GiftsCards()

    {
        PageFactory.initElements (driver, this);
    }

    @FindBy(css = "#gh-p-4 > a")
    WebElement giftcards;

    @FindBy(css = "#w1-w0 > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
    WebElement digital;

    @FindBy(css = "#w5-xCarousel-x-carousel-items > ul > li:nth-child(1) > a > p")
    WebElement under35;


    public WebElement GiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return giftcards;}

    public WebElement DigitalCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return digital;}

    public WebElement Under35Cards() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return under35;}



    public void GiftCardsPage(){
        GiftCards ().click ();
        DigitalCards ().click ();
        Under35Cards ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Digital Gifts & Coupons for sale | eBay");
    }

    public void GiftCardsPage2(){
        GiftCards ().click ();
        DigitalCards ().click ();
        Under35Cards ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Digital Gifts & Coupons for sale | eBay");
    }
}