public class Krug extends Shape {
    double poluprecnik;
    static double PI = 3.14;


    public Krug(String boja, String naziv, double poluprecnik) {
        super(boja, naziv);
        this.poluprecnik = poluprecnik;
    }

    public void Krug_povrsina() {
        System.out.println("Ovaj krug je " + this.boja + " boje i zove se " + this.naziv + ". " + "Duzina poluprecnika je: " + this.poluprecnik + " cm.");
        System.out.println("Povrsina ovog kruga je: " + (this.poluprecnik * this.poluprecnik * PI) + " cm2.");
    }
}
