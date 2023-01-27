package com.devco.mentoria.web.stepdefinitions;

import com.devco.mentoria.web.tasks.*;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.*;

public class BusquedaEnGoogleStepDefinitions {

    @Cuando("el usuario busca en google empanada para mirar su definicion de wikipedia")
    public void elUsuarioBuscaEnGoogleEmpanadaParaMirarSuDefinicionDeWikipedia() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Buscar.enGoogle("empanada")
        );
    }

    @Entonces("el usuario idenficia la fecha de creacion de la empanada en wikipedia")
    public void elUsuarioIdenficiaLaFechaDeCreacionDeLaEmpanadaEnWikipedia() {

    }

    @Entonces("el usuario trae en consola el título de Empanada")
    public void elUsuarioTraeTituloEmpanada(){
        OnStage.theActorInTheSpotlight().asksFor(
                Buscar.enWikipedia()
        );
    }

}
