package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    //@Before is coming form cucumber. It is running each scenario
    @Before
    public void setUpScenario(){
        System.out.println("-- It is coming from @Before in Hooks");
    }

    @After
    public void tearDownScenario(){
        System.out.println("-- It is coming from @After in Hooks");
    }
}
