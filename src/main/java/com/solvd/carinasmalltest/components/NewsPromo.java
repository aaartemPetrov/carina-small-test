package com.solvd.carinasmalltest.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewsPromo extends AbstractUIObject {

    @FindBy(xpath = ".//a[contains(@class, 'link')]")
    private ExtendedWebElement promoText;

    public NewsPromo(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getPromoText() {
        return this.promoText.getText();
    }

}
