public class Electronics implements Comparable<Electronics>{
    private String model;
    private int power;
    private int emr; //electromagnetic radiation

    public Electronics(String model, int power, int emr) {
        this.model = model;
        this.power = power;
        this.emr = emr;
    }

    public int getPower(){
        return this.power;
    }
    public int getEmr(){ return this.emr; }

    public int compareTo(Electronics electron){
        return model.compareTo(electron.model);
    }

    @Override
    public String toString() {
        return "Electronics{" + getClass() +
                "   model='" + model + '\'' +
                ", power=" + power +
                ", emr=" + emr +
                '}';
    }

    public boolean equals(String electronicStr){
        return toString().equals(electronicStr);
    }
}
