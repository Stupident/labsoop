public class Microwave extends Electronics {
    private boolean grill;

    public Microwave(String model, int power, int emr, boolean grill) {
        super(model, power, emr);
        this.grill = grill;
    }


}
