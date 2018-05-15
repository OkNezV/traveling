package com.onetwotrip.tests;

import com.onetwotrip.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Проверка, что при переходе на onetwotrip.com происходит редирект на www.onetwotrip.com
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class UrlRedirectDisplayTest extends BaseTestClass{

    @Test
    public void url_redirect_display_test(){

        MainPage mainPage = new MainPage(driver);

        // переход по ссылке <onetwotrip.com>
        driver.get("onetwotrip.com");

        // проверка, что страница загрузилась
        Assert.assertTrue("Главаня страница сайта не отображается",
                mainPage.isMainPagePresent());

        // проверка, что произошел редирект на <www.onetwotrip.com>
        Assert.assertTrue("URL страницы отличается от ожидаемого",
                driver.getCurrentUrl().startsWith("https://www.onetwotrip.com"));
    }
}
