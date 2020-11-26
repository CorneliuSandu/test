package com.company;

public class Modele extends Calculator {

    private String model;
    private String monitor;



    public Modele(String marca, String culoarea, int anul, String model, String monitor){
        super(marca, culoarea, anul);
        this.model = model;
        this.monitor = monitor;
    }

    public  void setModel(String model){
        this.model = model;
    }

    public  void setMonitor(String monitor){
        this.monitor = monitor;
    }

    public String getModel(){
        return model;
    }


}
