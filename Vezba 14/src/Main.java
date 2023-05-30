//    Vezba 14
//    U program ulaze sledeci podaci:
//    - int x = 523134
//    - int y = 325423
//    Potrebno je izvrsiti proveru ostatka deljenja x i y.
//    Ukoliko ne postoji ostatak prikazati poruku da ostatak ne postoji, u suprotnom proveriti da li je ostatak veci ili manji od hiljadu i prikazati odgovarajucu poruku.


public class Main {
    public static void main(String[] args) {

        int x = 523134;
        int y = 325423;
        int result = x % y;

        if (result == 0) {
            System.out.println("Ostatak prilikom deljenja brojeva " + x + " i " + y + " ne postoji.");
        } else if (result > 1000) {
            System.out.println("Ostatak prilikom deljenja brojeva " + x + " i " + y + " je veci od hiljadu.");
        } else if (result < 1000) {
            System.out.println("Ostatak prilikom deljenja brojeva " + x + " i " + y + " je manji od hiljadu.");
        }

    }
}