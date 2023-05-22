// 1. Potrebno je napraviti jednu klasu Shape koja bi sadrzala neke podatke o geometrijskom obliku:
//    - poziciju (x,y)
//    - boju i naziv.
// 2. Potrebno je napraviti 3 klase koje nasludjuju klasu Shape - krug, kvadrat i pravouganik.
// 3. Svaka treba da sadrzi metodu za izracunavanje povrsine kao i sopstvene atribute koji su neophodni za ovo izracunavanje -
//    strane za pravougaonik i kvadrat i poluprecnik i PI konstantu za krug.


public class Main {
    public static void main(String[] args) {

        Kvadrat cecinKvadrat = new Kvadrat("plave","Cecin kvadrat",10);
        cecinKvadrat.Kvadrat_povrsina();
        System.out.println();

        Pravougaonik cecinPravougaonik = new Pravougaonik("crvene","Cecin pravougaonik",6,10);
        cecinPravougaonik.Pravougaonik_povrsina();
        System.out.println();

        Krug cecinKrug = new Krug ("zelene", "Cecin krug",10);
        cecinKrug.Krug_povrsina();

    }
}