package Lab5;

public class Punctuation implements WordsAndPunctuation {
    private final String punctuation;

    public Punctuation(String punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public int flag() {
        return 0;
    }

    @Override
    public boolean variantCheck() {
        return punctuation.matches("[.!?]");
    }

    @Override
    public String toString() {
        return punctuation;
    }
}
