public class Fridge extends Electronics{
    private int size;

    public Fridge(String model, int power, int emr, int size) {
        super(model, power, emr);
        this.size = size;
    }
}
