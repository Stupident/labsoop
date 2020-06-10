public class Punctuation extends SentenceElement{
    private String separator;

    public Punctuation(String sep) {
        this.separator = sep;
    }

    @Override
    public String toString() {
        return "" + separator;
    }
}
