import java.util.Scanner;

public class Rectangle extends Shape{
    double a;
    double b;

    public Rectangle(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu a pravougaonika: ");
        this.a = scanner.nextDouble();
        System.out.println("Unesite stranicu b pravougaonika: ");
        this.b = scanner.nextDouble();
    }
    @Override
    public void area() {
        System.out.println("Površina pravougaonika čije su stranice "+this.a+" i "+b+" je: "+(this.a*this.b));
    }
    @Override
    public void show(String color, String name) {
        System.out.println("Ovo je pravougaonik u boji "+color+" i zove se: "+name);
    }
}
