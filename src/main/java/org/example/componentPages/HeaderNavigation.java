package org.example.componentPages;

import org.example.abstractPages.GenericAbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNavigation extends GenericAbstractClass {
    By flightsHeader=By.cssSelector("[title=\"Flights\"]");
    public HeaderNavigation(WebDriver driver, By headersection) {
        super(driver,headersection);
    }
    public String getHeaderFlightAttribute()
    {
        return findCustomElement(flightsHeader).getAttribute("class");
    }
    By anchorTag=By.tagName("a");
    public void anchorTagsize()
    {
          anchorTaglocator(anchorTag);
    }
}
