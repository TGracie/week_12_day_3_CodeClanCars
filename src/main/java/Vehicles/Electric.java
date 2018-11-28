package Vehicles;

import Parts.Battery;
import Parts.Motor;

public class Electric extends Vehicle{

    Motor motor;
    Battery battery;

    public Electric(String make, String model, double price, int doors, Motor motor, Battery battery){
        super(make, model, price, doors);
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
}
