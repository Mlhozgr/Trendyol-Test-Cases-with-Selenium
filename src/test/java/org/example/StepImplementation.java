package org.example;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;
import static Paths.locators.*;

public class StepImplementation  {
    public static Logger logger = Logger.getLogger(StepImplementation.class.getName());
    BasePage basePage;
    public StepImplementation() {
        basePage = new BasePage();
    }
    @Step("Navigate to HomePage")
    public void navigateTrendyol() {
        String url = "https://www.trendyol.com/";
        basePage.driver.get(url);
        logger.info("Successfully entered to main page.");
        basePage.assertionUrl(url);
    }
    @Step("Pass Gender Pop-up")
    public void closeGenderPopup() {
        basePage.click(GENDER_CLOSE);
    }
    @Step("Login")
    public void unsuccessfulLoginAttempt() {
        basePage.hover(LOGIN);
        basePage.click(LOGIN_BUTTON);
        basePage.send_keys(EMAIL_FIELD,EMAIL);
        basePage.send_keys(PASSWORD_FIELD,PASSWORD);
        basePage.click(SUBMIT);
        String errorMessage=basePage.findElement(ERR_MESSAGE).getText();
        Assertions.assertEquals(errorMessage,"E-posta adresiniz ve/veya şifreniz hatalı.");
        logger.info("Unsuccessfull Login Attempt");


    }
    @Step("Search Product")
    public void SearchProduct() {
        basePage.click(SEARCH_BOX);
        basePage.send_keys(SEARCH_BOX,PRODUCT);
        basePage.click(SEARCH_BUTTON);
        logger.info("A product successfully searched ");

    }
    @Step("Add to Basket")
    public void addToBasket() {
        //basePage.randomProductSelect(UPPER_THRESHOLD,LOWER_THRESHOLD);
        basePage.randomProductSelect(PRODUCT_LIST);
        logger.info("A product has been selected.");
        basePage.click(ADD_to_BASKET);
        logger.info("A product has been added to basket.");
        basePage.click(GO_to_BASKET);
        Assertions.assertEquals(HOME_PRICE,BASKET_PRICE );

    }










}
