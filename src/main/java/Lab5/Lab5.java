package Lab5;

import java.util.Scanner;

public class Lab5 {
    private static int length = 0;

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The sun was sinking behind the mountains, and the \"shadows\" were \n" +
                                              "deepening in the woods, when they went on again? Their paths now went \n" +
                                              "into thickets where, the - dusk had already gathered. Night came beneath \n" +
                                              "the trees as they walked, and the Elves uncovered their silver lamps.");

        while (length <= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the word length: ");
            try {
                length = scanner.nextInt();
                if (length <= 0) throw new Exception();
            } catch (Exception e) {
                System.out.println("enter an natural numbers!\n");
            }
        }

        Text text = new Text(str.toString());
        System.out.println("Initial text:\n\n" + str + "\n\n");
        System.out.println("Edit text:\n\n" + text);
    }
    public static int getLength() {
        return length;
    }
}