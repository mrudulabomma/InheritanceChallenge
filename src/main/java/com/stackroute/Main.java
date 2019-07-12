package com.stackroute;

public class Main {
    public static void main(String[] args){
        Vehicle wehicle = new Vehicle(1,"Cabrio",210);
        Car car = new Car(1,"Pickup",180,4,"ON");
        HondaCity dacia = new HondaCity(4441,"SUV",200,4,"ON");

        wehicle.soundOfHorn();
        wehicle.topSpeed();
        System.out.println( wehicle.getTypeOfCar());
        System.out.println("------------------------");

        car.fuel();
        car.soundOfHorn();
        System.out.println("------------------------");
        dacia.fuel();
        dacia.soundOfHorn();
    }
}
