package com.stackroute;

public class Vehicle {

    private int steering;
    private String typeOfCar;
    private int move;

    public int getSteering()
    {
        return steering;
    }

    public void setSteering(int steering)
    {
        this.steering = steering;
    }

    public String getTypeOfCar()
    {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar)
    {
        this.typeOfCar = typeOfCar;
    }

    public int getMove()
    {
        return move;
    }

    public void setMove(int move)
    {
        this.move = move;
    }

    public Vehicle(int steering, String typeOfCar, int move)
    {
        this.steering = steering;
        this.typeOfCar = typeOfCar;
        this.move = move;
    }

    public void soundOfHorn()
    {
        System.out.println("Bip bip. . .");
    }

    public void topSpeed()
    {
        System.out.println("Top speed of car :" + getMove());
    }
}
