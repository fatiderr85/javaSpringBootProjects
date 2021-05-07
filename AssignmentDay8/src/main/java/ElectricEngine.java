package com.summitwt.maruthi.spring.di.domain;

import org.springframework.stereotype.Component;

public class ElectricEngine implements Engine {
	
    private Camshaft camshaft;
	
	// enable filed injection here,
    @Override
    public void turnOn() {
        System.out.println("Started electric engine");
    }
}
