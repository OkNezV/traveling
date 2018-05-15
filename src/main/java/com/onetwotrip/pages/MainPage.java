package com.onetwotrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Описание главной страницы <onetwotrip.com>
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    String mainPageSelector = "[id='layout_panels']";

    /**
     * Проверяется, что страница открыта (наличие блока с вариантами выбора для путешествий)
     * @return true/false
     */
    public boolean isMainPagePresent() {
        return waitForElementPresent(By.cssSelector(mainPageSelector));
    }
}
