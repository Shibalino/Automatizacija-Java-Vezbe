import java.util.Scanner;

public class Wine extends Product {
    double bottleVolume;
    final double vatAlcohol = 0.1;

    public Wine(String productName, String barCode, double basePrice, double bottleVolume) {
        this.productName = productName;
        this.barCode = barCode;
        this.basePrice = basePrice;
        this.bottleVolume = bottleVolume;
    }

    @Override
    public void priceCalculator() {
        this.price = (1 + vatAlcohol) * ((1 + vat) * this.basePrice);
    }

    @Override
    public String toString() {
        return "Product name: " + productName + ", Barcode: " + barCode + ", Price including VAT: " + price + " eur, Bottle volume: " + bottleVolume + " ml.";
    }
}



