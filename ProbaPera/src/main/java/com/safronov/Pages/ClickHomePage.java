package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;

public class ClickHomePage extends BasicClass {

        String homePageCstoreXpath = "//div[@class='b-header-logo__left']";

    @Допустим("^потои нажимает на кнопку \"([^\"]*)\"$")
    public void потои_нажимает_на_кнопку(String arg1) throws Throwable {
        driver.click(homePageCstoreXpath);
    }
}
