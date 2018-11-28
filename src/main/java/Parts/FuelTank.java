package Parts;

public class FuelTank extends Part {

    private int volume;

    public FuelTank(String make, String model, double price, int volume){
        super(make, model, price);
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
}
