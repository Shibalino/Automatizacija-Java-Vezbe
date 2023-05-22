public class Pravougaonik extends Shape {
    double stranica_a;
    double stranica_b;

    public Pravougaonik(String boja, String naziv, double stranica_a, double stranica_b) {
        super(boja, naziv);
        this.stranica_a = stranica_a;
        this.stranica_b = stranica_b;
    }

    public void Pravougaonik_povrsina() {
        System.out.println("Ovaj pravougaonik je "+this.boja+" boje i zove se "+this.naziv+". "+"Duzina stranice A je: "+this.stranica_a+" cm, a duzina stranice B je: "+this.stranica_b+" cm.");
        System.out.println("Povrsina ovog pravougaonika je: " + (this.stranica_a * this.stranica_b)+" cm2.");
    }
}