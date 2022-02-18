package com.solvd.carinasmalltest;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinasmalltest.components.NewsDropdownMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TemporaryComponents extends AbstractPage {

    //*[contains(@class,'b-main-navigation__item')][2]//*[@class='b-main-navigation__dropdown']
    @FindBy(xpath = "//*[@class='b-main-navigation__dropdown b-main-navigation__dropdown_visible']")
    private NewsDropdownMenu newsDropdownMenu;

    public TemporaryComponents(WebDriver driver) {
        super(driver);
    }

    public NewsDropdownMenu getNewsDropdownMenu() {
        return newsDropdownMenu;
    }

}
