package com.example.demo;

import org.springframework.stereotype.Component;

public class ElectricEngine implements Engine {
	
    private Camshaft camshaft;
    public Camshaft getCamshaft() {
		return camshaft;
	}

	public void setCamshaft(Camshaft camshaft) {
		this.camshaft = camshaft;
	}

	@Override
    public void turnOn() {
        System.out.println("Started electric engine");
    }
}
