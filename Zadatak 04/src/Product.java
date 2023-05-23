public abstract class Product {
    String productName;
    String barCode;
    double basePrice;
    double price;
    final double vat = 0.2;

    public void priceCalculator() {
        this.price = (1 + vat) * this.basePrice;
    }

    public String toString() {
        return "Product name: " + productName + " Barcode: " + barCode + ", Price including VAT: " + price + " eur.";
    }
}
