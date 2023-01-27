package com.devco.mentoria.web.stepdefinitions;

import io.cucumber.java.*;
import net.serenitybdd.screenplay.actors.*;

public class ActorConfiguration {

    @Before
    public void configActor(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Laura");
    }

}
