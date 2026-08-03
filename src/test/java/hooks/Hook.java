package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Hook {
    public static WebDriver driver;
    FirefoxOptions options = new FirefoxOptions();


    @Before
    public void setUp(){
        System.out.println("Configurando el entorno de pruebas");
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            options.addArguments("--headless");
            options.addArguments("--width=1920");
            options.addArguments("--height=1080");
        }
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Terminando los procesos");

        if (driver != null) {

            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot, "image/png", "Screenshot");
            }

            driver.quit();
        }
    }
}
