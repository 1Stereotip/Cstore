package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BasketComparison extends BasicClass {

    String basket = "//span[@id='cart-widget-full-count'][text()='1']";
    String one = "1";

    @Допустим("^сравниевает что в карзине лежит (\\d+) товар$")
    public void сравниевает_что_в_карзине_лежит_товар(int arg1) throws Throwable {
        Assert.assertEquals(driver.getText(basket),one);
    }

    @Тогда("^пользователь нажимает на корзину$")
    public void пользователь_нажимает_на_корзину() throws Throwable {
        driver.click(basket);
        driver.close();
    }

}
