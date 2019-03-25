package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;

public class PageIphoneXs extends BasicClass {

    String clickOneProduct = "//span[@itemprop='name'][text()='Apple iPhone XS 256GB (золотистый)']";

    @Допустим("^кликает на первый товар$")
    public void кликает_на_первый_товар() throws Throwable {
        driver.click(clickOneProduct);
    }
}
