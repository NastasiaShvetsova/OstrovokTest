import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginPageTest extends AbstractTest {

    @Test
    @DisplayName("Авторизация зарегистрированного пользователя")
    @Description("Проверка авторизации на сайте с использованием корректных исходных данных почты и пароля")
    @Severity(SeverityLevel.MINOR)
    void AuthorizationTest() {
        new MainPage(getDriver()).goToLoginPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Authorization();
        Assertions.assertEquals("jhj01002@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не авторизован !");
    }

    @Test
    @DisplayName("Регистрация нового пользователя по электронной почте")
    @Description("Проверка регистрации на сайте нового пользователя по электронной почте")
    @Severity(SeverityLevel.MINOR)
    void RegistrationByEmailTest(){
        new MainPage(getDriver()).goToLoginPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.RegistrationByEmail();
        Assertions.assertEquals("qad63793@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не зарегистрирован !");

    }
}
