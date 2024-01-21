package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import init.DriverInstanceInit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Basic_AuthPage;
import services.AuthorizationService;

public class AuthorizationTest {

  AuthorizationService authorizationService = new AuthorizationService();
  Basic_AuthPage basicAuthPage = new Basic_AuthPage();
  DriverInstanceInit driverInstanceInit = new DriverInstanceInit();

  @BeforeEach
  public void setUp() {
    driverInstanceInit.getInstance();
    authorizationService.openAuthorizationPage(driverInstanceInit.driver);
  }

  @AfterEach
  public void closeUp() {
    driverInstanceInit.closeBrowser();
  }

  @Test
  public void checkAuthentication() {

    WebDriverWait wait = new WebDriverWait(driverInstanceInit.driver, 10);
    WebElement titleElement = wait.until(
        ExpectedConditions.visibilityOfElementLocated(basicAuthPage.TITLE));

    String expectTitle = "Congratulations! You must have the proper credentials.";
    String actualTitle = basicAuthPage.getTitle(driverInstanceInit.driver).getText();

    assertEquals(expectTitle, actualTitle, "Заголовок страницы не совпадает");
  }
}