package Parts;

public class Battery extends Part {
    private int capacity;

    public Battery(String make, String model, double price, int capacity){
        super(make, model, price);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
