package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy(id = "menu-item-2008")
    public WebElement titleComisLocatorNotCached;

    @FindBy(id = "menu-item-2008")
    @CacheLookup
    public WebElement titleComisLocator;

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";


    //Contsructor que es extendido de BasePage
    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnTitleComics() throws Exception {
        //El click es el metodo que creamos en BasePage
        this.click(titleComisLocator);

    }

    public boolean homePageIsDisplayed() throws Exception {
        //El getTitle es el metodo que creamos en BasePage
        return this.getTitle().equals(titleHomePage);
    }

}
