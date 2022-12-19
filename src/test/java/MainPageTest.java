import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {
    //смена на en
    @Test
    void changeLanguageTest(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .clickChangeLanguage();
        Assertions.assertEquals("Ostrovok.ru — online hotel booking", getDriver().getTitle(), "Error language !");
    }
}
