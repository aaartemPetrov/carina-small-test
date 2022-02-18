package com.solvd.carinasmalltest;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carinasmalltest.components.NewsPromo;
import com.solvd.carinasmalltest.components.TopMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.List;

public class OnlinerTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(OnlinerTest.class);

    @Test
    public void checkTopMenuNewsPromoTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        TopMenu topMenu = homePage.getTopMenu();
        topMenu.hoverOnItemByName("новости");

        TemporaryComponents temporaryComponents = new TemporaryComponents(getDriver());
        List<NewsPromo> newsPromos = temporaryComponents.getNewsDropdownMenu().getNewsPromos();
        newsPromos.forEach(newsPromo -> LOGGER.info(newsPromo.getPromoText()));
    }

}
