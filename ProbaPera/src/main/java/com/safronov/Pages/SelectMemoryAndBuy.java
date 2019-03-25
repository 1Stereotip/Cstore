package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;

public class SelectMemoryAndBuy extends BasicClass {

    String selectMemoryXpath = "//a[@class='b-pv__memory-url s-pv__memory'][text()='512GB']";
    String buyClick = "//a[@href='/order/add?product=4216325']";

    @Допустим("^выбирает максимальный объем памяти$")
    public void выбирает_максимальный_объем_памяти() throws Throwable {
        driver.click(selectMemoryXpath);
    }

    @Допустим("^нажимает кнопку \"([^\"]*)\"$")
    public void нажимает_кнопку(String arg1) throws Throwable {
        driver.click(buyClick);
    }
}
