import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleGoogleTest {
    WebDriver drv;

    @Before
    public void GoogleTest_setup() {
        WebDriverManager.chromedriver().setup();
        drv = new ChromeDriver();
    }

    @After
    public void googletest_cleanup() {

        drv.quit();
    }

    @Test
    public void googletest() {
        drv.get("https://www.seleniumhq.org/");
        drv.close();

    }
}