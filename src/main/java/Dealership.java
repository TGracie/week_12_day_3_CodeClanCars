import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> cars;
    private double till;

    public Dealership(String name, double till){
        this.name = name;
        this.till = till;
        this.cars = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public void addCarToStock(Vehicle car){
        this.cars.add(car);
    }

    public void removeFromStock(Vehicle car){
        this.cars.remove(car);
    }

    public int stockCount(){
        return this.cars.size();
    }
}
