package Parts;

public class Engine extends Part{

    private int cylinders;
    private int displacement;
    private String layout;
    private int power;

    public Engine(String make, String model, double price, int cylinders, int displacement, String layout, int power){
        super(make, model, price);
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.layout = layout;
        this.power = power;
    }

    public int getCylinder(){
        return this.cylinders;
    }

    public int getDisplacement(){
        return this.displacement;
    }

    public int getPower(){
        return this.power;
    }

    public String getLayout(){
        return this.layout;
    }
}
