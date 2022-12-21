import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FooterPageTest extends AbstractTest {

    @Test
    @DisplayName("Кнопка 'База знаний' в футере")
    @Description("Возможность перехода на вкладку База знаний")
    @Severity(SeverityLevel.MINOR)
    void footerLedgeBaseButtonTest() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage
                .clickLedgeBaseButton();
        Assertions.assertEquals("База знаний", getDriver().getTitle(), "Не та страница");
    }
    @Test
    @DisplayName("Кнопка 'Контакты' в футере")
    @Description("Возможность перехода на вкладку Контакты")
    @Severity(SeverityLevel.MINOR)
    void footerContactButtonTest() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage
                .clickContactButton();
        Assertions.assertEquals("Контакты", getDriver().getTitle(), "Не та страница");
    }
}
