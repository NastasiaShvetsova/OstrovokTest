import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooterPageTest extends AbstractTest {

    @Test
    void footerLedgeBaseButtonTest() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage
                .clickLedgeBaseButton();
        Assertions.assertEquals("База знаний", getDriver().getTitle(), "Не та страница");
    }
    @Test
    void footerContactButtonTest() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage
                .clickContactButton();
        Assertions.assertEquals("Контакты", getDriver().getTitle(), "Не та страница");
    }
}
