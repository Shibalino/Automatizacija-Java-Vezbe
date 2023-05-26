public class Card {
    double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public void charge(double charge) {
        if (this.balance >= charge) {
            this.balance -= charge;
            System.out.println("Naplata uspesna: " + charge + " dinara.");
        } else {
            System.out.println("Nemate dovoljno novca na racunu. Naplata je otkazana.");
        }
    }
}


