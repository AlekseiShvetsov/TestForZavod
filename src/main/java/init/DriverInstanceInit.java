package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInstanceInit {

  public WebDriver driver;

  public WebDriver getInstance() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    return driver;
  }

  public void closeBrowser() {
    driver.quit();
  }
}