package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic_AuthPage {

  public final By TITLE = By.xpath("//p[text()]");

  public WebElement getTitle(WebDriver driver) {
    return driver.findElement(TITLE);
  }
}