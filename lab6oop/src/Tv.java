public class Tv extends Electronics{
    private int diagonale;

    public Tv(String model, int power, int emr, int diagonale) {
        super(model, power, emr);
        this.diagonale = diagonale;
    }
}
