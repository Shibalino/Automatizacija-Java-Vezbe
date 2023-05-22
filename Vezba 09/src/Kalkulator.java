// Vezba 09
// Potrebno je kreirati klasu kalkulator koja ima dva svojstva: operand1 i operand2.
// Klasa poseduje metode:
// - add, koja kao rezultat vraca zbir dva operanda
// - sub, koja kao rezultat vraca razliku dva operanda
// - mul, koja kao rezultat vraca proizvod dva operanda
// - div, koja kao rezultat vraca kolicnik dva operanda
// Sve vrednosti su tipa double.


import java.util.Scanner;

public class Kalkulator {
    double operand1;
    double operand2;
    Scanner scanner;

    public Kalkulator (){
        scanner = new Scanner(System.in);
        System.out.println("Unesite jedan broj: ");
        operand1=scanner.nextDouble();
        System.out.println("Unesite jos jedan broj: ");
        operand2=scanner.nextDouble();
        }

    public void add() {
        System.out.println("Zbir dva uneta broja je: "+(operand1+operand2));
    }

    public void sub() {
        System.out.println("Razlika dva uneta broja je: "+(operand1-operand2));
    }

    public void mul(){
        System.out.println("Proizvod dva uneta broja je: "+(operand1*operand2));
    }

    public void div(){
        System.out.println("Kolicnik dva uneta broja je: "+(operand1/operand2));
    }

}




