// 1. Potrebno je napraviti jednu klasu Shape koja bi sadrzala neke podatke o geometrijskom obliku:
//    - poziciju (x,y)
//    - boju i naziv.
// 2. Potrebno je napraviti 3 klase koje nasludjuju klasu Shape - krug, kvadrat i pravouganik.
// 3. Svaka treba da sadrzi metodu za izracunavanje povrsine kao i sopstvene atribute koji su neophodni za ovo izracunavanje -
//    strane za pravougaonik i kvadrat i poluprecnik i PI konstantu za krug.


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        circle.show("crvena", "Cecin krug");
        System.out.println();
        Square square = new Square();
        square.area();
        square.show("plava", "Cecin kvadrat");
        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.show("zelena", "Cecin pravougaonik");
        }
    }