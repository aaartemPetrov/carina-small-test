package com.solvd.carinasmalltest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinasmalltest.components.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='fast-search']//input[@type='text']")
    private ExtendedWebElement searchLine;

    @FindBy(xpath = "//*[@class='b-top-navigation']")
    private TopMenu topMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TopMenu getTopMenu() {
        return this.topMenu;
    }

}