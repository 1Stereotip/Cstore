package com.safronov.Pages;

import com.safronov.BasicClass;
import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasicClass {
   private String email = "Qazxc12345@yandex.ru";
   private String password = "Qazxc12345";
   String buttonEmail = "//input[@id='user-username']";
   String buttonPassword = "//input[@id='user-password']";
   String enter = "//div/button[@class='b-cstore-btn'][text()='Войти']";

    @Допустим("^вводит свой логин и пароль$")
    public void вводит_свой_логин_и_пароль() throws Throwable {
        driver.getElement(buttonEmail).sendKeys(email);
        driver.getElement(buttonPassword).sendKeys(password);
    }

    @Допустим("^нажимает клавишу \"([^\"]*)\"$")
    public void нажимает_клавишу(String arg1) throws Throwable {
        driver.click(enter);
    }
}
