package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    // 1.Crear un metodo que se ejecute antes de cada escenario.

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    // 2.Crear un metodo que se ejecute despues de cada escenario.

    @After

    public void tearDown(){
        System.out.println("El escenario nro: " + numberOfCase + " se ejecutó corecctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
