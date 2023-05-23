//Zadatak 04
//        1. Potrebno je napraviti klasu "Product" koja će predstavljati osnovu za dalje nasleđivanje i neće se moći instancirati.
//        2. Ovu klasu nasleđuju dve klase koje predstavljaju konkretne grupe proizvoda:
//           - "Chocolate",
//           - "Wine".
//        3. Svaki proizvod poseduje određene osobine: naziv proizvoda, bar kod, osnovnu cenu i porez.
//        4. Takođe, svaki proizvod poseduje i metodu za računanje cene, koje se izračunava kada se osnovna cena uveća za iznos poreza.
//        5. Porez (PDV) za svaki proizvod je 20% i ovo je podatak koji je konstantan i neće se menjati.
//        6. Ipak, proizvodi iz grupe vina, imaju i dodatni porez, pošto spadaju u grupu alkoholnih pića, i on iznosi 10% od cene već uvećane za iznos PDV-a.
//           I ovo je podatak koji je konstantan i neće se menjati. Zbog ovoga je potrebno redefinisati metodu za računanje cene u okviru klase "Wine".
//        7. Pored ovoga, klasa "Wine" bi trebalo da poseduje atribut koji definiše zapreminu boce, a klasa "Chocolate" atribut koji definiše težinu.
//        8. U klasama "Chocolate" i "Wine" je potrebno napraviti parametrizovane konstruktore za kreiranje objekata.
//        9. Potrebno je, takođe, u klasama redefinisati metodu "toString" za prikaz informacija o objektu.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chocolate name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter chocolate barcode: ");
        String barCode = scanner.nextLine();
        System.out.println("Enter chocolate base price (eur): ");
        double basePrice = scanner.nextDouble();
        System.out.println("Enter chocolate weight (g): ");
        double weight = scanner.nextInt();
        Chocolate chocolate = new Chocolate(productName, barCode, basePrice, weight);
        chocolate.priceCalculator();
        System.out.println("Price of chocolate with VAT is " + chocolate.price + " eur.");
        String a = chocolate.toString();
        System.out.println(a);
        System.out.println();

        System.out.println("Enter wine name: ");
        String productName1 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter wine barcode: ");
        String barCode1 = scanner.nextLine();
        System.out.println("Enter wine base price (eur): ");
        double basePrice1 = scanner.nextDouble();
        System.out.println("Enter wine bottle volume (ml): ");
        double bottleVolume1 = scanner.nextInt();
        Wine wine = new Wine(productName1, barCode1, basePrice1, bottleVolume1);
        wine.priceCalculator();
        System.out.println("Price of wine with VAT is " + wine.price + " eur.");
        String b = wine.toString();
        System.out.println(b);
    }
}
