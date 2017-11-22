import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AbstractPage {

    private WebDriver driver;
    private WebElement element;

    AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    void openURL(String url) {
        driver.get(url);
    }

    void typeTest(By by, String text) {
        localElement(by).sendKeys(text);
    }

    void clickOn(By by) {
        localElement(by).click();
    }

    String getText(By by) {
        return localElement(by).getText();
    }




    private WebElement localElement(By by){
        return driver.findElement(by);
    }

}
