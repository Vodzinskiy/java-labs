package Lab5;

public class Word implements WordsAndPunctuation {
    private final Letter[] letters;

    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : letters) {
            result.append(letter);
        }
        return result.toString();
    }

    public boolean variantCheck() {
        return !letters[0].isVowel();
    }


    @Override
    public int flag() {
        return 1;
    }
}
