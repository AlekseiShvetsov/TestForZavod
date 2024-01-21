package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInstanceInit {

  public WebDriver driver;

  public void getInstance() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  public void closeBrowser() {
    driver.quit();
  }
}