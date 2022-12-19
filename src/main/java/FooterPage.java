import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends AbstractPage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".Footer__footer--224Gi")
    private WebElement footer;

    @FindBy(xpath = ".//a[contains(text(),'База знаний')]")
    private WebElement ledgeBaseButton;

    @FindBy(xpath = "//a[contains(text(),'Контакты')]")
    private WebElement contactsButton;

    public FooterPage clickLedgeBaseButton() {
        Actions action = new Actions(getDriver());
        action.scrollToElement(this.footer)
                .click(this.ledgeBaseButton)
                .build()
                .perform();

        return this;
    }

    public FooterPage clickContactButton() {
        Actions action = new Actions(getDriver());
        action.scrollToElement(this.footer)
                .click(this.contactsButton)
                .build()
                .perform();

        return this;

    }
}


