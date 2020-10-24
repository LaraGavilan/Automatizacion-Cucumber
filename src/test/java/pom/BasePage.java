package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    //crear un atributo webdriver
    private WebDriver driver;

    //creamos un constructor para inicializar el driver, el this.driver hace
    //referencia al atributo driver y no al parametro driver
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //El parametro element nos dira si ese elemento esta en el dom.

    //  Este es con By elemento sin PageFactory
    public void click(By element) throws Exception {


        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clicklear sobre el elemento: " + element);
        }
    }
    // Este es con Web Element y con PageFactory
    public void click(WebElement element) throws Exception {


        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clicklear sobre el elemento: " + element);
        }
    }

    //  Este es con By elemento sin PageFactory
    public boolean isDisplayed(By element) throws Exception {

        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }

    // Este es con Web Element y con PageFactory
    public boolean isDisplayed(WebElement element) throws Exception {

        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }

    public String getText(By element) throws Exception {

        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    // Es es con Web Elemento con PageFactory
    public String getText(WebElement element) throws Exception {

        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }



    //Este getTitle no va a recibir ningun elemento porque el title corresponde
    //al driver y no a un elemento en particular.
    public String getTitle() throws Exception {

        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver: ");
        }
    }

}
