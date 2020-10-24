package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends  DriverManager{

    //Redefinimos @override se coloca delante un método heredado
    // para sobrecargar (modificar) su comportamiento original
    @Override
    public void createDriver(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

    }

}
