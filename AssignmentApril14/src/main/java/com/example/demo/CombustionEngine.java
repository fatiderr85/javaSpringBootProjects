package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class CombustionEngine implements Engine {
    
    private Crankshaft crankshaft;

    public Crankshaft getCrankshaft() {
		return crankshaft;
	}

	public void setCrankshaft(Crankshaft crankshaft) {
		this.crankshaft = crankshaft;
	}

	@Override
    public void turnOn() {
        System.out.println("Started combustion engine");
    }
}
