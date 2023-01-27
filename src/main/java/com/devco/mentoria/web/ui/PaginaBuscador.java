package com.devco.mentoria.web.ui;

import net.serenitybdd.screenplay.questions.targets.*;
import net.serenitybdd.screenplay.targets.*;
import org.openqa.selenium.*;

public class PaginaBuscador {

    public static final Target BARRA_BUSQUEDA = Target.the("Barra de busqueda").located(By.xpath("//*[@title='Buscar']"));
    public static final Target SELECCION_WIKIPEDIA = Target.the("Seleccion de wikipedia").locatedBy("//div/a[contains(@href, 'wikipedia')]/h3");
    public static final Target TITULO_WIKIPEDIA =Target.the("Seleccion de titulo del tema en wikipedia").locatedBy("//h1/span[@class='mw-page-title-main']");

}
