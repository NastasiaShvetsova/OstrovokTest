import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginPageTest extends AbstractTest {

    @Test
    void AuthorizationTest() {
        new MainPage(getDriver()).goToLoginPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Authorization();
        Assertions.assertEquals("jhj01002@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не авторизован !");
    }

    @Test
    void RegistrationByEmailTest(){
        new MainPage(getDriver()).goToLoginPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.RegistrationByEmail();
        Assertions.assertEquals("qad63793@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не зарегистрирован !");

    }
}
