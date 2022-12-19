import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class PromocodeTest extends AbstractTest {

    @Test
    void PromocodeSaveTest() {
        new MainPage(getDriver()).goToLoginPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Authorization();
        Assertions.assertEquals("jhj01002@cdfaq.com", getDriver().findElement(By.cssSelector(".Control-module__username--3qcGq")).getText().toLowerCase(), "Пользователь не авторизован !");

        new MainPage(getDriver()).goToHamburgerMenu();
        new MainPage(getDriver()).goToSavecCodeButton();
        PromocodePage promocodePage = new PromocodePage(getDriver());
        promocodePage
                .SaveCode();
    }
}
