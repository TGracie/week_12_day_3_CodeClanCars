package Parts;

public abstract class Part {

    protected String make;
    protected String model;
    protected double price;

    public Part (String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
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

}
