package Paths;

import org.openqa.selenium.By;

public class locators {
    public static String HOMEPAGE = "https://www.trendyol.com/";
    public static final By GENDER_CLOSE = By.cssSelector("#gender-popup-modal > div > div > div.modal-close");
    public static String EMAIL = "loginScenarioswithTrend@protonmail.com";
    public static String PASSWORD = ")Ts+&g-nf5NT";
    public static final By EMAIL_FIELD = By.cssSelector("#login-email");
    public static final By PASSWORD_FIELD = By.id("login-password-input");
    public static final By LOGIN = By.cssSelector("div.link.account-user > p");
    public static final By LOGIN_BUTTON = By.className("login-button");
    public static final By SUBMIT = By.cssSelector("div.q-layout.login > form > button");
    public static final By SEARCH_BOX = By.cssSelector("div.N4M8bfaJ > input");
    public static final By SEARCH_BUTTON = By.cssSelector("div.N4M8bfaJ > i");
    public static String PRODUCT = "laptop";
    public static final By PRODUCT_LIST = By.cssSelector(".image-overlay-body");
    public static final By ADD_to_BASKET = By.cssSelector("[data-testid='add-to-cart-button'] span:nth-child(1)");
    public static final By ERR_MESSAGE = By.cssSelector("#error-box-wrapper > span.message");
    public static final By GO_to_BASKET = By.cssSelector(".link .account-basket");
    public static final By HOME_PRICE = By.xpath("product-detail-app > div > div.sticky-header > div > div.sticky-product-info > div > div > div > span");
    public static final By BASKET_PRICE = By.xpath("pb-container > div > div.pb-merchant-group > div.pb-basket-item-wrapper-v2 > div > div.pb-basket-item-actions > div > div.pb-basket-item-price-and-badge > div > div");
     // public static final By TOOLTIP = By.cssSelector("pb-container > div > div.pb-merchant-group > div.pb-basket-item-wrapper-v2 > div > div.pb-basket-item-details > div > div > div:nth-child(3) > div > div > div > button");

}

