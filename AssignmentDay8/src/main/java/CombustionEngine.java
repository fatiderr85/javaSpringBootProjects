package com.summitwt.maruthi.spring.di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class CombustionEngine implements Engine {
    
    private Crankshaft crankshaft;
	
	// enable constructor injection here

    @Override
    public void turnOn() {
        System.out.println("Started combustion engine");
    }
}
