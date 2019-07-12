package com.stackroute;

public class Car extends Vehicle {
    private int numberOfWeels;
    private String typeOfEngine;

    public Car(int steering, String typeOfCar, int move, int numberOfWeels, String typeOfEngine) {
        super(steering, typeOfCar, move);
        this.numberOfWeels = numberOfWeels;
        this.typeOfEngine = typeOfEngine;
    }

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public void setNumberOfWeels(int numberOfWeels) {
        this.numberOfWeels = numberOfWeels;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }


    public void soundOfHorn() {
        System.out.println("Pip pip . . .");
    }

    public void fuel() {
        if (typeOfEngine.equals("PB")) {
            System.out.println("You have a petrol car");
        }
        if (typeOfEngine.equals("ON")) {
            System.out.println("You have a diesel car");
        } else {
            System.out.println("unknown");
        }
    }

    }

