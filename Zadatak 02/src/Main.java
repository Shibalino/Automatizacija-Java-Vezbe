//    Zadatak 02
//    Napraviti program koji ce na izlazu prikazati da li je vrednost promenljive koju je korisnik uneo parna.
//    Takodje, treba da bude prikazana uneta vrednost.
//    Program moze biti resen sa hardkodiranom vrednoscu ili pravim unosom korisnika.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite vrednost promenljive:");
        int x = scanner.nextInt();
        if (x%2==0) {
            System.out.println("Promenljiva je parna.");
        } else {
            System.out.println("Promenljiva nije parna.");
        }
    }
}