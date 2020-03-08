package pl.sda.zamowienia;

public class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String toUpperCase(String name) {
        return name.toUpperCase();
    }

    public void setName(String name) throws NameProductException {
        if (!name.equals(name.toUpperCase())) {
            throw new NameProductException("Użyj dużych liter");
        } else {
            this.name = name.toUpperCase();
        }

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

