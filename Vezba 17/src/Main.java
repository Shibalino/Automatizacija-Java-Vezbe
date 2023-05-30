//    Vezba 17
//    Program zamislja broj i pita nas koji je broj zamislio, zatim nam nudi unet broj sa tastature.
//    Ukoliko pogodimo zamisljeni broj, racunar nam potvrdjuje, zamislja novi broj i nastavlja proceduru.
//    Ukoliko ne pogodimo, program nas obavestava da nismo pogodili i nudi mogucnost unosa novog broja.
//    Hint: da bi od racunara dobili slucajan broj, mozemo koristiti klasu "Random".


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Random random = new Random();
            int zamisljenBroj = random.nextInt(3);

            System.out.println("Pokusajte da pogodite koji broj od 1 do 3 sam zamislila!");
            System.out.println("Unesite broj: ");
            int unetBroj = scanner.nextInt();

            if (unetBroj == zamisljenBroj) {
                System.out.println("Tacno je, zamislila sam broj " + zamisljenBroj + "!");
                continue;
            } else {
                System.out.println("Niste pogodili, pokusajte opet!");
            }

        }
    }
}

