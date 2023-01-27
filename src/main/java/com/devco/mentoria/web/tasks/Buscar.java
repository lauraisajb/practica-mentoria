package com.devco.mentoria.web.tasks;

import com.devco.mentoria.web.ui.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.*;

public class Buscar {

    public static Performable enGoogle(String texto) {
        return Task.where("{0} busca en google la palabra " + texto, actor ->
                actor.attemptsTo(
                        Open.url("https://www.google.com"),
                        Enter.theValue(texto).into(PaginaBuscador.BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                        Click.on(PaginaBuscador.SELECCION_WIKIPEDIA)
                )
        );
    }

    public static Question<String> enWikipedia (){
        Question<String> titulo = Text.of(PaginaBuscador.TITULO_WIKIPEDIA);
        System.out.println(titulo);
        return titulo;
    }

}
