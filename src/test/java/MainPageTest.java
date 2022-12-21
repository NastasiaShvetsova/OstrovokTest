import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {
    //смена на en
    @Test
    @DisplayName("Переключение языка сайта на английский")
    @Description("Показать возможность переключения языка сайта на аглийский")
    @Severity(SeverityLevel.MINOR)
    void changeLanguageTest(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .clickChangeLanguage();
        Assertions.assertEquals("Ostrovok.ru — online hotel booking", getDriver().getTitle(), "Error language !");
    }
}
