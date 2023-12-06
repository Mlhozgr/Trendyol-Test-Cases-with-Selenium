package org.example;
import driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class BasePage {
    public static Logger logger = Logger.getLogger(BasePage.class.getName());

        WebDriver driver;
        WebDriverWait wait;

        public BasePage(){

            this.driver = Driver.webDriver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        public WebElement findElement(By locator){

            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            return driver.findElement(locator);
        }
        public List<WebElement> findElements(By locator){

            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            return driver.findElements(locator);
        }
        public void click(By locator){

            wait.until(ExpectedConditions.elementToBeClickable(locator));
            findElement(locator).click();
            logger.info("Successfully clicked to element.");
        }
        public void send_keys(By locator ,String text){

            findElement(locator).sendKeys(text);
            logger.info("Data successfully sent.");
        }
        public void randomProductSelect(By locator) {

            Random rand = new Random();
            findElements(locator).get(rand.nextInt(findElements(locator).size())).click();
        }


    public void assertionUrl(String text) {

            Assertions.assertEquals(text, driver.getCurrentUrl());
            logger.info("Successfully checked to url");
        }
        public void hover(By locator) {

            Actions actions = new Actions(driver);
            actions.moveToElement(findElement(locator)).build().perform();

        }



    }

