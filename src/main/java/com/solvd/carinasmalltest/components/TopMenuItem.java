package com.solvd.carinasmalltest.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopMenuItem extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class,'__link')]")
    private ExtendedWebElement menuItemLink;

    @FindBy(xpath = ".//*[contains(@class,'__text')]")
    private ExtendedWebElement menuItemName;

    public TopMenuItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void hoverMenuItemLink() {
        this.menuItemLink.hover();
    }

    public void clickMenuItemLink() {
        this.menuItemLink.click();
    }

    public String getMenuItemNameText() {
        return this.menuItemName.getText();
    }

}
