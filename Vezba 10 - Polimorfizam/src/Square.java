import java.util.Scanner;

public class Square extends Shape{
    double a;

    public Square(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu kvadrata: ");
        this.a = scanner.nextDouble();
    }
    @Override
    public void area() {
        System.out.println("Površina kvadrata čija je stranica "+this.a+" je: "+(this.a*this.a));
    }
    @Override
    public void show(String color, String name) {
        System.out.println("Ovo je kvadrat u boji "+color+" i zove se: "+name);

    }
}
