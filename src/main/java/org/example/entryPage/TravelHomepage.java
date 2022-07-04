package org.example.entryPage;

import org.example.componentPages.FooterNavigation;
import org.example.componentPages.HeaderNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomepage {
    By headersection = By.id("buttons");
    By footersection = By.id("traveller-home");

    WebDriver driver;

    public TravelHomepage(WebDriver driver) {
        this.driver=driver;
    }

    public void launchingUrl()
    {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
    public FooterNavigation footerNav() {

        return new FooterNavigation(driver, footersection);
    }

    public HeaderNavigation headerNav() {
        return new HeaderNavigation(driver,headersection);
    }


}
