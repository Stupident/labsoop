public class Computer extends Electronics {
    private String processor;

    public Computer(String model, int power, int emr, String processor) {
        super(model, power, emr);
        this.processor = processor;
    }
}
