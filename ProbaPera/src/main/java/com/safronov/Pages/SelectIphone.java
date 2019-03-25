package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;

public class SelectIphone extends BasicClass {

    String selectIphoneXpath = "//a[@href='/apple/iphone'][@class='s-menu-hover']";

    @Допустим("^нажимает вкладку iPhone$")
    public void нажимает_вкладку_iPhone() throws Throwable {
        driver.click(selectIphoneXpath);
    }
}
