package Lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Залікова - 0402

C3 = 0 -> StringBuilder
C17 = 11 -> Із заданого тексту видалити всі слова визначеної довжини, що починаються з приголосної літери.
 */

public class Lab3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The sun was sinking behind the mountains, and the shadows were\n" +
                "deepening in the woods, when they went on again. Their paths now went\n" +
                "into thickets where the dusk had already gathered. Night came beneath\n" +
                "the trees as they walked, and the Elves uncovered their silver lamps.");

        StringBuilder res = new StringBuilder();
        int length = 0;

        while (length<=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the word length: ");
            try {
                length = scanner.nextInt();
                if (length<=0) throw new Exception();
            } catch (Exception e) {
                System.out.println("enter an natural numbers!\n");
            }
        }

        String[] words = str.toString().split("\\b");

        for (String word: words) {
            if (!(word.length()==length && word.toLowerCase().matches("[^ aeiou][a-z]*"))) {
                res.append(word);
            }
        }

        res = new StringBuilder(Pattern.compile(" (?=[,.!?;:])|\"\"").matcher(res).replaceAll(""));
        res = new StringBuilder(Pattern.compile(" +").matcher(res).replaceAll(" "));

        Matcher matcher = Pattern.compile("\\. [a-z]").matcher(res);
        res = new StringBuilder();

        while (matcher.find()) {
            matcher.appendReplacement(res, matcher.group(0).toUpperCase());
        }
        matcher.appendTail(res);

        System.out.println("Initial text:\n\n"+str+"\n\n");
        System.out.println("Edit text:\n\n" + res);
    }
}
