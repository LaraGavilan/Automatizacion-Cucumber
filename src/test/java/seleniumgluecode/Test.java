package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends TestBase{

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
    Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobe el boton The little teater comics$")
    public void hace_click_sobe_el_boton_The_little_teater_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnTitleComics();

        /*
        System.out.println("ELEMENTO: " + homePage.titleComisLocator);
        homePage.titleComisLocator.click();

        //non cached element
        long NoCache_StartTime = System.currentTimeMillis();
        for (int i=0; i<500; i++)
        {
            homePage.titleComisLocatorNotCached.getTagName();
        }
        long NoCache_EndTime = System.currentTimeMillis();
        long NoCache_TotalTime = (NoCache_EndTime-NoCache_StartTime)/1000;
        System.out.println("Tiempo de respuesta sin cachear title " + NoCache_TotalTime + " segundos");

        //cached  element

        long Cache_StartTime = System.currentTimeMillis();
        for (int i=0; i<500; i++)
        {
            homePage.titleComisLocatorNotCached.getTagName();
        }
        long Cache_EndTime = System.currentTimeMillis();
        long Cache_TotalTime = (Cache_EndTime-Cache_StartTime)/1000;
        System.out.println("Tiempo de respuesta sin cachear title " + Cache_TotalTime + " segundos");

       */
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", comicsPage.isTitleComicsDisplayed());
    }
}
