package Cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SavePromocodeCase3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://ostrovok.ru/");

        // Войти, как авторизованный пользователь
        WebElement webElement1 = driver.findElement(By.cssSelector(".Control-module__arrowIcon--1g5ir"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.name("email"));
        webElement2.click();
        webElement2.sendKeys("jhj01002@cdfaq.com");

        WebElement webElement3 = driver.findElement(By.name("pass"));
        webElement3.click();
        webElement3.sendKeys("155511Q.");

        WebElement webElement4 = driver.findElement(By.cssSelector(".Authorization-module__button--3aF30"));
        webElement4.click();
        Thread.sleep(1000);

        //Сохранение промокода
        WebElement webElement5 = driver.findElement(By.cssSelector(".Widgets-module__widgets--Vw5UH > div:nth-child(6) > div > div"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath("//button[contains(.,'Сохранить промокод')]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.name("promocode"));
        webElement7.click();
        webElement7.sendKeys("BESTFIRST");

        WebElement webElement8 = driver.findElement(By.cssSelector(".zen-promopopup-button"));
        webElement8.click();

        // driver.quit();
    }
}

