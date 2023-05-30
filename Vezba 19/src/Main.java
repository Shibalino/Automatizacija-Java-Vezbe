//Vezba 19

public class Main {
    public static void main(String[] args) {
        String[] pojam = {"Bicikl", "Automobil", "Mobilni telefon"};
        String[] model = {"BMX", "Ford Fiesta", "iPhone"};
        double[] cena = {400.55, 3890, 1350};

        for (int i = 0; i < 3; i++) {
            System.out.println(pojam[i] + " je tipa " + model[i] + " i kosta " + cena[i] + " EUR.");
        }

    }
}