package Cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebsiteTranslationCase4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://ostrovok.ru");


        WebElement webElement1 = driver.findElement(By.cssSelector(".LanguageWidget-module__value--3EPLn"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.cssSelector(".LanguageWidget-module__item--1yC8C:nth-child(1)"));
        webElement2.click();

        // driver.quit();
    }
}
