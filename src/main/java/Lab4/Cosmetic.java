package Lab4;

public class Cosmetic {
    private String name;
    private String brand;
    private String color;
    private int mass;
    private int price;

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
