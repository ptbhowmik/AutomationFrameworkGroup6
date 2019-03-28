package SupportInbox;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

    public class SupportInbox extends CommonAPI {

        @FindBy(how = How.XPATH,using = ".//*[@id='headerArea']/div/div[1]/div/div[1]/span")
        public WebElement pageHeading;
        public String pageHeadingText = "Support Inbox";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

