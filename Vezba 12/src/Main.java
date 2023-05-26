// Vezba 12
//  Potrebno je kreirati program za naplatu kreditnih kartica.
//  U programu postoji metod koji prihvata objekat klase Card.
//  Klasa Card ima konstruktor koji kao parametar prihvata inicijalno stanje na računu.
//  Klasa Card ima polje balance i metod charge.
//  Metod charge proverava da li na kartici ima dovoljno novca:
//  - ukoliko ima novca izvršava naplatu
//  - ukoliko nema, prikazuje korisniku da ne postoji dovoljno sredstava na računu i otkazuje naplatu.


public class Main {
    public static void main(String[] args) {
        Card kartica = new Card(500);
        kartica.charge(250);
        kartica.charge(250);
        kartica.charge(100);
        }
    }