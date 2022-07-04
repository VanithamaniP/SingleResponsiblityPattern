package org.example.componentPages;

import org.example.abstractPages.GenericAbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterNavigation extends GenericAbstractClass {


    WebDriver driver;
    public FooterNavigation(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);
    }
    By flightsFooter=By.cssSelector("[title=\"Flights\"]");
    public String getFooterFlightAttribute()
    {
       return findCustomElement(flightsFooter).getAttribute("class");
    }
    By anchorTag=By.tagName("a");
    public void anchorTagsize()
    {
        anchorTaglocator(anchorTag);
    }
}
