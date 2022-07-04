package org.example.abstractPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenericAbstractClass {


    WebElement sectionElement;
    public GenericAbstractClass(WebDriver driver, By sectionElement) {

        this.sectionElement=driver.findElement(sectionElement);
    }
    public WebElement findCustomElement(By flightlocator)
    {

        return sectionElement.findElement(flightlocator);
    }
    public void anchorTaglocator(By anchors)
    {
        System.out.println(sectionElement);
        System.out.println(sectionElement.findElements(anchors).size());
    }

}
