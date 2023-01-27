package com.devco.mentoria.web.runners;

import io.cucumber.junit.*;
import net.serenitybdd.cucumber.*;
import org.junit.runner.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_informacion/busqueda_en_google.feature",
        glue = "com.devco.mentoria.web.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BusquedaEnGoogle {}
