package com.safronov;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
// Класс - обертка
public class WDriver {

    public static WDriver driver;
    //Экземпляр вебдрайвера для браузера Хром
    public static ChromeDriver chromeDriver;
    //объект для явного ожидания некоторого условия
    private WebDriverWait wait;
    /*
     * Экземпляр класса-обертки вебдрайвера, построена с использованием паттерна Singleton,
     * создается только один экземпляр класса на всю программу, доступ через метод getInstance()
     */
    public static WDriver getInstance(){
        if(driver == null){
            driver = new WDriver();
        }return driver;
    }
    private WDriver(){
    //установка пути до исполняемого файла вебдрайвера
    System.setProperty("webdriver.chrome.driver","bin/chromedriver.exe");
    chromeDriver = new ChromeDriver();
    //Делаем браузер во весь экран
    chromeDriver.manage().window().maximize();
    //устанавливаем таймаут на поиск элемента на веб странице
    chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wait = new WebDriverWait(chromeDriver,10,3000);
    }

    //передаем xpath и задаем цикл в случае НЕ обноружении xpath-а
    public WebElement getElement(String xpath){
    WebElement element = null;
    for(int i = 0; i < 5; i++){
    try {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return element;
    }catch (StaleElementReferenceException e){
        System.out.println("Ошибка в блоке Catch");
        continue;
            }
        }return element;
    }
    //метод открытия страницы
    public void openPage(String url){
    chromeDriver.get(url);
    }

    //метод клика по объекту
    public void click(String xpath){
    WebElement element = driver.getElement(xpath);
    element.click();
    }
    //метод для сравнения
    public String getText(String xpath){
        return driver.getElement(xpath).getText();
    }
    //Закрываем окно
    public void close(){
        chromeDriver.close();
    }

}

