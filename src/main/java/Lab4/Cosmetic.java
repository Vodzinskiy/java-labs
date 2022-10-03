package Lab4;

public class Cosmetic {
    private final String name;
    private final String brand;
    private final String color;
    private final int mass;
    private final int price;

    public Cosmetic(String name, String brand, String color, int mass, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.mass = mass;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + name + " | " + brand + " | " + color + " | " + mass + " | " + price;
    }
}
