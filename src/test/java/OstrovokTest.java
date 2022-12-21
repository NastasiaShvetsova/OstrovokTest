import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OstrovokTest extends AbstractTest {

    @Test
    void AuthorizationTest() {
        WebElement webElement1 = getDriver().findElement(By.cssSelector(".Control-module__arrowIcon--1g5ir"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.name("email"));
        webElement2.click();
        webElement2.sendKeys("jhj01002@cdfaq.com");

        WebElement webElement3 = getDriver().findElement(By.name("pass"));
        webElement3.click();
        webElement3.sendKeys("155511Q.");

        WebElement webElement4 = getDriver().findElement(By.cssSelector(".Authorization-module__button--3aF30"));
        webElement4.click();
        Assertions.assertEquals("jhj01002@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не авторизован !");
    }

    @Test
    void RegistrationByEmailTest() {
        WebElement webElement1 = getDriver().findElement(By.cssSelector(".Control-module__arrowIcon--1g5ir"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//span[contains(.,'Зарегистрироваться')]"));
        webElement2.click();
        Assertions.assertEquals("Зарегистрироваться", webElement2.getText());

        WebElement webElement3 = getDriver().findElement(By.name("email"));
        webElement3.click();
        webElement3.sendKeys("wun48327@nezid.com");

        WebElement webElement4 = getDriver().findElement(By.cssSelector(".Authorization-module__button--3aF30 > .Button-module__content--2FF16"));
        webElement4.click();
    }

    @Test
    void WebsiteTranslationTest() {
        // смена на en
        WebElement webElement1 = getDriver().findElement(By.cssSelector(".LanguageWidget-module__value--3EPLn"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.cssSelector(".LanguageWidget-module__item--1yC8C:nth-child(1)"));
        webElement2.click();
        Assertions.assertEquals("Ostrovok.ru — online hotel booking", getDriver().getTitle(), "Error language !");
    }

    @Test
    void SavePromocodeTest() throws InterruptedException {
        // Войти, как авторизованный пользователь
        WebElement webElement1 = getDriver().findElement(By.cssSelector(".Control-module__arrowIcon--1g5ir"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.name("email"));
        webElement2.click();
        webElement2.sendKeys("jhj01002@cdfaq.com");

        WebElement webElement3 = getDriver().findElement(By.name("pass"));
        webElement3.click();
        webElement3.sendKeys("155511Q.");

        WebElement webElement4 = getDriver().findElement(By.cssSelector(".Authorization-module__button--3aF30"));
        webElement4.click();
        Assertions.assertEquals("jhj01002@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не авторизован !");
        Thread.sleep(1000);

        //Сохранение промокода
        WebElement webElement5 = getDriver().findElement(By.cssSelector(".Widgets-module__widgets--Vw5UH > div:nth-child(6) > div > div"));
        webElement5.click();

        WebElement webElement6 = getDriver().findElement(By.xpath("//button[contains(.,'Сохранить промокод')]"));
        webElement6.click();

        WebElement webElement7 = getDriver().findElement(By.name("promocode"));
        webElement7.click();
        webElement7.sendKeys("BESTFIRST");

        WebElement webElement8 = getDriver().findElement(By.xpath("//button[contains(.,'Сохранить в «Личном кабинете»')]"));
        webElement8.click();
        Assertions.assertEquals("Сохранить в «Личном кабинете»", webElement8.getText());
    }

    @Test
    void KnowledgeBaseButtonTest() {
        Actions action = new Actions(getDriver());

        action.scrollToElement(getDriver().findElement(By.cssSelector(".Footer__footer--224Gi")))
                .click(getDriver().findElement(By.xpath(".//a[contains(text(),'База знаний')]")))
                .build()
                .perform();
        Assertions.assertEquals("База знаний", getDriver().getTitle(), "Не та страница");
    }

    @Test
    void ContactsButtonTest() {
        Actions action = new Actions(getDriver());

        action.scrollToElement(getDriver().findElement(By.cssSelector(".Footer__footer--224Gi")))
                .click(getDriver().findElement(By.xpath("//a[contains(text(),'Контакты')]")))
                .build()
                .perform();
        Assertions.assertEquals("Контакты", getDriver().getTitle(), "Не та страница");
    }
}

