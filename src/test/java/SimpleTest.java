import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SimpleTest extends BaseTest{

    private final String URL = "https://www.google.com";
    private String searchQuery = "";

    @Test
    public void simpleTest() {
        SearchWithGoogle search = PageFactory.initElements(driver, SearchWithGoogle.class);

        assertTrue(search
                .openPage(URL)
                .searchFor("test")
                .getResult()
                .contains("dTest"));

    }

}
