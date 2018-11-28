package Vehicles;

import Parts.Battery;
import Parts.Engine;
import Parts.FuelTank;
import Parts.Motor;

public class Hybrid extends Vehicle{
    private Engine engine;
    private FuelTank tank;
    private Motor motor;
    private Battery battery;

    public Hybrid(String make, String model, double price, int doors, Engine engine, FuelTank tank, Motor motor, Battery battery){
        super(make, model, price, doors);
        this.engine = engine;
        this.tank = tank;
        this.motor = motor;
        this.battery = battery;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setMotor(Motor moto){
        this.motor = moto;
    }

    public Battery getBattery(){
        return this.battery;
    }

    public void setBattery(Battery b){
        this.battery = b;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public void setEngine(Engine eng){
        this.engine = eng;
    }

    public FuelTank getTank(){
        return this.tank;
    }

    public void setTank(FuelTank t){
        this.tank = t;
    }
}
