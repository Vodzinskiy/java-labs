package Lab5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Text {

    private final Sentence[] sentences;

    public Text(String text) {
        String[] sentences = text.split("(?<=[.!?])\\s");
        this.sentences = new Sentence[sentences.length];
        for (int i = 0; i < this.sentences.length; i++) {
            this.sentences[i] = new Sentence(sentences[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            Arrays.stream(sentences).map(Sentence::toString).collect(Collectors.joining(" "));
            result.append(sentence);
        }
        return Arrays.stream(sentences).map(Sentence::toString).collect(Collectors.joining(" "));
    }
}
