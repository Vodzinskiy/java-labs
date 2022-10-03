package Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {
        Cosmetic lipstick = new Cosmetic("lipstick", "L'Oréal", "red", 30, 400);
        Cosmetic mascara = new Cosmetic("mascara", "Maybelline", "black", 20, 270);
        Cosmetic nailPolish = new Cosmetic("nail polish", "Chanel", "blue", 50, 550);
        Cosmetic perfume = new Cosmetic("perfume", "Dolce&Gabbana", "yellow", 350, 1200);
        Cosmetic faceCream = new Cosmetic("face cream", "Nivea", "white", 400, 330);

        Cosmetic[] cosmetics = {lipstick, mascara, nailPolish, perfume, faceCream};

        Arrays.sort(cosmetics, Comparator.comparingInt(a -> a.getPrice()));
        System.out.println("Sort by price:\n" + Arrays.toString(cosmetics).replaceAll("[\\[,\\]]", ""));

        Arrays.sort(cosmetics, Comparator.comparing((Cosmetic a) -> a.getName()).reversed());
        System.out.println("\nSort by name (reversed):\n" + Arrays.toString(cosmetics).replaceAll("[\\[,\\]]", ""));
    }
}
