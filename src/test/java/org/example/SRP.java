package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.entryPage.TravelHomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SRP {
    WebDriver driver;
    @Test
    public void demo()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        TravelHomepage homepage=new TravelHomepage(driver);
        homepage.launchingUrl();
        System.out.println("Footer Attribute: "+homepage.footerNav().getFooterFlightAttribute());
        homepage.footerNav().anchorTagsize();
        System.out.println("Header Attribute: "+homepage.headerNav().getHeaderFlightAttribute());
       homepage.headerNav().anchorTagsize();
        //Footer -- group-traveller
        //header -- selected



    }

}
