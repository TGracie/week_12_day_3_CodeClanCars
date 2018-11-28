package Parts;

public class Motor extends Part {

    private int rating;

    public Motor(String make, String model, double price, int rating){
        super(make, model, price);
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }
}
