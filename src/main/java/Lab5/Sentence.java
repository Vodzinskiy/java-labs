package Lab5;

import java.util.Objects;

public class Sentence {
    private final WordsAndPunctuation[] wordsAndPunctuation;

    public Sentence(String sentence) {
        String[] sentenceSplit = sentence.split(" +(?=[^-])|(?=[,.!?;:]| -)");
        wordsAndPunctuation = new WordsAndPunctuation[sentenceSplit.length];

        for (int i = 0; i < sentenceSplit.length; i++) {
            if (sentenceSplit[i].replaceAll("\"", "").substring(0, 1).matches("\\w")) {
                wordsAndPunctuation[i] = new Word(sentenceSplit[i]);
            } else {
                wordsAndPunctuation[i] = new Punctuation(sentenceSplit[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordsAndPunctuation.length; i++) {
            if (wordsAndPunctuation[i].flag() == 1) {
                if (wordsAndPunctuation[i].toString().replaceAll("\"", "").length() == Lab5.getLength() && wordsAndPunctuation[i].variantCheck()) {
                    continue;
                }
                if (i != 0) {
                    result.append(" ");
                }
                result.append(wordsAndPunctuation[i]);
            } else {
                result.append(wordsAndPunctuation[i]);
                /*if (wordsAndPunctuation[i].variantCheck()) {
                    result.append(" ");
                }*/
            }
        }
        if (Objects.equals(result.substring(0, 1), " ")) {
            result.deleteCharAt(0);
            result.replace(0, 1, result.substring(0, 1).toUpperCase());
        }
        return result.toString();
    }
}