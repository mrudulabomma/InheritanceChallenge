package com.stackroute;

public class HondaCity extends Car  {
    private String model;
    private int sizeOfWeels;

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getSizeOfWeels()
    {
        return sizeOfWeels;
    }

    public void setSizeOfWeels(int sizeOfWeels)
    {
        this.sizeOfWeels = sizeOfWeels;
    }

    public HondaCity(int steering, String typeOfCar, int move, int numberOfWeels, String typeOfEngine)
    {
        super(steering, typeOfCar, move, numberOfWeels, typeOfEngine);
    }

    @Override
    public void fuel()
    {
        super.fuel();
    }

    public void soundOfHorn()
    {
        System.out.println("Dacia pip . . .");
    }
}
