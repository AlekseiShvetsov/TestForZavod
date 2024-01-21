package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic_AuthPage {

  public final By TITLE = By.xpath("//p[text()]");

  public WebElement getTitle(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    return wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
  }
}