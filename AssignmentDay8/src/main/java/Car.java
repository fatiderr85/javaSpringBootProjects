package com.summitwt.maruthi.spring.di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car {

    private Engine engine;
    
   // enable setter injection here
   
    public void start() {
        engine.turnOn();
    }
}
