//    Vezba 18
//    Potrebno je kreirati niz stringova ko sadrzi sledece stringove: "Skocko", "Tref", "Pik", "Herc", "Karo", "Zvezda".
//    U nastavku programa treba kreirati sistem za generisanje kombinacija (pomocu random izbora racunara).
//    Potrebno je da program pokaze dobijenu kombinaciju znakova na izlazu.


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] kombo = {"Skocko", "Tref", "Pik", "Herc", "Karo", "Zvezda"};
        System.out.println("Kombinacija je: ");
        for (int i=0; i<kombo.length; i++){
            Random randomKombo = new Random();
            int r = randomKombo.nextInt(kombo.length);
            System.out.print(kombo[r]+" ");
        }
    }
}