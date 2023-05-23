import java.util.Scanner;
public class Circle extends Shape{
    double r;
    final double PI=3.14;

    public Circle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite poluprečnik kruga: ");
        this.r = scanner.nextDouble();

    }
    @Override
    public void area() {
        System.out.println("Površina kruga čiji je poluprečnik "+this.r+" je: "+(this.r*this.r*this.PI));
    }
    @Override
    public void show(String color, String name){
        System.out.println("Ovo je krug u boji "+color+" i zove se: "+name);
    }

}
