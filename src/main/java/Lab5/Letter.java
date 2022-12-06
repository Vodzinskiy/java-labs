package Lab5;

public class Letter {
    private final char letter;

    static private final String vowels = "AEIOUaeiou";

    public Letter(char letter) {
        this.letter = letter;
    }

    public boolean isVowel() {
        return vowels.indexOf(letter) != -1;
    }



    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}
