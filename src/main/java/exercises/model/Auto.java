package exercises.model;

// 1. Utwórz klasę auto w której zadeklaruje następujące pola
// - brand
// - model
// - engine {1.5, 1.9, 2.0, 3.0}
// - fuel {diesel, gasoline, hybrid}
// - price
// 2. Wykorzystaj model java beans
// ALT + Ins -> constructor, getters & setters, toString
public class Auto {
    private String brand, model;
    private Engine engineType;
    private Fuel fuelType;
    private double price;

    public Auto(String brand, String model, Engine engineType, Fuel fuelType, double price) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", fuelType=" + fuelType +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
