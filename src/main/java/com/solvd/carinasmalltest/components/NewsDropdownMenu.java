package com.solvd.carinasmalltest.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class NewsDropdownMenu extends AbstractUIObject {

    @FindBy(xpath = ".//a[contains(@class,'title-link')]")
    private List<ExtendedWebElement> newsCategories;
    @FindBy(xpath = ".//li")
    private List<NewsPromo> newsPromos;

    public NewsDropdownMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<NewsPromo> getNewsPromos() {
        return this.newsPromos;
    }

}
