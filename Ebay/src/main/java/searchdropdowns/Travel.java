package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Travel extends CommonAPI {

    public Travel(){

        PageFactory.initElements (driver, this);
    }

    public void TravelPage(){
        driver.findElement (By.id ("gh-ac")).sendKeys ("luggage");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("3252");
        driver.findElement (By.id ("gh-btn")).click ();
    }

}
