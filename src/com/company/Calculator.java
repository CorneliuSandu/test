package com.company;

public class Calculator {
    public String marca;
    public String culoarea;
    public int anul;

    public Calculator(String marca, String culoarea, int anul) {

        this.marca = marca;
        this.culoarea = culoarea;
        this.anul = anul;
    }

    public String println(){
        return ("Marca: "+ this.marca + ", Culoarea: " + this.culoarea + ", Anul: " + this.anul);
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    private void setAnul(int anul){
        this.anul = anul;
    }

}

