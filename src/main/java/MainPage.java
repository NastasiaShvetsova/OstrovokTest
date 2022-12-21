import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".Control-module__arrowIcon--1g5ir")
    private WebElement login;

    @FindBy(css = ".LanguageWidget-module__value--3EPLn")
    private WebElement changeLanguage;

    @FindBy(css = ".LanguageWidget-module__item--1yC8C:nth-child(1)")
    private WebElement enLanguage;

    @FindBy(css = ".Widgets-module__widgets--Vw5UH > div:nth-child(6) > div > div")
    private WebElement hamburgerMenu;


    @FindBy(xpath = "//button[contains(.,'Сохранить промокод')]")
    private WebElement saveCodeButton;

    public void goToLoginPage() {
        login.click();
    }

    public void clickChangeLanguage() {
        changeLanguage.click();
        enLanguage.click();
    }

    public void goToHamburgerMenu() {
        hamburgerMenu.click();
    }
    public void goToSavecCodeButton() {
        saveCodeButton.click();
    }
}

