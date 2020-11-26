package com.company;

public class Telephone extends Calculator{

    public int android;
    public double display;
    public int grosimea;

    public Telephone(String marca, String culoarea, int anul,int android, double display, int grosimea) {
        super(marca,culoarea,anul);
        this.android = android;
        this.display = display;
        this.grosimea = grosimea;
    }

    public String println() {
        return ("Android: " + this.android + ", Display: " + this.display + ", Grosimea: " + this.grosimea);
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void setGrosimea(int grosimea) {
        this.grosimea = grosimea;
    }
}