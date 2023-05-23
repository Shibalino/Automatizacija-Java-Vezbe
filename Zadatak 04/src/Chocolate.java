import java.util.Scanner;

public class Chocolate extends Product {
    double weight;

    public Chocolate(String productName, String barCode, double basePrice, double weight) {
        this.productName = productName;
        this.barCode = barCode;
        this.basePrice = basePrice;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product name: " + productName + ", Barcode: " + barCode + ", Price including VAT: " + price + " eur, Weight: " + weight + " g.";
    }
}

