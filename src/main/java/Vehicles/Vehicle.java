package Vehicles;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected double price;
    protected int doors;

    public Vehicle(String make, String model, double price, int doors){
        this.make = make;
        this.model = model;
        this.price = price;
        this.doors = doors;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public double getPrice(){
        return this.price;
    }

    public int getDoors(){
        return this.doors;
    }
}
