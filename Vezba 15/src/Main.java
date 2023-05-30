//    Vezba 15
//    Dati su sledeci ulazni podaci za jedno vozilo:
//    - String carMake = "Ford";
//    - int doors = 4;
//    Potrebno je napraviti uslovnu konstrukciju koja ce da proverava da li je proizvodjac automobila Ford,
//    i ako jeste, da u zavisnosti od broja vrata prikazuje odgovarajucu poruku.


public class Main {
    public static void main(String[] args) {

        String carMake = "Ford";
        int doors = 2;

        if (carMake.equals("Ford")) {
            switch (doors) {
                case 1: {
                    System.out.println("Proizvodjac automobila je Ford i ima 1 vrata.");
                    break;
                }
                case 2: {
                    System.out.println("Proizvodjac automobila je Ford i ima 2 vrata.");
                    break;
                }
                case 3: {
                    System.out.println("Proizvodjac automobila je Ford i ima 3 vrata.");
                    break;
                }
                case 4: {
                    System.out.println("Proizvodjac automobila je Ford i ima 4 vrata.");
                    break;
                }
                case 5: {
                    System.out.println("Proizvodjac automobila je Ford i ima 5 vrata.");
                    break;
                }
                default: {
                    System.out.println("Proizvodjac automobila je Ford ali ne moze da ima taj broj vrata.");
                    break;

                }
            }
        }
    }
}

