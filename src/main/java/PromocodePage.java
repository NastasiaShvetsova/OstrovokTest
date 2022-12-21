import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromocodePage extends AbstractPage {

    public PromocodePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "promocode")
    private WebElement promocode;

    @FindBy(xpath = "//button[contains(.,'Сохранить в «Личном кабинете»')]")
    private WebElement saveLkButton;

    public PromocodePage SaveCode() {
        promocode.click();
        promocode.sendKeys("BESTFIRST");
        saveLkButton.click();
        return null;
    }
}
