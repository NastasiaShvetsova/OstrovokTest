import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(xpath = "//span[contains(.,'Зарегистрироваться')]")
        private WebElement registrationButton;

        @FindBy(name = "email")
        private WebElement email;

        @FindBy(name = "pass")
        private WebElement pass;

        @FindBy(css = ".Authorization-module__button--3aF30")
        private WebElement loginButton;

        @FindBy(css = ".Authorization-module__button--3aF30 > .Button-module__content--2FF16")
        private WebElement registrationButton2;

    public LoginPage Authorization() {
        email.click();
        email.sendKeys("jhj01002@cdfaq.com");
        pass.click();
        pass.sendKeys("155511Q.");
        loginButton.click();
        return this;
    }
    public LoginPage RegistrationByEmail() {
        registrationButton.click();
        email.click();
        email.sendKeys("qad63793@cdfaq.com");
        registrationButton2.click();
        return this;

    }
    }
