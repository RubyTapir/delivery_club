package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest1 () {
        driver.get("https://favoritefood.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды Минск | Суши | Пицца | Шашлык | Бургеры"));
    }

    @Test
    public void firstTest2 () {
        driver.get("https://favoritefood.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды Минск | Суши | Пицца | Шашлык | Бургеры"));
    }

}
