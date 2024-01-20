package services;

import org.openqa.selenium.WebDriver;

public class AuthorizationService {

  public void openAuthorizationPage(WebDriver driver) {
    String login = "admin";
    String password = "admin";

    driver.get("https://" + login + ":" + password + "@the-internet.herokuapp.com/basic_auth");
  }
}