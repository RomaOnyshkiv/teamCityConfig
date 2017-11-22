import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWithGoogle extends AbstractPage {

    public SearchWithGoogle(WebDriver driver) {
        super(driver);
    }

    private By searchField = By.name("q");
    private By searchBtn = By.className("lsb");
    private By result = By.partialLinkText("dTest");


    SearchWithGoogle openPage(String url) {
        openURL(url);
        return this;
    }


    String getResult() {
        return getText(result);
    }

    SearchWithGoogle searchFor(String text) {
        typeTest(searchField, text);
        clickOn(searchBtn);
        return this;
    }
}
