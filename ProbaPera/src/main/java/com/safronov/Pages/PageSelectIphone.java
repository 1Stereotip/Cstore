package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;

public class PageSelectIphone extends BasicClass {
    String selectIphone = "//a[@href='/apple/iphone/iphone-xs']";

    @Допустим("^выбирает iPhone xs$")
    public void выбирает_iPhone_xs() throws Throwable {
        driver.click(selectIphone);
    }
}
