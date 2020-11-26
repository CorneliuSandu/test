package com.company;

public class Main {
    public static void main(String[] args) {
        Calculator hit = new Calculator("Benq", "Negru", 2017);
        Telephone hih = new Telephone("Benq", "Negru", 2017, 5, 55, 3);

        System.out.println(hih.println());
        System.out.println(hit.println());
    }
}