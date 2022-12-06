package Lab4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Lab4 {
    public static void main(String[] args) {
        Cosmetic lipstick = new Cosmetic("lipstick", "L'Oréal", "red", 30, 400);
        Cosmetic mascara = new Cosmetic("mascara", "Maybelline", "black", 20, 270);
        Cosmetic nailPolish = new Cosmetic("nail polish", "Chanel", "blue", 50, 550);
        Cosmetic perfume = new Cosmetic("perfume", "Dolce&Gabbana", "yellow", 350, 1200);
        Cosmetic faceCream = new Cosmetic("face cream", "Nivea", "white", 400, 330);

        Cosmetic[] cosmetics = {lipstick, mascara, nailPolish, perfume, faceCream};

        Arrays.sort(cosmetics, Comparator.comparingInt(Cosmetic::getPrice));
        Arrays.sort(cosmetics, Comparator.comparingInt(new ToIntFunction<Cosmetic>() {
            @Override
            public int applyAsInt(Cosmetic value) {
                return value.getPrice();
            }
        }));
        Arrays.sort(cosmetics, Comparator.comparingInt(value -> value.getPrice()));
        System.out.println("Sort by price:\n" + Arrays.toString(cosmetics).replaceAll("[\\[,\\]]", ""));

        Arrays.sort(cosmetics, Collections.reverseOrder(Comparator.comparing(a -> a.getName())));
        System.out.println("\nSort by name (reversed):\n" + Arrays.toString(cosmetics).replaceAll("[\\[,\\]]", ""));
    }
}
