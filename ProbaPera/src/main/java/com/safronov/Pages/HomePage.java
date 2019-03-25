package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Если;
import org.openqa.selenium.WebElement;

public class HomePage extends BasicClass {

    String login = "//a[@href= '/user/login']";

    @Допустим("^пользователь открыл сайт Сстор$")
    public void пользователь_открыл_сайт_рестор() throws Throwable {
        driver.openPage("https://www.c-store.ru");
    }


    @Допустим("^нажимает на клавишу \"([^\"]*)\"$")
    public void нажимает_на_клавишу(String arg1) throws Throwable {
        driver.click(login);

    }

}
