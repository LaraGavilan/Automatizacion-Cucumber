package runner.browser_manager;

import org.openqa.selenium.WebDriver;


//Clase Abstracta
public abstract class DriverManager {

    //Variable protegida que vamos a instanciar
    protected WebDriver driver;
    //Metodo abtracto que lo vamos a implementar en los distintos navegadores
    protected abstract void createDriver();

    //Crear 2 metodos para cerrar y obetener la instancia del driver.

    //1.Crear un Metodo publico para cerrar la instancia del driver.

    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    //2.Crear un Metodo publico para obtener la instancia del driver.

    public WebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }

}
