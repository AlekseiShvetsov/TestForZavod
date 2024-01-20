package tests;

import static org.junit.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Basic_AuthPage;
import services.AuthorizationService;

public class AuthorizationTest {

  AuthorizationService authorizationService = new AuthorizationService();
  Basic_AuthPage basicAuthPage = new Basic_AuthPage();

  @Test
  public void checkAuthentication() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    authorizationService.openAuthorizationPage(driver);

    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement titleElement = wait.until(
        ExpectedConditions.visibilityOfElementLocated(basicAuthPage.TITLE));

    String expectTitle = "Congratulations! You must have the proper credentials.";
    String actualTitle = basicAuthPage.getTitle(driver).getText();

    assertEquals("Заголовок страницы не совпадает", expectTitle, actualTitle);
    driver.quit();
  }
}