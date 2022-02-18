package com.solvd.carinasmalltest.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Locale;

public class TopMenu extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class,'b-main-navigation__item')]")
    private List<TopMenuItem> topMenuItems;

    @FindBy(xpath = ".//*[contains(@class,'b-main-navigation__item')][2]//*[@class='b-main-navigation__dropdown']")
    private NewsDropdownMenu newsDropdownMenu;

    public TopMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void hoverOnItemByName(String name) {
        this.topMenuItems.stream()
                .filter(topMenuItem -> {
                    System.out.println(topMenuItem.getMenuItemNameText());
                    return name.toLowerCase(Locale.ROOT).equals(
                            topMenuItem.getMenuItemNameText().toLowerCase(Locale.ROOT));
                })
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("There is no item \"%s\" in top menu.", name)))
                .hoverMenuItemLink();

        new WebDriverWait(getDriver(), 2).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='b-main-navigation__dropdown b-main-navigation__dropdown_visible']")));
    }

    public void clickOnItemByName(String name) {
        this.topMenuItems.stream()
                .filter(topMenuItem -> name.toLowerCase(Locale.ROOT).equals(
                        topMenuItem.getMenuItemNameText().toLowerCase(Locale.ROOT)))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("There is no item \"%s\" in top menu.", name)))
                .clickMenuItemLink();
    }

    public NewsDropdownMenu getNewsDropdownMenu() {
        return newsDropdownMenu;
    }

}
