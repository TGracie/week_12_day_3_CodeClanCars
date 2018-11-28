package Vehicles;

import Parts.Engine;
import Parts.FuelTank;

public class Petrol extends Vehicle{

    private Engine engine;
    private FuelTank tank;

    public Petrol(String make, String model, double price, int doors, Engine engine, FuelTank tank){
        super(make, model, price, doors);
        this.engine = engine;
        this.tank = tank;
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
